package Homework6_Classes_Objects;

public class StudentGroup {
	String groupSubject;
	Student[] students;
	short freePlaces;

	StudentGroup() {
		freePlaces = 5;
		students = new Student[5];
	}

	StudentGroup(String subject) {
		this();
		if (subject != null && !subject.isEmpty()) {
			groupSubject = subject;
		}
	}

	void addStudent(Student s) {
		if (s == null) {
			System.out.println("Error! Can't add student. \n");
		} else {
			if (s.subject.equalsIgnoreCase(groupSubject) && freePlaces > 0) {
				students[students.length - freePlaces] = s;
				freePlaces--;
			} else {
				System.out.println("Error! Can't add " + s.name + " to " + groupSubject + "\n");
			}
		}
	}

	void emptyGroup() {
		freePlaces = 5;
		students = new Student[5];
	}

	String bestStudent() {
		float bestGrade = 0;
		int bestGradeIndex = 0;
		for (int i = 0; i < students.length - freePlaces; i++) {
			if (students[i].grade > bestGrade) {
				bestGrade = students[i].grade;
				bestGradeIndex = i;
			}
		}
		return students[bestGradeIndex].name;
	}

	void printStudentsInGroup() {
		for (int i = 0; i < students.length - freePlaces; i++) {
			students[i].printStudentInfo();
		}
	}
}
