package methods2relationship1;


	import java.util.ArrayList;
	import java.util.List;

	public class User2 {
	       
	    private String name;
		private String contactNumber;
		private List<Hall2> hallList= new ArrayList<Hall2>();
		public User2() {
			super();
		}

		public User2(String name, String contactNumber) {
			super();
			this.name = name;
			this.contactNumber = contactNumber;
		}
		
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getContactNumber() {
			return contactNumber;
		}

		public void setContactNumber(String contactNumber) {
			this.contactNumber = contactNumber;
		}

		void addToHallList(Hall2 hall)
		{
			hallList.add(hall);
		}

		/*@Override
		public String toString() {
			return "User [name=" + name + ", contactNumber=" + contactNumber + "]";
		}*/
		
		public void displayDetails() {
			for (Hall2 hall : hallList) {
				System.out.println(hall);
			}
		}
		
		public void checkOwner(String s)
		{
			int i=0,temp=0;
			for (Hall2 hall : hallList) {
				i=i+1;
				if(hall.getOwnerName().equals(s))
				{
					//i=i+1;
					System.out.println("Hall "+i);
					System.out.println("Name:"+hall.getName());
					System.out.println("Cost per day:"+hall.getCostPerDay());	
					temp++;
				}
			}
			if(temp==0)
			{
				System.out.println("No halls are available");
			}
		}

		

	}


