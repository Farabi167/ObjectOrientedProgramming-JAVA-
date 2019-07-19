package java_lab10;
public class EEE extends Department{
    int creditFeeRate;
    public EEE(){}
    @Override
    public void calculateSemesterFee(int credit){
        this.setCreditFee(credit*this.creditFeeRate);
    }
}
