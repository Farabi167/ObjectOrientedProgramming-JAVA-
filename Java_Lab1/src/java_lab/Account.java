package java_lab;
public class Account {
    private String acName = "";
    private String acId = "";
    private double balance = 0.0;
    
    public Account(){}
    public Account(String name, String id, double balance)
    {
        this.acId=id;
        this.acName=name;
        this.balance=balance;
        System.out.println("Account created.");
    
    }
    public void deposit(double amount){this.balance+=amount;}
    public void withdraw(double amount){this.balance-=amount;}
    public void showInfo(){
        System.out.println("Account Details -");
        System.out.println("A/C No. : "+ this.acId);
        System.out.println("A/C Name : "+ this.acName);
        
        System.out.printf("A/c Balance : %.2f\n",balance);
        
        System.out.println("A/c Balance : "+ this.balance);
    }
}
