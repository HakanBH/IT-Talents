package exceptions;

import java.io.IOException;

public class Grizach {
	int age;
	double weight;
	String name;
	
	public Grizach(int age, double weight, String name){
		this.age = age;
		this.weight = weight;
		this.name = name;
	}
	
	public void izqjSirene(String tip, double kolichestvo) 
					throws IOException{
		System.out.println("Izqde " +  kolichestvo + " grama " + tip.toLowerCase() + " sirene.");
	}
	
	public int getAge() {
		return age;
	}
	public double getWeight() {
		return weight;
	}
	public String getName() {
		return name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
