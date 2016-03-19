package Homework6_Classes_Objects;

public class GSMDemo {

	public static void main(String[] args) {
		GSM iPhone = new GSM();
		iPhone.model = "iPhone 6S";
		iPhone.insertSimCard("0889832657");
		iPhone.printPhoneInfo();
		System.out.println("Outgoing calls price: " + iPhone.getSumForCall());

		GSM samsung = new GSM();
		samsung.model = "Samsung A3";
		samsung.insertSimCard("0887989190");	
	
		samsung.call(iPhone, 65);
		samsung.call(iPhone, 35);
		System.out.println("");
		samsung.printPhoneInfo();
		System.out.println("Outgoing calls price: " + samsung.getSumForCall() + " ыт.");
	}
}
