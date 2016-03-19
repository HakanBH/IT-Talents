package Homework9;

public class Workplace {
	public static void main(String[] args) {
		Employee hakan = new Employee("Hakan");
		Employee martin = new Employee("Martin");
		Employee bojo = new Employee("Bojo");
		
		AllWork workToDo = new AllWork();

		//всички задачи отнемат 10 часа за изпълнение 
		for(int i=0; i<AllWork.MAX_TASKS; i++){		
			workToDo.addTask(new Task("Task "+(i+1), 10));
		}
		
		hakan.setAllWork(workToDo);
		martin.setAllWork(workToDo);
		bojo.setAllWork(workToDo);
		
		int day = 1;
 		while(!workToDo.isAllWorkDone()){
			System.out.println("Day " + day);
			hakan.startWorkingDay();
			martin.startWorkingDay();
			bojo.startWorkingDay();
			
			hakan.work();		
			martin.work();
			bojo.work();
			
			day++;
		}
 		System.out.println("All work is done!");
	}
}
