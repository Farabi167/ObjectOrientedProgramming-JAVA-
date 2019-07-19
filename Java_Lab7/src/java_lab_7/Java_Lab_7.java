package java_lab_7;
public class Java_Lab_7 {
    public static void main(String[] args) {
        Account a1 = new Account("Abdal","111",50000);
        Account a2 = new Account("Lucifer","222",30000);
        
        a1.transferMoney(5000, a2);
        
        a1.deposit(500);
        a1.showAllTransaction();
        a1.showInfo();
        
        a2.withdraw(1000);
        a2.showInfo();
        a2.showAllTransaction();
    }
    
}
