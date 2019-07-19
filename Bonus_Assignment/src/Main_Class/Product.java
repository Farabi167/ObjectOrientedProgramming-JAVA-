package Main_Class;

public class Product {
    //Variables
    private int productId=0;
    private String productName="";
    private double price=0.0;
    private int availableQuantity=0;
    
    //Constructors
    public Product(){}
    public Product(int productId,String productName,double price,int availableQuantity){
        this.productId=productId;
        this.productName=productName;
        this.price=price;
        this.availableQuantity=availableQuantity;
    }
    
    //Setter
    public void setProductId(int productId){
        this.productId=productId;
    }
    public void setProductName(String productName){
        this.productName=productName;
    }
    public void setPrice(double price){
        this.price=price;
    }
    public void setAvailableQuantity(int availableQuantity){
        this.availableQuantity=availableQuantity;
    }
    
    //Getter
    public int getProductId(){return this.productId;}
    public String getProductName(){return this.productName;}
    public double getPrice(){return this.price;}
    public int getAvailableQuantity(){return this.availableQuantity;}
    
    //Functions
    public void buyProducts(int quantity){
        this.availableQuantity+=quantity;
    }
    public void sellProducts(int quantity){
        if(this.availableQuantity>=quantity)
            this.availableQuantity-=quantity;
        else
            System.out.println("Not Enougn Quantity to sell!");
    }
    
    //ShowDetails
    public void showDetails(){
        System.out.println("Product ID: "+this.productId);
        System.out.println("Product Name: "+this.productName);
        System.out.println("Product's Price: "+this.price);
        System.out.println("Available Quantity: "+this.availableQuantity);
    }
}
