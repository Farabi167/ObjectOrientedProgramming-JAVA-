package java_lab_7;
public class Account{
    private String accName = "";
    private String accId = "";
    private double balance = 0.0;
    private Transaction[] listOfTransaction;
    private int totalNumberOfTransaction=0;
    
    public Account(){}
    public Account(String name, String id, double balance)
    {
        this.accId=id;
        this.accName=name;
        this.balance=balance;
        System.out.println("Account created.");
        listOfTransaction=new Transaction[100];
    }
    public void deposit(double amount){
        this.balance+=amount;
        Transaction t1=new Transaction(this,this,(int)amount,"Deposit");
        this.addTransaction(t1);
    }
    public void withdraw(double amount){
        this.balance-=amount;
        Transaction t1=new Transaction(this,this,(int)amount,"WithDraw");
        this.addTransaction(t1);
    }
    public void showInfo(){
        System.out.println("Account Details -");
        System.out.println("A/C No. : "+ this.accId);
        System.out.println("A/C Name : "+ this.accName);
        System.out.printf("A/c Balance : %.2f\n",balance);
        System.out.println("A/c Balance : "+ this.balance);
    } 
    public String getName(){
        return this.accName;
    }
    public void addTransaction(Transaction t){
        this.totalNumberOfTransaction++;
        this.listOfTransaction[this.totalNumberOfTransaction]=t;
    }
    public void showAllTransaction(){
        System.out.println("All Transaction Details :");
        for (int i=1;i<=this.totalNumberOfTransaction;i++){
            System.out.println(i+".");
            this.listOfTransaction[i].showInfo();
        }
    }
    public void transferMoney(int ammount,Account reciever){
        this.balance-=ammount;
        Transaction t1=new Transaction(this,reciever,(int)ammount,"Sent");
        this.addTransaction(t1);
        reciever.sentMoney(ammount,this);
    }
    public void sentMoney(int ammount,Account sender){
        this.balance+=ammount;
        Transaction t1=new Transaction(sender,this,(int)ammount,"Recieve");
        this.addTransaction(t1);
    }
}
