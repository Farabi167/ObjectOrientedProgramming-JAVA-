package java_lab9;
public class Account{
    private String accName = "";
    private String accId = "";
    private double balance = 0.0;
    private double libaryCharge=0.0;
    private Transaction[] listOfTransaction;
    private int totalNumberOfTransaction=0;
    
    public Account(){}
    public Account(String name, String id, double balance){
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
        if(this.balance>amount){
            this.balance-=amount;
            Transaction t1=new Transaction(this,this,(int)amount,"WithDraw");
            this.addTransaction(t1);
        }  
        else
            System.out.println("You request exceeding the limit!");
    }
    
    public void showInfo(){
        System.out.println("Account Details -");
        System.out.println("A/C No. : "+ this.accId);
        System.out.println("A/C Name : "+ this.accName);
        System.out.printf("A/c Balance : %.2f\n",balance);
        System.out.println("A/c Balance : "+ this.balance);
    } 
    public void showTotalFineRecord(){
        for(int i=0;i<this.totalNumberOfTransaction;i++)
            if(this.listOfTransaction[i].getTransactionDetails().equals("Libary fine")){
                this.listOfTransaction[i].showInfo();
            }
    }
    public void showAllTransaction(){
        System.out.println("All Transaction Details :");
        for (int i=0;i<=this.totalNumberOfTransaction;i++){
            System.out.println(i+".");
            this.listOfTransaction[i].showInfo();
        }
    }
    public void showLibaryCharge(){
        System.out.println("Your total Libary fine remaining :"+this.libaryCharge);
    }
    public void showTotalAmmountOfFine(){
        int totalFine=0;
        for(int i=0;i<this.totalNumberOfTransaction;i++)
            if(this.listOfTransaction[i].getTransactionDetails().equals("Libary fine")){
                totalFine+=this.listOfTransaction[i].getAmmount();
            }
        System.out.println(this.accName+"'s total Libary fine is "+totalFine);
    }
    
    protected void updateBalance(double ammount){
        this.balance-=ammount;
    }
    
    public String getName(){
        return this.accName;
    }
    public double getBalance(){return this.balance;}
    
    public void addTransaction(Transaction t){
        this.listOfTransaction[this.totalNumberOfTransaction]=t;
        this.totalNumberOfTransaction++;
    }
    public void addLibaryFine(long ammount){
        this.libaryCharge=(ammount*10);
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
    
    public void modifyLiaryFine(int percentage){
        this.libaryCharge-=((double)this.libaryCharge*((double)percentage/100));
    }
    public void payLibaryFine(int ammount,Account rec){
        this.balance-=ammount;
        Transaction t1=new Transaction(this,rec,ammount,"Libary fine");
        this.addTransaction(t1);
        rec.sentMoney(ammount,this);
        this.libaryCharge-=ammount;
    }
}
