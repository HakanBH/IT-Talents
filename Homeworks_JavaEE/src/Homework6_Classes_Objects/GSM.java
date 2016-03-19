package Homework6_Classes_Objects;

public class GSM {
	String model;
	boolean hasSimCard;
	String simMobileNumber;
	int outgoingCallsDuration;
	Call lastIncomingCall;
	Call lastOutgoingCall;

	
	void insertSimCard(String simMobileNumber){
		if((simMobileNumber.charAt(0) == '0' && simMobileNumber.charAt(1) == '8') && simMobileNumber.length() == 10){
			this.simMobileNumber = simMobileNumber;
			this.hasSimCard = true;
		}
		else{
			System.out.println("Invalid number.");
		}
	}
	void removeSimCard(){
		hasSimCard = false;
		simMobileNumber = null;
	}
	void call(GSM receiver, int duration){
		if(duration < 1){
			return;
		}
		if(this.simMobileNumber == receiver.simMobileNumber){
			return;
		}
		if(!this.hasSimCard || !receiver.hasSimCard){
			return;
		}
		Call outgoing = new Call();
		outgoing.duration = duration;
		outgoing.caller = this;
		outgoing.receiver = receiver;
		outgoing.priceForAMinute = 0.4f;
		
		this.lastOutgoingCall = outgoing;
		receiver.lastIncomingCall = outgoing; 
		
		this.outgoingCallsDuration += duration;
	}
	
	double getSumForCall(){
		if(lastOutgoingCall == null){
			return 0;
		}
		else{
			return (this.outgoingCallsDuration * this.lastOutgoingCall.priceForAMinute);
		}
	}
	void printInfoForTheLastOutgoingCall(){
		if(this.lastOutgoingCall != null){
			lastOutgoingCall.print();
		}
	}
	void printInfoForTheLastIncomingCall(){
		if(this.lastIncomingCall != null){
			lastIncomingCall.print();
		}
	}
	void printPhoneInfo(){
		System.out.println("Model: " + model);
		System.out.println("Has sim card: " + hasSimCard);
		System.out.println("Number: " + simMobileNumber);
		System.out.println("Outgoing calls duration: " + outgoingCallsDuration);
	}
}
