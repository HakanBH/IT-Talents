package Homework8;

public class Demo {
	public static void main(String[] args) {
		Person[] people = new Person[10];
		people[0] = new Person("Mariq", 28 , false);
		people[1] = new Person("Ivan" , 40, true);
		people[2] = new Student("Martin" , 21, true, 5.123);
		people[3] = new Student("Hakan", 21, true, 5.25);
		people[4] = new Employee("Galq" , 20, false, 20);
		people[5] = new Employee("Pesho" , 30, true, 25);
		
		for(int index=0; index < people.length; index++){
			if(people[index] != null){
				people[index].showPersonInfo();
				System.out.println("");
			}
		}
		
		for(int index=0; index < people.length; index++){
			if(people[index]!=null && people[index] instanceof Employee){
				System.out.println(people[index].calculateOvertime(2));
			}
		}
		
		double a = 4.35;
		int b = 6;
		System.out.println(a>b);
	}
}
