package Homework11.Scheduler;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/* Не съм сигурен дали правилно съм разбрал идеята на задачата... */

public class Scheduler {
	private Queue<Task> tasks;

	public Scheduler() {
		tasks = new LinkedBlockingQueue<Task>(); 
	}

	public void push(Task task) {
		tasks.add(task);
	}

	public void main() {
		for (int i = 0; i < 5; i++) {
			push(new DoNothing());
		}
		for (int i = 0; i < 5; i++) {
			push(new WashDishes());
		}
		for (int i = 0; i < 5; i++) {
			push(new MakeTaskImplementations());
		}
		for (int i = 0; i < 5; i++) {
			push(new WriteHomework());
		}
		
		while(!tasks.isEmpty()){
			tasks.peek().doWork();
			tasks.poll();
		}
	}
}
