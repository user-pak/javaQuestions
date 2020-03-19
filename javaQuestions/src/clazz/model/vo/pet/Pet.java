package clazz.model.vo.pet;

import clazz.model.vo.animal.Animal;

public class Pet extends Animal{

	private String masterName;
	
	public Pet(String petName, String masterName) {
		super(petName);
		// TODO Auto-generated constructor stub
		this.masterName = masterName;
	}
	
	public String getPetName() {
		return super.getName();
	}
	
	public String getMasterName() {
		return masterName;
	}

	@Override
	public void bark() {
		// TODO Auto-generated method stub
		System.out.println("\"bark bark\"");
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "My name is " + super.getName() + " and my Master name is " + masterName;
	}

}
