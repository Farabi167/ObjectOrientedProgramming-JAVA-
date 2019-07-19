package java_lab10;
public class BBA extends Department{
    int creditFeeRate;
    public BBA(){}
    @Override
    public void calculateSemesterFee(int credit){
        this.setCreditFee(credit*this.creditFeeRate);
    }
}
