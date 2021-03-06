package CourtTask;

import java.util.Random;

public class Judge extends Jurist{
	final static int MIN_EXPERIENCE = 5;
	
	Judge(String name){
		super(name);
	}
	
	Judge(String name, int xp, int cases){
		super(name,xp,cases);
	}
	
	public int giveSentence(){
		Random r = new Random();
		int x = r.nextInt(37)+3;
		System.out.println("Judge's sentence is " + x + " years in prison!");
		return x;
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
