package oop;

public class Student {
	String name;
	String email;
	int batch_id;
	String address;
	String course_status;

	void changeEmail(String email) {
		this.email = email;
	}

	void pauseCourse() {
		this.course_status = "paused";
	}
}
