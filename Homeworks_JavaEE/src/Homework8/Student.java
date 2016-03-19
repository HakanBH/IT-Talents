package Homework8;

public class Student extends Person{
	private final int MIN_SCORE = 2;
	private final int MAX_SCORE = 6;
	private double score;
	
// 	�� �� ���������� Student ��� ��������� ������ ����� �� ���������� ����������� 
// 	Person() ��� ��������� ��� ������ �� ������ ����������� � ����� Person. � ��������
// 	������ �� ������� ������ �.�. Student() ������� Person(), ����� ���� �� ����������.
 	
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
