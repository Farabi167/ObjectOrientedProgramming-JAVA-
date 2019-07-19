package java_lab9;
public class OverdraftAccount extends Account {
    private double overdraftLimit=0;
    private double overdraft;
    
    public OverdraftAccount(){}
    public OverdraftAccount(double amount){this.overdraftLimit=amount;}
    
    @Override
    public void withdraw(double ammount){
        if(ammount<this.overdraftLimit){
            this.overdraft=ammount;
            Transaction t1=new Transaction(this,this,(int)ammount,"Overdraft");
            this.addTransaction(t1);
        }
        else
            System.out.println("You request exceeding the limit!");
    }
}
