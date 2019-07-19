package java_lab10;
public class Student {
    private String stuName;
    private Department dept;
    
    public void showStudentInfo(){
        System.out.println("Student's Name : "+this.stuName);
        System.out.println("Student's Department : "+this.dept.getName());
        System.out.println("Total semester fee :"+this.semesterFee(148));
    }
    public void setDepartment(Department dept){
        this.dept=dept;
    }
    public void changeDepartment(Department dept){
        this.dept=dept;
    }
    public int semesterFee(int totalCredit){
        dept.calculateSemesterFee(totalCredit);
        return this.dept.getFee();
    }
}
