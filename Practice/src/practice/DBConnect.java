package practice;

import java.sql.*;
import javax.swing.JOptionPane;
import java.util.ArrayList;


class DBConnect {
    private Connection cn;
    private Statement st;
    private ResultSet rs;
    
    public DBConnect(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/permitteddriving","root","");
            st=cn.createStatement();
        }
        catch(Exception e){
            System.out.println("Error!"+e);
            e.printStackTrace();
        }
    }
    
    /*public void insertIntoDB(ArrayList row){
        try{
            String query = "insert into student (ID,Name,CGPA,Major) values ('"+row.get(0)+"','"+row.get(1)+"',"+row.get(2)+",'"+row.get(3)+"');";
            //String query = "insert into student (ID,Name,CGPA,Major) values('"+row.get(0)+"','"+row.get(1)+"',"+row.get(2)+",'"+row.get(3)+"');";
            System.out.println(query);
            st.executeUpdate(query);
            //st.executeQuery(query);
            JOptionPane.showMessageDialog(null, "Student Info Added Succesfully!");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Exception!");
            System.out.println(e);
        }
    }*/
    public boolean checkValidityFromDB(String s){;
        try{
            String query="select * from Drivers;";
            rs=st.executeQuery(query);
            
            while (rs.next()){
                //System.out.println("Done");
                if(rs.getString("ID").equals(s)){
                    if(rs.getDate("ExpireDate").getTime()>=System.currentTimeMillis()){
                        return true;
                    }
                    else
                        return false;
                }
                else
                    continue;
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Exception!");
            System.out.println(e);            
        }
        return false;
    }
}
