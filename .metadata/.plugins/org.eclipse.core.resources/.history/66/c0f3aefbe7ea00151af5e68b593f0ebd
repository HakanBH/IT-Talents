	package mobile.model;

import java.util.LinkedList;
import java.util.List;
import java.util.Set; 
import java.util.TreeSet;

public abstract class Vehicle {
	private String condition;
	private String brand;
	private String model;
	private String currency;
	private String color;
	private int price;
	private String month;
	private int year;
	
	private List<Extra> extras;	
	
	public Vehicle(String cond, String brand, String model, String currency, String color, int price,
			int year, String month){
		extras = new LinkedList<Extra>();	
		setBrand(brand);
		setCondition(cond);
		setCurrency(currency);
		setModel(model);
		setColor(color);
		setPrice(price);
		setYear(year);
		setMonth(month);
	}
	
	public String getCondition() {
		return condition;
	}

	public String getBrand() {
		return brand;
	}

	public String getModel() {
		return model;
	}

	public String getCurrency() {
		return currency;
	}

	public String getColor(){
		return color;
	}

	public int getPrice() {
		return price;
	}	
	public int getYear() {
		return year;
	}
	public String getMonth(){
		return month;
	}

	public void setCondition(String condition) {
		if(condition!=null && !condition.isEmpty()){
			this.condition = condition;
		}
	}

	public void setBrand(String brand) {
		if(brand !=null && !brand .isEmpty()){
			this.brand  = brand ;
		}
	}

	public void setModel(String model) {
		if(model !=null && !model .isEmpty()){
			this.model = model ;
		}
	}

	public void setCurrency(String currency) {
		if(currency!=null && !currency.isEmpty()){
			this.currency = currency;
		}
	}
	
	public void setColor(String color){
		if(color!=null && !color.isEmpty()){
			this.color=color;
		}
	}

	public void setPrice(int price) {
		if(price >= 0){
			this.price = price;
		}
	}
	
	public void addExtra(Extra extra){
		if(extra!=null){
			extras.add(extra);
		}
	}	
	
	public void setYear(int year) {
		this.year = year;
	}
	
	private void setMonth(String month) {
		if(month != null){
			this.month=month;
		}
	}
}
