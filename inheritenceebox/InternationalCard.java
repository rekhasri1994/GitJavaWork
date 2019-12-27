
public class InternationalCard extends TravelCreditcard2
{
    double calculateAmount(Double amount,Integer numberOfPersons)
 {
  return (numberOfPersons*amount)-(10*(numberOfPersons*amount))/100;
 }
 
} 