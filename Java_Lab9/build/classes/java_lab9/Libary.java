package java_lab9;

public class Libary {
    private String libName="";
    private String libAddress="";
    private Book[] listOfBook;
    private int totalBook=0;
    private Book borrowBook[];
    private byte totalBorrowedBook=0;
    private LibaryRecord record[];
    private int totalLibaryRecord=0;
    
    public Libary(){
        borrowBook =new Book[5];record =new LibaryRecord[100];
    }
    public Libary(String libName,String libAddress){
        this.libName=libName;
        this.libAddress=libAddress;
        listOfBook=new Book[100];
        borrowBook =new Book[5];
        record =new LibaryRecord[100];
    }
    
    public void showLibraryInfo(){
        System.out.println("Libary Name : " +this.libName);
        System.out.println("Libary Address : " +this.libAddress);
        System.out.println("Total Number of Books : " +this.totalBook);
        for (int i=0;i<this.totalBook;i++)
        {
            System.out.println((i+1)+".");
            this.listOfBook[i].showInfo();
        }
        
    }
    public void showAllBorrowInfo(){
        System.out.println("Total number of books borrowed : "+this.totalBorrowedBook+"\nBooks are:");
        for (int i=0;i<this.totalBorrowedBook;i++){
            System.out.println(this.borrowBook[i].getBookName());
        }
        for(int i=0;i<this.totalLibaryRecord;i++){
            this.record[i].showInfo();
        }
    }
    
    public void addNewBook(Book book){
        listOfBook[totalBook]=book;
        totalBook++;
    }
    public void addNewBookCopy(Book Book, int copy){
        Book.addBookCopy(copy);
    }
    public void addRecord(LibaryRecord r){
        this.record[this.totalLibaryRecord]=r;
        this.totalLibaryRecord++;
    }
    public void deleteBook(Book Book){
        for(int i=0;i<this.totalBook;i++)
        {
            if (Book==this.listOfBook[i])
            {
                for (;i<this.totalBook-1;i++)
                {
                    this.listOfBook[i]=this.listOfBook[i+1];
                }
            }
        }
        this.totalBook--;
    }
    
    public void borrowBook(Book b1,String bDate,Student s){
        if(b1.getBookCopy()>1){
            boolean flag=false;
            for(int i=0;i<this.totalBorrowedBook;i++){
                if (this.borrowBook[i].equals(b1)){
                    flag=true;
                    }
            }
            if(flag==true){
                System.out.println("You already has another copy of this book!\nReturn that one first.");
            }
            else{
                if(this.totalBorrowedBook==5){
                    System.out.println("You reached maximum book borrowing limit!");
                }
                else {
                    this.borrowBook[this.totalBorrowedBook]=b1;
                    this.totalBorrowedBook++;
                    b1.bBook();
                    LibaryRecord r1=new LibaryRecord(bDate,s,b1);
                    this.addRecord(r1);
                }
            }
        }
        else{
            System.out.println("This is the final Copy. You can't borrow it!");
        }
    }
    public void returnBook(Book b1,String rDate,Student s){
        if (this.totalBorrowedBook==0){
            System.out.println("You have no borrowed books to return!");
        }
        else {
            for(int k=0;k<this.totalLibaryRecord;k++){
                            if(b1.getBookName().equals(this.record[k].getBookName())){
                                this.record[k].returnBook(rDate,s);
                            }                                
                        }                        
            for(int i=0;i<this.totalBorrowedBook;i++){
                if(!this.borrowBook[i].equals(b1)){
                } 
                else {
                    for(int j=i;j<this.totalBorrowedBook-1;j++){
                        this.borrowBook[j]=this.borrowBook[(j+1)];
                    }
                    this.totalBorrowedBook--;
                    b1.rBook();
                    break;
                }
            }
        }
    }
    public void excuseCharge(Student s,int per){
        s.getAccount().modifyLiaryFine(per);
    }    
}