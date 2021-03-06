package CourtTask;

import java.util.Arrays;

public abstract class HasLawyers extends Citizen{
	private static final int MAX_LAWYERS = 10;
	private Lawyer[] lawyers;
	private int numberOfLawyers;
	
	HasLawyers(String name, String address, int age){
		super(name, address, age);
		lawyers = new Lawyer[MAX_LAWYERS];
	}
	
	void addLawyer(Lawyer newLawyer){
		if(!hasLawyer(newLawyer)){
			lawyers[numberOfLawyers]=newLawyer;
			numberOfLawyers++;
		}
		else{
			System.out.println("Lawyer already hired!");
		}
	}
	
	boolean hasLawyer(Lawyer newLawyer){
		for(int i=0; i<numberOfLawyers; i++){
			if(lawyers[i].equals(newLawyer)){
				return true;
			}
		}
		return false;
	}
	
	public void increaseCasesOfLawyers(){
		for(int i=0;i<numberOfLawyers;i++){
			lawyers[i].increaseNumberOfCases();
		}
	}
	
	Lawyer[] getLawyers(){
		return Arrays.copyOf(lawyers, numberOfLawyers);
	}
	
	
	public int getNumberOfLawyers(){
		return this.numberOfLawyers;
	}
}
