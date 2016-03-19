package Homework8;

public class Employee extends Person{
	private final double OVERTIME_COEF = 1.5;
	private final int OVERTIME_MIN_AGE = 18;	
	private double daySalary;
	
	Employee(String name, int age, boolean isMale, double daySalary){
		super(name, age, isMale);
		if(daySalary > 0){
			this.daySalary = daySalary;
		}
	}
	
	@Override
	void showPersonInfo(){
		 super.showPersonInfo();
		 System.out.println("Salary: " + daySalary);
	}
	
	double calculateOvertime(double hours){
		if(super.age<=OVERTIME_MIN_AGE){
			return 0;
		}
		else{
			return hours*(OVERTIME_COEF*daySalary);
		}
	}
	
	double getDaySalary(){
		return daySalary;
	}
	
	void setDaySalary(double daySalary){
		if(daySalary >= 0){
			this.daySalary = daySalary;
		}
	}
}	