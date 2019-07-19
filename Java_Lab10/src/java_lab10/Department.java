package java_lab10;
public class Department {
    private String deptName;
    private int creditFee;
    public Department(){}
    public void calculateSemesterFee(int credit){
        
    }
    public void setCreditFee(int amount){
        this.creditFee=amount;
    }
    public String getName(){return this.deptName;}
    public int getFee(){return this.creditFee;}
}
