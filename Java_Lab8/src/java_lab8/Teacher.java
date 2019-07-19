package java_lab8;
public class Teacher {
    private String teacherName;
    private String teacherID;
    private String teacherAddress;
    private String phoneNo;
    private Course registeredCourse[];
    private byte totalRegisteredCourses=0;
    
    public Teacher(){this.registeredCourse=new Course[8];}
    public Teacher(String name,String id,String add,String no){
        this.teacherName=name;
        this.teacherID=id;
        this.teacherAddress=add;
        this.phoneNo=no;
        this.registeredCourse=new Course[8];
    }
    public void addCourse(Course c){
        this.registeredCourse[totalRegisteredCourses]=c;
        this.registeredCourse[totalRegisteredCourses].addTeacher(this);
        this.totalRegisteredCourses++;
    }
    public void dropCourse(Course c){
        for(int i=0;i<this.totalRegisteredCourses;i++)
        {
            if (c==this.registeredCourse[i])
            {
                this.registeredCourse[i]=this.registeredCourse[this.totalRegisteredCourses-1];
                this.registeredCourse[i].dorpTeacher();
                this.totalRegisteredCourses--;
            } 
            else {
            }
        }
    }
    public String getName(){return this.teacherName;}
}
