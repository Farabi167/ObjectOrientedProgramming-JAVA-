package java_lab8;
public class Student {
    private String studentName=" ";
    private String studentID=" ";
    private String studentAddress=" ";
    private float cgpa=(float)0.0;
    private byte creditComplete=0;
    enum sType{M,F};
    private sType sex = sType.M;
    private Course enroll[];
    private int totalEnrolledCourses;

    public Student() {enroll=new Course[5];}
    public Student(String Name, String ID, String Address,float cgpa,byte credit,char s) {
            this.studentName=Name;
            this.studentID=ID;
            this.studentAddress=Address;
            this.cgpa=cgpa;
            this.creditComplete=credit;
            switch (s) {
                case 'M':
                    this.sex=Student.sType.M;
                    break;
                case 'F':
                    this.sex=Student.sType.F;
                    break;
                default:
                    System.out.println("Invalid Input!");
                    break;
            }
            enroll=new Course[5];
    }
    public void showDetails() {
            System.out.println("----------Student's Details----------");
            System.out.println("Name : " + this.studentName);
            System.out.println("ID : " + this.studentID);
            System.out.println("Address : " + this.studentAddress);
            System.out.println("CGPA : " + this.cgpa);
            System.out.println("Total Credit Complete : " + this.creditComplete);
            System.out.println("Sex : "+this.sex);
    }
    public void addCreditComplete(byte credit) {
            this.creditComplete += credit;
    }    
    public void addCourse(Course c){
        this.enroll[this.totalEnrolledCourses]=c;
        this.enroll[this.totalEnrolledCourses].addStudent(this);
        this.totalEnrolledCourses++;
    }
    public void dropCourse(Course c){
        for(int i=0;i<this.totalEnrolledCourses;i++)
        {
            if (c==this.enroll[i])
            {
                this.enroll[i]=this.enroll[this.totalEnrolledCourses-1];
                this.enroll[i].dropStudent(this);
                this.totalEnrolledCourses--;
            } 
            else {
            }
        }
    }
}
