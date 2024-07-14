package sava.tutorial.inheritance;

public class Override extends Overridden{

	
	static void testClassMethod() {
		
		System.out.println("The static method in Cat");
		
	}
	
	void testInstanceMethod() {
		
		System.out.println("The instance method in Cat");
	}
	
	public static void main(String[] args) {
		
		Override cat = new Override();
		Overridden animal = cat;
		Override.testClassMethod();
		Overridden.testClassMethod();
		cat.testInstanceMethod();
		animal.testInstanceMethod();
		Overridden dog = new Overridden();
		dog.testInstanceMethod();

	}
	
}
