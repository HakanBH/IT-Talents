package TraderTask;

import java.util.Random;

public class Chain extends Trader{
	public static final int MAX_PROVIDERS = 15;
	public static final int MAX_TRADESITES = 10;
	private Provider[] providers;

	
	public Chain(String name){
		super(name);
	}


}	
