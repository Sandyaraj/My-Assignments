package week1.day1;

public class Mobile {
	
	public void sendSms (String name) {
		System.out.println(name);
	}
	public void takeSnapshot (String name) {
		System.out.println(name);

}
	public static void main(String[] args) {
		Mobile a= new Mobile();
		a.sendSms("Hello Sandya");
		a.takeSnapshot("Hi");
		
		
		
	}
}