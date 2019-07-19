package java_lab8;
public class Course {
    private Student registerStudents[];
    private Teacher teacher;
    private byte credit=0;
    private String courseTitle;
    private byte courseID=0;
    private byte totalStudents=0;
    
    public Course(){}
    public Course(String title,byte id,byte credit){
        registerStudents = new Student[30];
        this.courseTitle=title;
        this.courseID=id;
        this.credit=credit;
        
    }
    public void addTeacher(Teacher t){
        if (this.teacher == null){
            this.teacher=t; 
        }else{
            System.out.println("Teacher is already Added!");
        }
    }
    public void dorpTeacher(){
        if (this.teacher != null){
            this.teacher=null; 
            
        }else{
            System.out.println("There is none teacher how to remove!");
        }
    }
    public void addStudent(Student s){
        this.registerStudents[this.totalStudents]=s;
        this.totalStudents++;
    }
    public void dropStudent(Student s){
        for(int i=0;i<this.totalStudents;i++)
        {
            if (s==this.registerStudents[i])
            {
                this.registerStudents[i]=this.registerStudents[this.totalStudents-1];
                this.totalStudents--;
            } 
            else {
            }
        }        
    }  
    public void ShowDetails(){
        System.out.println("Course Details :");
        System.out.println("Course Name : "+this.courseTitle);
        System.out.println("Course credit : "+this.credit);
        System.out.println("Course ID : "+this.courseID);
        System.out.println("Course Teacher :"+this.teacher.getName());
        System.out.println("Total Number of Students :" +this.totalStudents);
        for(int i=0;i<this.totalStudents;i++){
            this.registerStudents[i].showDetails();
        }
            
    }
}
