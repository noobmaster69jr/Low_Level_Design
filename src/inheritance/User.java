package inheritance;

public class User {
	public String name;
	String email;
	String password;

	String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	void saySomething() {
		System.out.println("Something");
	}

	void updateEmail(String newEmail) {
		this.email = newEmail;
	}

	void changePassword(String newPassword) {
		this.password = newPassword;
	}
}
