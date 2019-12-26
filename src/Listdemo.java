import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

class Product
{
	private int pcode;
	private String pname;
	private int price;
	private char ptype;
	private ArrayList listOfprices;
	
	Product()
	{
		
	}
	public int getPcode() {
		return pcode;
	}
	public void setPcode(int pcode) {
		this.pcode = pcode;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		
		this.price = price;
		
		
	}
	public char getPtype() {
		return ptype;
	}
	public void setPtype(char ptype) {
		this.ptype = ptype;
	}
	
}

class Orders
{
	private int orderid;
	private int productId;
	private Date orderdate;
	public int getOrderid() {
		return orderid;
	}
	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public Date getOrderdate() {
		return orderdate;
	}
	public void setOrderdate(Date orderdate) {
		this.orderdate = orderdate;
	}
	
}

class Address
{
	String typeofadd;
	int hno;
	String streetname;
	String city;
	String lsndmark;
	String pincode;
	public String getTypeofadd() {
		return typeofadd;
	}
	public void setTypeofadd(String typeofadd) {
		this.typeofadd = typeofadd;
	}
	public int getHno() {
		return hno;
	}
	public void setHno(int hno) {
		this.hno = hno;
	}
	public String getStreetname() {
		return streetname;
	}
	public void setStreetname(String streetname) {
		this.streetname = streetname;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getLsndmark() {
		return lsndmark;
	}
	public void setLsndmark(String lsndmark) {
		this.lsndmark = lsndmark;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	
	
}
class Customer implements Comparator
{
	private int customerId;
	private String customerName;
	private Address permAddress;
	
	
	
	public Address getPermAddress() {
		return permAddress;
	}


	public void setPermAddress(Address permAddress) {
		this.permAddress = permAddress;
	}


	public int getCustomerId() {
		return customerId;
	}


	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}


	public String getCustomerName() {
		return customerName;
	}


	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}


	@Override
	public String toString() {
		return "customer [customerId=" + customerId + ", customerName=" + customerName + "]";
	}


	@Override
	public int compare(Object arg0, Object arg1) {
		Customer c1=(Customer)arg0;
		Customer c2=(Customer)arg1;
		if(c1.getCustomerId()==c2.getCustomerId()&&c1.getCustomerName().equals(getCustomerName()))
			return 0;
		else
			
		return 1;
	}
	
}
public class Listdemo {
	 public static void main(String args[]) throws NumberFormatException, IOException {
		 List<Integer> prices=new ArrayList<Integer>();
		 LinkedList<Product> ll=new LinkedList<Product>();
		 Queue<Orders> orderq=new PriorityQueue<Orders>();
		 Set<Customer> custset=new HashSet<Customer>();
		 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		 boolean flag=true;
		 char reply='y';
		 while(flag)
		 {
			 Customer c=new Customer();
			 
		   System.out.println("enter customer id");
		   c.setCustomerId(Integer.parseInt(br.readLine()));
		   c.setCustomerName(br.readLine());
		   custset.add(c);
		   System.out.println("wish to add more customers(y/n)");
		   reply=br.readLine().toLowerCase().charAt(0);
		   if(reply!='y')
			   flag=false;
		 }
		 showCollection(custset);
	 }
	 public static void showCollection(Collection c)
	 {
		 Iterator itr=c.iterator();
		while(itr.hasNext())
		{
			if(c instanceof Set)
			{
				 Customer custom=(Customer)itr.next();
				
				 System.out.println("customer id:"+custom.getCustomerId());
				 System.out.println("customer name:"+custom.getCustomerName());
			}else if(c instanceof List)
			{
				Product produ=(Product)itr.next();
				System.out.println("product id:"+produ.getPcode());
				System.out.println("product name:"+produ.getPname());
				
			}
		}
	 }
}
