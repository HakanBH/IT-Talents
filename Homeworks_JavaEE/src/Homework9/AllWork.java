package Homework9;

public class AllWork {
	static final int MAX_TASKS = 10;
	private Task[] tasks;
	private int freePlacesForTasks;
	private int currentUnassignedTask;

	public AllWork(){
		tasks = new Task[MAX_TASKS];
		freePlacesForTasks = MAX_TASKS;
	}
	
	public void addTask(Task newTask){
		if(newTask != null){
			if(freePlacesForTasks != 0){
				tasks[MAX_TASKS-freePlacesForTasks] = newTask;
				freePlacesForTasks--;
			}
			else{
				System.out.println("Tasks list is full.");
			}
		}
	}
	
	public Task getNextTask(){
		if(currentUnassignedTask<MAX_TASKS ){
			return tasks[currentUnassignedTask++];
		}
		System.out.println("No more tasks to assign.");
		return null;
	}
	
	public boolean isAllWorkDone(){
		for(int i=0; i<MAX_TASKS; i++){
			if(tasks[i] != null){
				if(tasks[i].getWorkingHours()!=0){
					return false;
				}
			}
		}
		return true;
	}
	
	public int getFreePlacesForTasks(){
		return freePlacesForTasks;
	}
	
	public int getCurrentUnassignedTask(){
		return currentUnassignedTask;
	}
}
