package java_lab9;
public class OverdraftAccount extends Account {
    private double overdraftLimit=0;
    
    public OverdraftAccount(){}
    public OverdraftAccount(String name, String id, double balance,double amount){
        super (name,id,balance);
        this.overdraftLimit=amount;
    }
    
    @Override
    public void withdraw(double ammount){
        if(ammount<(this.overdraftLimit+this.getBalance())){
            this.updateBalance(ammount);
            Transaction t1=new Transaction(this,this,(int)ammount,"Overdraft");
            this.addTransaction(t1);
        }
        else
            System.out.println("You request exceeding the limit!");
    }
}
