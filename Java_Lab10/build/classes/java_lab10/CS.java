package java_lab10;
public class CS extends Department{
    int creditFeeRate;
    public CS(){}
    @Override
    public void calculateSemesterFee(int credit){
        this.setCreditFee(credit*this.creditFeeRate);
    }
}
