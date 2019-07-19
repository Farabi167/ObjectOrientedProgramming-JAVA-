package java_lab5;
public class Mobile {
    private String mobileOwnerNumber = "";
    private String mobileNumber = "";
    private double mobileBalance = 0.0;
    private String mobileOSName = "";
    private boolean lock = true;
    
    public Mobile(){
        
    }
    public Mobile(String mobileOwnerNumber,String mobileNumber,double mobileBalance,String mobileOSName,boolean lock){
        this.mobileOwnerNumber=mobileOwnerNumber;
        this.mobileNumber=mobileNumber;
        this.mobileBalance=mobileBalance;
        this.mobileOSName=mobileOSName;
        this.lock=lock;        
    }
    public void showInfo(){
        if (this.lock==false)
        {
            System.out.println("Owner's Name : " +this.mobileOwnerNumber);
            System.out.println("Number : " +this.mobileNumber);
            System.out.println("Balance : " +this.mobileBalance);
            System.out.println("Operating Syatem : " +this.mobileOSName);
            System.out.println("Avability : " +this.lock);
        }
        else
        {
            System.out.println("Please Unlock your device first!");
        }
    }
    public void recharge(int ammount){
        if (this.lock==false)
        {
            this.mobileBalance+=ammount;
        }
        else
        {
            System.out.println("Please Unlock your device first!");
        }
    }
    public void callSomeone(int timeDuration){
        if (this.mobileBalance<timeDuration)
        {
            System.out.println("You can't make the call!");
        }
        else
        {
            if (this.lock==false)
            {
                this.mobileBalance-=timeDuration;
                System.out.println("Your time duration is "+timeDuration+" minute.");
                System.out.println("You are enjoying 1taka/min rate and charged "+timeDuration);
                System.out.println("Your remainig balance is " +this.mobileBalance);
            }
            else
            {
                System.out.println("Please Unlock your device first!");
            }
        }
        
    }
}
