package CourtTask;

public class Prosecutor extends Jurist{
	final static int MIN_EXPERIENCE = 10;
	
	public Prosecutor(String name) {
		super(name);
	}
	
	public Prosecutor(String name, int exp, int cases) {
		super(name, exp, cases);
	}
	
	@Override
	public void setExperience(int experience) {
		if(experience>MIN_EXPERIENCE){
			super.setExperience(experience);
		}
		else{
			super.setExperience(MIN_EXPERIENCE);
		}
	}
	
}
