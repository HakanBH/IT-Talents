package Homework7_Encapsulation;

public class Workplace {
	public static void main(String[] args) {
		Task wash = new Task("Wash cars", 6);
		Task paint = new Task("Paint house", 8);
		Employee hakan = new Employee("Hakan");
		
		hakan.setHoursLeft(8);
		hakan.setCurrentTask(wash);
		hakan.work();
		hakan.showReport();
		
		System.out.println("");
		
		hakan.setCurrentTask(paint);
		hakan.work();
		hakan.showReport();
	}
}
