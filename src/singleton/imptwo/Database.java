package singleton.imptwo;

public class Database {
	private static Database instance = new Database(null, null); // Eager loading

	private Database(String url, String hostname) {
	}

	public static Database getInstance() {
		return instance;
	}
}
