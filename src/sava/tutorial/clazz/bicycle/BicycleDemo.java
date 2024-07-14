package sava.tutorial.clazz.bicycle;

public class BicycleDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bicycle mountainBicycle1 = new MountainBicycle();
		MountainBicycle mountainBicycle = new MountainBicycle();
		Bicycle bicycle1 = new Bicycle();
		Bicycle bicycle2 = new Bicycle();
		Bicycle mountainBicycle2 = new MountainBicycle();
		
		System.out.println(bicycle1);
		System.out.println(bicycle2);
		System.out.println(bicycle1.toString());
		System.out.println(mountainBicycle1.toString());
		System.out.println(bicycle1.equals(bicycle2));
		System.out.println(mountainBicycle1.equals(mountainBicycle2));
		
		Bicycle[] bicycles = new Bicycle[2];
		bicycles[0] = new MountainBicycle();
		bicycles[1] = new MountainBicycle();
		System.out.println(bicycles[0].toString());
		
		

	}

}
