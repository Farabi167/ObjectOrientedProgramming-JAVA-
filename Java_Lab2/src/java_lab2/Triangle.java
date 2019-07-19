package java_lab2;
public class Triangle {
    private int x=0;
    private int y=0;
    private int z=0;
    
    public Triangle(){}
    public Triangle(int X,int Y,int Z){
        this.x=X;
        this.y=Y;
        this.z=Z;
        System.out.println("Triangle Created!");
    }
    
    public void showInfo(){
        System.out.println("Length is = "+this.x);
        System.out.println("Height is = "+this.y);
        System.out.println("Width is = "+this.z);
    }
    
    public void testTriangle(){
        if (this.x == this.y && this.y == this.z) {
            System.out.println("EQUILATERAL");
        }
        else{
            if (this.x != this.y && this.y != this.z && this.x != this.z){
                System.out.println("SCALENE");                
            }
            else{
                System.out.println("ISOSCELES");
            }
        }
    }
}
