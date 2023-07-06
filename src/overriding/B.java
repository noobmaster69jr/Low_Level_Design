package overriding;

public class B extends A {
	@Override
	void doSomething() {
		super.doSomething(); // calling overridden method inside overriding method
		System.out.println("After overloading , inside B");
	}
}
