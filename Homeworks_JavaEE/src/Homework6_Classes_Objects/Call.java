package Homework6_Classes_Objects;
public class Call {
	float priceForAMinute;						// v lv-a
	GSM caller;
	GSM receiver;								
	int duration;								// v minuti
	
	void print(){
		System.out.println("Price for a minute: " + priceForAMinute);
		System.out.println("Caller: " + caller.simMobileNumber);
		System.out.println("Receiver: " + receiver.simMobileNumber);
		System.out.println("Duration: " + duration);
	}
}
