package Homework8;

public class Student extends Person{
	private final int MIN_SCORE = 2;
	private final int MAX_SCORE = 6;
	private double score;
	
// 	За да дефинираме Student без параметри трябва първо да дефинираме конструктор 
// 	Person() без параметри или изобщо да нямаме конструктор в класа Person. В противен
// 	случай ще получим грешка т.к. Student() извиква Person(), който няма да съществува.
 	
	Student(){
		score = 2.6;
	}
	
	Student(String name, int age, boolean isMale , double score){
		super(name,age,isMale);
		if(score>=MIN_SCORE && score<=MAX_SCORE){
			this.score = score;
		}
	}
	@Override
	void showPersonInfo(){
		super.showPersonInfo();
		System.out.println("Score: " + score);
	}
	
	public double getScore(){
		return score;
	}
	
	public void setScore(double score){
		if(score>=MIN_SCORE && score<=MAX_SCORE){
		this.score = score;
		}
	}
}
