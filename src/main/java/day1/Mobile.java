package day1;

public class Mobile {
	
	public void callNumber(String name , long num) {
		System.out.println(name);
		System.out.println(num);
		
		}
	public void typeMessage(String type) {
		System.out.println("Hi " + type);
	}
	
	public String buttons = "red color button";
	public String torch = "On torch";
	
	public static void main(String[] args) {
		
		String msg = "sara";
		long num = 8825554783L;
	
		
		Mobile myObject = new Mobile();
		myObject.callNumber(msg, num);
		myObject.typeMessage(msg);
		
		System.out.println(myObject.buttons);
		System.out.println(myObject.torch);
		
		
	}

}
