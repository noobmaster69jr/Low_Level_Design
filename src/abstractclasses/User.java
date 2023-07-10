package abstractclasses;

public abstract class User {
	private String name;
	private String email;
	private String password;
	private String userType;

	User(String userType) {
		this.userType = userType;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPassword() {
		return password;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	abstract void saySomething();

	void updateEmail(String newEmail) {
		this.email = newEmail;
	}

	void changePassword(String newPassword) {
		this.password = newPassword;
	}

}
