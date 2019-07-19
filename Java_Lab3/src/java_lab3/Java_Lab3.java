package java_lab3;
public class Java_Lab3 {
    public static void main(String[] args) {
        Book B1 = new Book("Harry porter","JK Rolling","111","Magic",3);
        Book B2 = new Book("Himu","Iqbal","222","Imagination",10);
        B1.showInfo();
        B1.addBookCopy(50);
        B1.showInfo();
        B2.showInfo();
        B2.addBookCopy(30);
        B2.showInfo();
        

    }
    
}
