package Homework_Warehouse;

import java.util.ArrayList;
import java.util.Arrays;

public class Product {	
	private String name;
	private String type;

	private Product(String name,String type){
		setName(name);
		setType(type);
	}
	
	public static Product newProduct(String name){
		name = name.toLowerCase();
		if( Arrays.asList("banana", "orange", "apple").contains(name)){
			return new Product(name, "Fruit");
		}
		if(Arrays.asList("potato", "eggplant", "cucumber").contains(name)){
			return new Product(name, "Vegetable");
		}
		if(Arrays.asList("pork", "beef", "chicken").contains(name)){
			return new Product(name, "Meat");
		}
		else{
			System.out.println("Unknown product!");
			return null;
		}
	}
	
	public String getName() {
		return name;
	}

	public String getType() {
		return type;
	}
	
	public void setName(String name) {
		if(name!=null && !name.isEmpty())
			this.name = name;
	}
	
	public void setType(String type) {
		if(type!=null && !type.isEmpty()){
			this.type = type;			
		}
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Product){
			Product prod = (Product)(obj);
			return this.name.equals(prod.name);
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return name.hashCode();
	}
	@Override
	public String toString() {
		return this.name + ", " + this.type;
	}
}


