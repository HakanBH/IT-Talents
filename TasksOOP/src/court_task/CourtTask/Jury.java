package CourtTask;

import java.util.Scanner;

public class Jury {
	Scanner in = new Scanner(System.in);
	private Juror[] jury;
	private int numberOfJurors;
	
	public Jury(int howMany){
		jury = new Juror[howMany];
		while(numberOfJurors < howMany){
			System.out.println("Add juror: ");
			String jurorName = in.next();
			addJuror(new Juror(jurorName));
		}
	}
	
	public boolean isGuilty(){
		int count=0;
		for(int i=0;i<jury.length; i++){
			if(jury[i].giveVerdict()){
				count++;
			}
		}
		if(count>(jury.length/2)){
			System.out.println("Jury found the defendant GUILTY.");
			return true;
		}
		else{
			System.out.println("The jury found the defendant NOT GUILTY");
			return false;
		}
	}
	
	public void addJuror(Juror j){
		if(j !=null && !hasJuror(j) && !j.wasJurorBefore()){
			jury[numberOfJurors] = j; 
			numberOfJurors++;
		}
	}
	
	public boolean hasJuror(Juror j){
		for(int i=0;i<jury.length; i++){
			if(jury[i]!=null && jury[i].equals(j)){
				return true;
			}
		}
		return false;
	}
	
	public void increaseNumberOfCases(){
		for(int i=0; i<jury.length; i++){
			jury[i].increaseNumberOfCases();
		}
	}
	
	public int getNumberOfJurors(){
		return numberOfJurors;
	}
}
