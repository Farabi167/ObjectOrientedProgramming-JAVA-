package java_lab8;
public class Java_Lab8 {
    public static void main(String[] args) {
        Student s1 = new Student("Abdal","17-34448-1","Badda", 3.92f,(byte)77,'M');
        Student s2 = new Student("Lucifer","17-36668-1","Badda", 3.92f,(byte)77,'M');
        Student s3 = new Student("Farabi","17-37778-1","Badda", 3.92f,(byte)77,'M');
        Student s4 = new Student("Prome","17-35558-1","Dinajpur", 3.84f,(byte)64,'F');
        Teacher t1 = new Teacher("Dip Nondi","65413016","Uttora","017--------");
        Teacher t2 = new Teacher("Sayaet Ahmed","65456463","Gulsan","017--------");
        Course c1 = new Course("Object Oriented Programming - 1 (JAVA)", (byte)88 , (byte)3);
        s1.addCourse(c1);
        s2.addCourse(c1);
        s3.addCourse(c1);
        s4.addCourse(c1);
        //s1.dropCourse(c1);
        c1.addTeacher(t1);
        //c1.addTeacher(t1);
       
        c1.ShowDetails();
        c1.dorpTeacher();
        c1.addTeacher(t2);
        s3.dropCourse(c1);
        
        c1.ShowDetails();
        
        
    }    
}