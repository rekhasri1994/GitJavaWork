
public class PrivilegeCustomer1 extends Customer1
{
    public double generateBillAmount(double amount)   
    {
        double amnt=amount;
        amount=amount*0.3;
        amnt=amnt-amount;
        return amnt;
    }
}




