package java_lab9;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class LibaryRecord {
    private String studentName="";
    private String bookName="";
    private String borrowDate="";
    private String returnDate="Not Returned Yet!";
    private long totalBorrowingDays=0;
    
    public LibaryRecord(){}
    public LibaryRecord(String s1,Student s,Book b){
        this.studentName=s.getName();
        this.borrowDate=s1;
        this.bookName=b.getBookName();
    }
    public void showInfo(){
        System.out.println("Borrowed Book Name : "+this.bookName);
        System.out.println("Borrowed by :"+this.studentName);
        System.out.println("Borrowed Date :"+this.borrowDate);
        System.out.println("Return Date :"+this.returnDate);
    }
    
    public void returnBook(String s1,Student s){
        this.returnDate=s1;
        this.totalBorrowingDays= calculateDateDifference(this.borrowDate,this.returnDate);
        if (this.totalBorrowingDays>5){
            long fine=this.totalBorrowingDays-5;
            s.getAccount().addLibaryFine(fine);
        }
    }
    public long calculateDateDifference(String s1,String s2){
        SimpleDateFormat myFormat = new SimpleDateFormat("dd MM yyyy");
        long diff=0;
        try {
        Date date1 = myFormat.parse(s1);
        Date date2 = myFormat.parse(s2);
        diff = date2.getTime() - date1.getTime();
        
        } 
        catch (ParseException e) {
           e.printStackTrace();
        }
        return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
    }
    
    public String getStudentName(){return this.studentName;}
    public String getBookName(){return this.bookName;}
    public String getBorrowDate(){return this.borrowDate;}
    public String getReturnDate(){return this.returnDate;}
    public long getTotalBorrowingDate(){return this.totalBorrowingDays;}
}
