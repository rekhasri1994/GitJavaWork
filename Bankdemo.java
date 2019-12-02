package banking;

public class Bankdemo {

	public static void main(String[] args) 
	{
		Account a=new Account("savings", "rekha", "fjh54gsg", 4564146465L, 50000);

		System.out.println(a.getAcctype() +" "+ a.getUsername() +" " + a.getIfscno() +  a. getAccountnum() + a.getBal());
		
		{   
			System.out.println(a  instanceof Account);
		}
		a.display();
		Customer c=new Customer();
		if(c instanceof Customer)
		

			System.out.println("true");
			else
			System.out.println("false");
		
        c.display();
        Bank b=new Bank();
        
        b.display();
        
        Savingsacc s=new Savingsacc(54654645644L);

		System.out.println(s.getAccno());
        s.display();
        Fixedaccou f=new Fixedaccou(45616513321L);

		System.out.println(f.getAccnum());
        f.display();
        RecuuringAcc r=new RecuuringAcc(654564654655L);

		System.out.println(r.getAccnumb());
        r.display();
        Branch br=new Branch(1234,123);
        Branch branch=br;
        br.setBranchid(1234);
        System.out.print(branch.getBranchid());
        br.display();
        Services ser=new Services();
        ser.display();
	}

}
