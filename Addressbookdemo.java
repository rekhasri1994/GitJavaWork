package alloppsconceptsAEIP;

public class Addressbookdemo {

	public static void main(String[] args) {
		Addressbook ab=new Addressbook();
		Addressbook.Address addrs=new Addressbook().new Address();
		addrs.setHousename("sri nilayam");
		addrs.setStreet("zp high road");
		addrs.setCity("vijayawada");
		addrs.setState("ap");
		ab.setTempAdd(addrs);
		Addressbook.Address permaaddr=new Addressbook().new Address();
		permaaddr.setHousename("sri");
		permaaddr.setStreet("fjkshg");
		permaaddr.setCity("hfjh");
		permaaddr.setState("kfhk");
		//set values to attributes of outer class
		ab.setPermAdd(permaaddr);
		
		System.out.println("Temporary adress:\n"+ab.getTempAdd());
		System.out.println("Permanant address:\n"+ab.getPermAdd());
	}

}
