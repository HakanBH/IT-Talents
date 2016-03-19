package CourtTask;

public class Lawyer extends Jurist {
	final static int MIN_CASES=10;
	
	Lawyer(String name){
		super(name);
	}
	
	Lawyer(String name, int exp, int numberOfCases){
		super(name, exp, numberOfCases);
	}
	
	@Override
	public void setNumberOfCases(int numberOfCases) {
		if(numberOfCases>MIN_CASES){
			super.setNumberOfCases(numberOfCases);
		}
		else{
			super.setNumberOfCases(MIN_CASES);
		}
	}
}
