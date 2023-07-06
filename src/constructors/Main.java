package constructors;

public class Main {
	public static void main(String[] args) {
		Student student1 = new Student("ash", "bheem nagar");
		System.out.println(student1.name);

		student1.Details();

		Student student2 = new Student(student1);
		student2.Details();

		student1.name = "ashwin"; // change in name did not affect student2
		student2.name = "asheen";

		student1.Details();
		student2.Details();
	}
}
