package java_lab8;
public class Transaction {
    private Account sender;
    private Account reciver;
    private int ammount;
    private String additionalInfo;
    public Transaction(){}
    public Transaction(Account sen,Account rec,int ammount,String Info){
        this.sender=sen;
        this.reciver=rec;
        this.ammount=ammount;
        this.additionalInfo=Info;

    }
    public void showInfo(){
        System.out.println("Transaction Details : "+this.additionalInfo);
        System.out.println("Sender : "+this.sender.getName());
        System.out.println("Reciever : "+this.reciver.getName());
        System.out.println("Transaction Ammount : "+ammount);
    }
            
}
