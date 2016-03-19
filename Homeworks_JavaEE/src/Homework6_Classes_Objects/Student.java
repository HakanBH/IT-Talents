package Homework6_Classes_Objects;

public class Student {
	String name;
	String subject;
	float grade;
	byte year;
	int age;
	boolean hasDegree;
	double money;

	Student(){
		grade = 4.0f;
		year = 1;
		hasDegree = false;
		money = 0;
	}
	Student(String name, String subject, int age){
		this();
		if(name != null && !name.isEmpty()){
			this.name = name;
		}
		if(subject != null && !subject.isEmpty()){
			this.subject = subject;
		}
		if(age > 0){							//или аge > 18
			this.age = age;
		}
	}
	void upYear(){
		if(year == 4){
			hasDegree = true;
			return;
		}
		year++;

	}
	double receiveScholarship(double min, double amount){
		if(amount>0 && min>2 && this.age < 30 && this.grade >= min){
			money += amount;
		}
		return money;
	}
	void changeGrade(float newGrade){
		if(newGrade >= 2 && newGrade <= 6){
			grade = newGrade;
		}
	}
	void printStudentInfo(){
		System.out.println(name + "\t" + age + "\t" + subject + "\t" + year + "\t" + grade + "\t"+ money);
	}
}
