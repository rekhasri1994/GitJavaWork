
public class RewardsCreditCard2 extends CreditCard2
{
 Double creditPoints;
 public Double getCreditPoints() {
  return creditPoints;
 }
 public void setCreditPoints(Double creditPoints) {
  this.creditPoints = creditPoints;
 }
 double calculateAmount(Double amount,Integer numberOfPersons)
 {
  return (amount*numberOfPersons)-(numberOfPersons*((5*creditPoints)/100));
 }
}