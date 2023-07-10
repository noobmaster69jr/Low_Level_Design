package abstractclasses;

public class Client {

	public static void main(String args[]) {
		Instructor instructor = new Instructor();

		instructor.setName("ashwin");
		// User user = new User(); - abstract class
		instructor.setDescription("Super Cool");
		instructor.saySomething();
		System.out.println(instructor.getName());

		Mentor mentor = new Mentor();
//        mentor.name = "Abhimanyu";
//        mentor.email = "Abvhimanyu@gmila.com";
//        mentor.description = "Boss";        - not visible(private)

		User user = new Mentor();
		user.changePassword("hello");
		user.saySomething();
		System.out.println(user.getName());

		System.out.print(mentor.getDescription());
//		System.out.print(user.getDescription()); 
// 				- here we are trying to access child specific from parent container

	}

}
