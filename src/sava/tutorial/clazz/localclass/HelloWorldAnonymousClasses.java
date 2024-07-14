package sava.tutorial.clazz.localclass;

public class HelloWorldAnonymousClasses {
	  
	interface HelloWorld {
		
		void greet();
	}
	
	void sayHello(String name) {
		
		class GreetEnglish implements HelloWorld{

			@Override
			public void greet() {
				// TODO Auto-generated method stub
				System.out.println("Hi! " + name);
			}
			
		}
		
		GreetEnglish greetEnglish = new GreetEnglish();
		
		HelloWorld greetFrench = new HelloWorld() {

			@Override
			public void greet() {
				// TODO Auto-generated method stub
				System.out.println("French: Salut! " + name);
			}
			
		};
		
		HelloWorld greetKorean = new HelloWorld() {

			@Override
			public void greet() {
				// TODO Auto-generated method stub
				System.out.println("Korean: 안녕! " + name);
			}
			
		};
		greetEnglish.greet();
		greetFrench.greet();
		greetKorean.greet();
	}
	
	public static void main(String[] args) {
		HelloWorldAnonymousClasses myApp = new HelloWorldAnonymousClasses();
		myApp.sayHello("hello");
		
	}
}
