package clazz.model.vo.animal;

public class Dog extends Animal{
	
	private String type;

	public Dog(String name, String type) {
		super(name);
		// TODO Auto-generated constructor stub
		this.type = type;
	}

	@Override
	public void bark() {
		// TODO Auto-generated method stub
		System.out.println(" \"woof woof\"");
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "The name is " + super.getName() + " and the type is " + type;
	}

	
}
