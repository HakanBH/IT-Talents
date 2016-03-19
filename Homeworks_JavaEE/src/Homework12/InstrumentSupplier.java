package Homework12;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class InstrumentSupplier implements Runnable{
	private static final int MAX_DELIVERY_TIME = 5000;
	private static final int MONTHLY_DELIVERY_TIME = 30000;
	private Set<Instrument> supplierItems;
	private Shop shop;
	
	InstrumentSupplier(Shop shop){
		if(shop!=null){
			this.shop=shop;
		}
		supplierItems = new HashSet<Instrument>();
		List<String> instruments = Arrays.asList("trompet" , "trambon" , "tuba" , 
				"klarinet" , "gaida", "kitara", "cigulka", "bandjo", "saz" , 
				"viola", "sintzator" , "basKitara", "elCigulka", "barabani", 
				"tarambuka", "tupan", "dayre", "organ" , "piano" ,"akordeon");

		for(String instr: instruments){
			supplierItems.add(Instrument.newInstrument(instr));
		}
	}
	
	public void supplyInstrument(String name, int quantity){
		Instrument toSupply = shop.getInstrument(name);
		Random r = new Random();
		try {
			int waitTime = r.nextInt(MAX_DELIVERY_TIME);
			System.out.println("Your instrument(s) will be delivered in " + waitTime/1000 + " days.");
			Thread.sleep(waitTime);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(quantity + " " + name + "(s) delivered to shop.");
		try {
			toSupply.increaseQuantity(quantity);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	@Override
	public void run() {
		while(true){			
			try {
				Thread.sleep(MONTHLY_DELIVERY_TIME);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("\nITEMS DELIVERED THIS MONTH: ");
			shop.deliverMissingItems();
		}
	}

}
