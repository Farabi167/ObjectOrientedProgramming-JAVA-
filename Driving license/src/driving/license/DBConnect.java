package driving.license;

import java.sql.*;
import javax.swing.JOptionPane;
import java.util.logging.Level;
import java.util.logging.Logger;


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
    
    public ResultSet getUnAuthorizedAccess(){
        try{
            String query="select * from Unauthorizeddrivers;";
            //st.executeUpdate(query);
            rs=st.executeQuery(query);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Exception!");
            System.out.println(e);
        }
        return rs;
    }
    
    public boolean removeMember(String name,String did){
        try{
            String query="select * from Drivers;";
            //st.executeUpdate(query);
            rs=st.executeQuery(query);  
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Exception!");
            System.out.println(e);
        }
        try {
            while(rs.next()){
                if(rs.getString("DID").toString().equals(did)&&rs.getString("Name").toString().equals(name)){
                    try{
                        String query="Delete from Drivers where DID='"+did+"';";
                        //
                        System.out.println(query);
                        st.executeUpdate(query);
                        return true;
                    }catch(Exception e){
                        JOptionPane.showMessageDialog(null, "Exception!");
                        System.out.println(e);
                    }
                }
                else
                    return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DBConnect.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Exception!");
            System.out.println(ex);            
        }
        return true;
    }
    
    public ResultSet getAdminShortDetails(){
        try{
            String query="select * from Drivers;";
            //st.executeUpdate(query);
            rs=st.executeQuery(query);  
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Exception!");
            System.out.println(e);
        }
        return rs;
    }
    
    public boolean insertInformationIntoDB(String name,String password,String contactno,String email,String DID,String expiredate){
        try{
            String query = "insert into Drivers (DID,Name,Password,ContractNumber,Email,ExpireDate) values ('"
                +DID+"','"+name+"','"+password+"','"+contactno+"','"+email+"',"+expiredate+");";
            st.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Driver Info Added Succesfully!");
            return true;
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Database insertion exception!");
            System.out.println(e);
        }
        return false;
    }
    
    public boolean checkValidityFromDB(String s){;
        try{
            String query="select * from Drivers;";
            rs=st.executeQuery(query);
            
            while (rs.next()){
                //System.out.println("Done");
                if(rs.getString("DID").equals(s)){
                    if(rs.getDate("ExpireDate").getTime()>=System.currentTimeMillis()){
                        return true;
                    }
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
