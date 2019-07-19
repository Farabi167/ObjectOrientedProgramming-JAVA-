package java_lab9;
//String inputString1 = "23 01 1997";
//Date input.
public class Java_Lab9 {
    public static void main(String[] args) {
        
        Account a11 = new Account("Libary","111",50000);
        Account a21 = new Account("Abdal","222",30000);
        Account a22 = new Account("Lucifer","333",30000);
        Account a23 = new Account("Farabi","444",30000);
        Account a24 = new Account("Prome","555",30000);
        
        Student s1 = new Student("Abdal","17-34448-1","Badda", 3.92f,(byte)77,'M',a21);
        Student s2 = new Student("Lucifer","17-36668-1","Badda", 3.92f,(byte)77,'M',a22);
        Student s3 = new Student("Farabi","17-37778-1","Badda", 3.92f,(byte)77,'M',a23);
        Student s4 = new Student("Prome","17-35558-1","Dinajpur", 3.84f,(byte)64,'F',a24);
        
        Libary L1 = new Libary("Bisshow kosh","Gulsan-1");
        Book b1 = new Book("Harry porter","JK Rolling","111","Magic",2);
        Book b2 = new Book("Harry ","JK Rolling","111","Magic",6);
        Book b3 = new Book("porter","JK Rolling","111","Magic",9);
        L1.addNewBook(b1);
        L1.addNewBook(b2);
        L1.addNewBook(b3);
        
        L1.showLibraryInfo();
        
        L1.borrowBook(b1,"23 01 1997",s4);
        L1.borrowBook(b2,"23 01 1997",s4);
        L1.borrowBook(b3,"23 01 1997",s4);
        L1.borrowBook(b3,"23 01 1997",s4);
        L1.borrowBook(b2,"23 01 1997",s4);
        L1.returnBook(b2,"29 01 1997",s4);
        
        s4.getAccount().showLibaryCharge();
        
        s4.payLibaryFine(10, a11);
        
        s4.getAccount().showLibaryCharge();
        
        s4.getAccount().showTotalFineRecord();
        
        L1.returnBook(b1,"31 01 1997",s4);
        s4.getAccount().showLibaryCharge();
        s4.payLibaryFine(30, a11);
        
        s4.getAccount().showLibaryCharge();
        
        s4.getAccount().showTotalAmmountOfFine();
        
        L1.returnBook(b3,"26 02 1997",s4);
        s4.getAccount().showLibaryCharge();
        L1.excuseCharge(s4, 50);
        s4.getAccount().showLibaryCharge();
        s4.payLibaryFine(145, a11);
        s4.getAccount().showLibaryCharge();
        
        L1.borrowBook(b1,"23 01 1997",s3);
        L1.borrowBook(b2,"23 01 1997",s2);
        //s4.showDetails();
        L1.showAllBorrowInfo();
        L1.showLibraryInfo();
        


    }
    
}
