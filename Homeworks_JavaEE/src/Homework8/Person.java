package Homework8;

public class Person {
	protected int age;
	protected boolean isMale;
	protected String name;
	
	Person(){
		name = "Unknown";
		//	age и isMale си остават 0 и false
	}
	
	Person(String name, int age, boolean isMale){
		if(name != null && !name.isEmpty()){
			this.name = name;
		}
		if(age >= 0){
			this.age = age;
		}
		this.isMale = isMale;
	}
	
	void showPersonInfo(){
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		if(isMale){
			System.out.println("Gender: Male");
		}
		else{
			System.out.println("Gender: Female");
		}
	}
	
	double calculateOvertime(double hours){
		return 0;
	}

	public int getAge() {
		return age;
	}

	public boolean isMale() {
		return isMale;
	}

	public String getName() {
		return name;
	}

	public void setAge(int age) {
		if(age >= 0){
			this.age = age;
		}
	}

	public void setName(String name) {
		if(name != null && !name.isEmpty()){
			this.name = name;
		}	
	}
}
