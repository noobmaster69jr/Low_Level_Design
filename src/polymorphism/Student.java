package polymorphism;

public class Student extends User {
	String batch;
	double psp;
	Mentor mentor;

	void changeBatch() {
	}

	@Override
	void changeEmail() {
		System.out.println("Changing Email in Student");
	}
}
