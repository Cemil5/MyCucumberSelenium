package day33_classObject_constructors;

public class Student {
	
	String name;
	int age;
	char gender;
	int year;
	String course;
	String university = "Cybertek University";
	
	public Student(String name, int age, char gender, int year, String course) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.year = year;
		this.course = course;
	}
	
	public Student(String name, int age, char gender, int year, String course, String university) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.year = year;
		this.course = course;
		this.university = university;
	}



	public void attendLecture() {
		System.out.println(name + " is attending lecture");
	}
	public void submitAssignment() {
		System.out.println(name + " is submitting assignmet");

	}
	public void attendLab() {
		System.out.println(name + " is attending lab");

	}
	
}
