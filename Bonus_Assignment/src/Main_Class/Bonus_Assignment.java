package Main_Class;

public class Bonus_Assignment {

    public static void main(String[] args) {
        //i
        Shop s1 = new Shop ("IceCram Parlour",4);
        
        //ii
        Product p1 = new Product(11,"Cone",45,5);
        Product p2 = new Product(22,"Vannila",120,6);
        Product p3 = new Product(33,"Choclate",160,9);
        Product p4 = new Product(44,"Chocobar",50,10);
        
        //iii
        s1.addProducts(p1);
        s1.addProducts(p2);
        s1.addProducts(p3);
        
        //iv
        s1.showDetails();
        
        //v
        s1.getProduct(22).buyProducts(5);
        
        //vi
        s1.getProduct(33).sellProducts(5);
        
        //vii
        s1.showDetails();
        
        //viii
        s1.removeProduct(p1);
        s1.addProducts(p4);
        
        //ix
        s1.showDetails();
        
    }
    
}
