package banking;

public class Customer
{
     private String name,address,destiname,reason,depardate;
     private Long age,phonenum,dob;
	
     public Customer()
     {
    	 
     }
     
     public Customer(String name, String address, String destiname, String reason, String depardate, Long age,
			Long phonenum, Long dob) {
		super();
		this.name = name;
		this.address = address;
		this.destiname = destiname;
		this.reason = reason;
		this.depardate = depardate;
		this.age = age;
		this.phonenum = phonenum;
		this.dob = dob;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public String getDestiname() {
		return destiname;
	}



	public void setDestiname(String destiname) {
		this.destiname = destiname;
	}



	public String getReason() {
		return reason;
	}



	public void setReason(String reason) {
		this.reason = reason;
	}



	public String getDepardate() {
		return depardate;
	}



	public void setDepardate(String depardate) {
		this.depardate = depardate;
	}



	public Long getAge() {
		return age;
	}



	public void setAge(Long age) {
		this.age = age;
	}



	public Long getPhonenum() {
		return phonenum;
	}



	public void setPhonenum(Long phonenum) {
		this.phonenum = phonenum;
	}



	public Long getDob() {
		return dob;
	}



	public void setDob(Long dob) {
		this.dob = dob;
	}
    
     public void display()
     {
    	 System.out.println("this is customer ");
     }
     



}
