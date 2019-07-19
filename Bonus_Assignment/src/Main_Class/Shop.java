package Main_Class;

public class Shop {

    //Variable
    private String shopName = "";
    private Product[] products;
    //private int totalProducts=0;

    //Constructor
    public Shop() {
    }

    public Shop(String shopName, int sizeOfArray) {
        this.shopName = shopName;
        this.products = new Product[sizeOfArray];
        for (int i = 0; i < this.products.length; i++) {
            this.products[i] = null;
        }
    }

    //Setter
    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    //Getter
    public String getShopName() {
        return this.shopName;
    }
    public Product getProduct(int productId) {
        for (int i = 0; i < this.products.length; i++) {
            if (this.products[i].getProductId() == productId) {
                return this.products[i];
            }
        }
        return null;
    }

    //Functions
    public void addProducts(Product p) {
        for(int i=0;i<this.products.length;i++)
            if(this.products[i]==null){
                this.products[i]=p;
                return;
            }
    }
    public void removeProduct(Product p) {
        for (int i = 0; i < this.products.length; i++) {
            if (this.products[i] == p) {
                this.products[i]=null;
            }
        }
    }

    //ShowDetails
    public void showDetails() {
        System.out.println("Shop's Name: " + this.shopName);
        System.out.println("Shop's Available Products Are: ");
        for (int i = 0; i < this.products.length; i++) {
            if(this.products[i]==null)
                ;//continue;
            else{
                System.out.println((i + 1) + ".");
                this.products[i].showDetails();
            }
        }
        System.out.println();
    }
}
