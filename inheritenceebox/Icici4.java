
public class Icici4 implements Notification4{

	@Override
	public void notificationBySms() {
		System.out.println("Notification By SMS");
		
	}

	@Override
	public void notificationByEmail() {
		System.out.println("Notification By Mail");
		
	}

	@Override
	public void notificationByCourier() {
		
		System.out.println("Notification By Courier");
	}

}
