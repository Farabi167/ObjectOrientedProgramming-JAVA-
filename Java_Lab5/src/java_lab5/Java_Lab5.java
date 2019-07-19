package java_lab5;
public class Java_Lab5 {
    public static void main(String[] args) {
        Mobile M1 = new Mobile("Ahmed Shah Abdal","01789949719",0.0,"Android",false);
        Mobile M2 = new Mobile("Lucifer Farabi","01521469259",0.0,"ios",true);
        M1.showInfo();
        M1.recharge(50);
        M1.callSomeone(2);
        M2.showInfo();
        M2.callSomeone(5);
        M2.recharge(10);
    }
    
}
