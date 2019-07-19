package java_lab;
public class MainClass {
    public static void main(String[] args) {
        Account ac1 = new Account("Abdal","123",5000.82);
        ac1.showInfo();
        ac1.deposit(500.00);
        ac1.showInfo();
        ac1.withdraw(5000.00);
        ac1.showInfo();
    }
    
}
