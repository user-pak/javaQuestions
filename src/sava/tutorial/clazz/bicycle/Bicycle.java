package sava.tutorial.clazz.bicycle;

public class Bicycle {

	protected int cadence;
	protected int speed;
	protected int gear;
	private static int numberOfBicycles;
	
	static {
		
		numberOfBicycles = 100;
	}
	
	protected final void initializeInstanceVariable(int newValue) {
		
		numberOfBicycles =newValue;
	}
	
	{
		cadence = 0;
		speed = 0;
		gear = 1;
	}
	
	public Bicycle() {
		++numberOfBicycles;
		System.out.println(numberOfBicycles);
	}
	
	public void changeCadence(int newValue) {
		
		cadence = newValue;
	}
	

	public void changeGear(int newValue) {
		
		gear = newValue;
	}
	
	public void speedUp(int increment) {
		
		speed += increment;
	}
	
	public void speedDown(int decrement) {
		
		speed -= decrement;
	}
	
	public void printState() {
		
		System.out.println("gear:" + gear + "cadence: " + cadence + "speed: " + speed);
	}
	

	

}
