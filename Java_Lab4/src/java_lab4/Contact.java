package java_lab4;
public class Contact {
    private String personName = "";
    private String personId = "";
    private int age = 0;
    private String mobileNumber = "";
    private char gender = 'M';
    
    public Contact(){}
    public Contact(String Name,String Id,int age,String Number,char gender){
        this.personName=Name;
        this.personId=Id;
        this.age=age;
        this.mobileNumber=Number;
        this.gender=gender;
        System.out.println("Contact Added!");
    }
    
    void showPersonInfo(){
        System.out.println("Person's Name : "+this.personName);
        System.out.println("Person's ID : "+this.personId);
        System.out.println("Person's Age : "+this.age);
        System.out.println("Person's PhoneNumber : "+this.mobileNumber);
        System.out.println("Person's Gender : "+this.gender);
    }
    void detectMobileOperator(){
    if (this.mobileNumber.startsWith("017"))
            {System.out.println("GP");}
    else if (this.mobileNumber.startsWith("01"))
            {System.out.println("Robi");}
    else if (this.mobileNumber.startsWith("019"))
            {System.out.println("Banglalink");}
    }

}
