package constructors;

public class Student {
	String name;
	String address;
	int phone_no;

	Student() {

	}

	Student(String name, String address) {
		this.name = name;
		this.address = address;

	}

	Student(Student student) { // copy constructor
		this.name = student.name;
		this.address = student.address;
	}

	void Details() {
		System.out.println("Hello i'm " + name + " and i live at " + address + ".");
	}
}
