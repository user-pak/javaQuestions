package clazz.model.vo.animal;

public abstract class Animal {

	private String name;
	
	public Animal(String name) {
		this.name = name;
	}
	
	public abstract void bark();
	
	public String getName() {
		return name;
	}
	@Override
	public abstract String toString();
	
	public void introduce() {
		System.out.println(toString());
		bark();
	}
}
