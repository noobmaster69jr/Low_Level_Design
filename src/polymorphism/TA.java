package polymorphism;

public class TA extends User {
	String expertise;
	String company;

	void takeHelpRequest() {
	}

	@Override
	void changeEmail() {
		System.out.println("Changing Email in TA");
	}
}
