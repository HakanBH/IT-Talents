package exceptions;

import java.io.IOException;

public class Mishka extends Grizach{

	public Mishka(int age, double weight, String name) {
		super(age, weight, name);
	}
	
	@Override
	public void izqjSirene(String tip, double kolichestvo) throws NullPointerException, IOException{
		super.izqjSirene(tip.toLowerCase(), kolichestvo);
	}
}

