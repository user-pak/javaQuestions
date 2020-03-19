package clazz.model.vo.pet;

public class RobotPet extends Pet{

	public RobotPet(String petName, String masterName) {
		super(petName, masterName);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "I'm a robot. My name is " + super.getPetName() + " and my Master name is " + super.getMasterName();
	}
	
	public void work(int workingType) {
		switch(workingType) {
		case 0 : System.out.println("start to clean");
		case 1 : System.out.println("doing laundry");
		case 2 : System.out.println("prepare a meal");
		}
	}
}
