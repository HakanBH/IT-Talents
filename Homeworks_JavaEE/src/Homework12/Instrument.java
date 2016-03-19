package Homework12;

import java.util.Arrays; 
import java.util.List;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

public class Instrument {
	public final static int MAX_DELIVERY_TIME = 100;
	private String name;
	private String type; 		// реших, че няма нужда от отделен клас за всеки тип
	private double price;
	private AtomicInteger quantity = new AtomicInteger(0);
	
	private static final List<String> duhovi = Arrays.asList("trompet" , "trambon" , "tuba" , "klarinet" , "gaida");
	private static final List<String> udarni = Arrays.asList("barabani", "tarambuka", "tupan", "dayre");
	private static final List<String> klavishni = Arrays.asList("organ" , "piano" ,"akordeon");
	private static final List<String> strunni = Arrays.asList("kitara", "cigulka", "bandjo", "saz" , "viola");
	private static final List<String> elektronni =Arrays.asList("sintzator" ,"basKitara", "elCigulka");
	
 	public static Instrument newInstrument(String name){
		return newInstrument(name,1);
	}
	
	private  Instrument(String name, int quantity, String type){
		setName(name);
		setQuantity(quantity);
		this.type = type;
		Random r = new Random();
		price = r.nextInt(1000);
	}
	
	public static Instrument newInstrument(String name, int quantity){
		if(duhovi.contains(name)){
			return new Instrument(name,quantity,"duhov");
		}
		if(udarni.contains(name)){
			return new Instrument(name,quantity,"udaren");
		}
		if(klavishni.contains(name)){
			return new Instrument(name,quantity,"klavishen");
		}
		if(strunni.contains(name)){
			return new Instrument(name,quantity,"strunen");
		}
		if(elektronni.contains(name)){
			return new Instrument(name,quantity,"elektronen");
		}
		System.out.println("Error. Unknown instrument type");
		return null;
	}
	
	public void increaseQuantity(int quantity) throws Exception{
		if(quantity>0){
			this.quantity.addAndGet(quantity);
		}else{
			throw new Exception("Error! Quantity must be a positive number.");
		}
	}
	
	public void decreaseQuantity(int quantity) throws Exception{
		if(quantity>0){
			this.quantity.addAndGet(-quantity);
		}else{
			throw new Exception("Error! Quantity must be a positive number. ");
		}
	}

	@Override
	public String toString() {
		return "Name: " + this.name + "\t, Quantity: " + this.quantity +
				"\t, Price: " + this.price + "\t, Type: " + this.type;
	}
	
	public void setName(String name){
		if(name!=null && !name.isEmpty()){
			this.name=name;
		}
	}
	
	public String getName(){
		return name;
	}
	
	public String getType(){
		return type;
	}
	public void setPrice(double price){
		if(price>=0){
			this.price = price;
		}
	}
	
	public double getPrice(){
		return price;
	}
	
	public void setQuantity(int quantity){
		this.quantity.set(quantity);
	}
	
	public int getQuantity(){
		return quantity.get();
	}
	
}
