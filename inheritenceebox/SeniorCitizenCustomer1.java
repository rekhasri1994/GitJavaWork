
public class SeniorCitizenCustomer1 extends Customer1{
    
    public double generateBillAmount(double amount){
        double amt = amount;
        amount = amount *0.12;
        amt = amt - amount;
        return amt;
       
    }
}


