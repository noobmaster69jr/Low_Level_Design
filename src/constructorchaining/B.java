package constructorchaining;

public class B extends A {
	private int c;

	public B() {
		super("raghav");
		this.a = 12;
//	        super()
		this.c = 3;
//	        this.b = 13; // error coz b is private
		System.out.println("Constructor of B");
	}
}
