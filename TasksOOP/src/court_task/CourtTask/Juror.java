package CourtTask;

import java.util.Random;

public class Juror extends Jurist{
	Juror(String name){
		super(name);
	}
	
	boolean wasJurorBefore(){
		return super.getNumberOfCases()>=1;
	}
	
	public boolean giveVerdict(){
		Random r = new Random();
		int x = r.nextInt(2);
		if(x==1){
			System.out.println("Guilty");
		}
		else{
			System.out.println("Not Guilty");
		}
		return x == 1;
	}
}
