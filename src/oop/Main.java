package oop;

public class Main {
	public static void main(String[] args) {
		Student s = new Student();
		System.out.println(s.email);
		s.changeEmail("newemail@gmail.com");
		System.out.println(s.email);

		s.pauseCourse();
		System.out.println(s.course_status);

		System.out.print("we are running the main method here");
	}

}
