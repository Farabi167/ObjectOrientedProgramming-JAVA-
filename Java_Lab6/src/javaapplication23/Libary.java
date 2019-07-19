/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication23;

public class Libary {
    private String libName="";
    private String libAddress="";
    private Book[] listOfBook;
    private int totalBook=0;
    
    public Libary(){
        
    }
    public Libary(String libName,String libAddress){
        this.libName=libName;
        this.libAddress=libAddress;
        listOfBook=new Book[100];
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
    public void addNewBook(Book book){
        listOfBook[totalBook]=book;
        totalBook++;
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
    public void addNewBookCopy(Book Book, int copy){
        /*for(int i=0;i<this.totalBook;i++)
        {
            if (Book==this.listOfBook[i])
            {
                this.listOfBook[i].addBookCopy(copy);
            }
        }*/
        Book.addBookCopy(copy);
    }
}