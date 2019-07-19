package practice;

import gui_driving_license.Login;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Practice {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        //String s=sc.next();
        String s = "NM0011343L00004";
        if (s.length()==15||s.equals("17-34448-1")){
            DBConnect cn =new DBConnect();
            if(s.equals("17-34448-1")){
                System.out.println("Admin Entered!");
                Login l = new Login();
            }
            else{
                if(cn.checkValidityFromDB(s)){
                    System.out.println("Chalu Hoise!");
                }   
                else{
                    System.out.println("Dara Tor khobor ase hala!");
                }
            }                                 
        }
        else
            JOptionPane.showMessageDialog(null, "Bal dissis..!");
    }
}
