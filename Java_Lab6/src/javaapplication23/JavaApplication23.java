package javaapplication23;

public class JavaApplication23 {


    public static void main(String[] args) {
        //Book listOfBook[]=new Book[2];
        Libary L1 = new Libary("Bisshow kosh","Gulsan-1");
        Book b1 = new Book("Harry porter","JK Rolling","111","Magic",3);
        Book b2 = new Book("Harry ","JK Rolling","111","Magic",6);
        Book b3 = new Book("porter","JK Rolling","111","Magic",9);
        L1.addNewBook(b1);
        L1.addNewBook(b2);
        L1.addNewBook(b3);
        L1.showLibraryInfo();
        L1.deleteBook(b3);
        L1.showLibraryInfo();
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    
    
}

    
}
