package Homework6_Classes_Objects;

public class College {

	public static void main(String[] args) {
		Student hakan = new Student("Hakan", "Computer Science", 21);
		Student pesho = new Student("Pesho" , "computer science", 25);
		Student mariyka = new Student("Mariyka" , "computer Science", 29);
		Student cveta = new Student("Cvetelina", "Engineering", 30);
		
		hakan.upYear();
		pesho.upYear();
		
		hakan.changeGrade(5);
		mariyka.changeGrade(5.5f);
		pesho.changeGrade(4.5f);
		
		hakan.receiveScholarship(5.0, 400);
		mariyka.receiveScholarship(5.0, 400);
		pesho.receiveScholarship(5.0, 400);
		cveta.receiveScholarship(5.0, 400);
		
		StudentGroup group = new StudentGroup("Computer Science");
		group.addStudent(hakan);
		group.addStudent(pesho);
		group.addStudent(mariyka);
		group.addStudent(cveta);
		
		group.printStudentsInGroup();

		System.out.println("\nBest student in group " + group.groupSubject + ": " + group.bestStudent());
	}
}
