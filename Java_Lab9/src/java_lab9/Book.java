package java_lab9;
public class Book {
    private String bookName = "";
    private String bookAuthor = "";
    private String bookId = "";
    private String bookType = "";
    private int bookCopy = 0;
    
    public Book(){}
    public Book(String Name,String Author,String Id,String Type,int Copy){
        this.bookName=Name;
        this.bookAuthor=Author;
        this.bookId=Id;
        this.bookType=Type;
        this.bookCopy=Copy;
        System.out.println("Book Added!");        
    }
    
    /*public void setValue(String Name,String Author,String Id,String Type,int Copy){
        this.bookName=Name;
        this.bookAuthor=Author;
        this.bookId=Id;
        this.bookType=Type;
        this.bookCopy=Copy;
        System.out.println("Book Added!");        
    }*/
    
    public void showInfo(){
        System.out.println("Book's Name : " + this.bookName);
        System.out.println("Book's Author : " + this.bookAuthor);
        System.out.println("Book's ID :" + this.bookId);
        System.out.println("Book's Type :" + this.bookType);
        System.out.println("Number of Books Available : " + this.bookCopy);
    }
    public void addBookCopy(int x){
        this.bookCopy+=x;    
    }
    
    public String getBookName(){return this.bookName;}
    public String getAuthorName(){return this.bookAuthor;}
    public String getBookID(){return this.bookId;}
    public String getBookType(){return this.bookType;}
    public int getBookCopy(){return this.bookCopy;}
    
    public void bBook(){this.bookCopy--;}
    public void rBook(){this.bookCopy++;}
}