package methods2relationship1;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main1 {

	public static void main(String[] args) throws IOException
	{
		User1 u=new User1();
		
		String userDetail=new String();
		String conde=new String();
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the User detail");
		userDetail=br.readLine();
		String userDetailArray[]=userDetail.split(",");
		u.setName(userDetailArray[0]);
		u.setUsername(userDetailArray[1]);
		u.setPasswd(userDetailArray[2]);
		
		/*for(String s:userDetailArray)
		 * out.println(s)
		 */
		System.out.println("Enter the contact details");
		conde=br.readLine();
		String condeArray[]=conde.split(",");
		Contactdetail1 cd=new Contactdetail1();
		cd.setMobile(condeArray[0]);
		cd.setAltmobile(condeArray[1]);
		cd.setLandline(condeArray[2]);
		cd.setEmail(condeArray[3]);
		cd.setAddress(condeArray[4]);
		u.setContactdetil(cd);
		System.out.println("Name:"+u.getName());
		System.out.println("Username:"+u.getUsername());
		System.out.println("Password:"+u.getPasswd());
		
		System.out.println(cd);
		
		
		
		
		
	}

	

}
