package clazz.model.vo.animal;

public class Cat extends Animal{
	
	private int age;

	public Cat(String name, int age) {
		super(name);
		// TODO Auto-generated constructor stub
		this.age = age;
	}

	@Override
	public void bark() {
		// TODO Auto-generated method stub
		System.out.println(" \"meow meow\"");
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "The name is " + getName() + " and the age is " + age;
	}

}
