package java_lab2;
public class Java_Lab2 {
    public static void main(String[] args) {
        Triangle tr1 = new Triangle(2,3,4);
        Triangle tr2 = new Triangle(2,2,2);
        Triangle tr3 = new Triangle(2,3,2);
        tr1.showInfo();
        tr1.testTriangle();
        tr2.showInfo();
        tr2.testTriangle();
        tr3.showInfo();
        tr3.testTriangle();
    }
}
