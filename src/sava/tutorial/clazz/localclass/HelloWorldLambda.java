package sava.tutorial.clazz.localclass;

public class HelloWorldLambda {
	  
	interface HelloWorld {
		
		void greet(String name);
	}
	
	void sayHello(String name, HelloWorld hello) {
		
		hello.greet(name);		

	}
	
	void invoke(HelloWorld helloWorld) {
		
		helloWorld.greet(str);
	}
	
	String str = "myName";
	public static void main(String[] args) {
		HelloWorldLambda myApp = new HelloWorldLambda();
		HelloWorld greetEnglish = name -> System.out.println("Hi! " + name);
		HelloWorld greetFrench = name -> System.out.println("Salut! " + name);
		HelloWorld greetKorean = name -> System.out.println("안녕! " + name);
		myApp.sayHello("English", greetEnglish);
		myApp.sayHello("French", greetFrench);
		myApp.sayHello("Korean", greetKorean);
		myApp.invoke((str) -> System.out.println(str));
	}
}
