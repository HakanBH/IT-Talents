package CourtTask;

public abstract class Citizen extends Person{
	private String address;
	private int age;
	
	Citizen(String name){
		super(name);
	}
	
	Citizen(String name, String address, int age){
		super(name);
		setAge(age);
		setAddress(address);
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		if(address!=null && !address.isEmpty()){
			this.address = address;
		}
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		if(age>=0){
			this.age = age;
		}
	}
}
