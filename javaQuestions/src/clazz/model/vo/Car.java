package clazz.model.vo;

public class Car {
	
	enum CarBrand {
		
		HYUNDAI, BENZ, AUDI,
		;
	}

	private CarBrand name;
	private int number;
	private int width;
	private int height;
	private int length;
	private double x;
	private double y;
	private double tankage;
	private double fuel;
	private double sfc;
	
	private Day purchaseday;
	private String carname;
	
	public Car() {
//		System.out.println("to select a car");
	};
	
	public Car(String carname, int width, int height, int length, double fuel, Day purchaseday) {
		this.carname = carname;
		this.width = width;
		this.height = height;
		this.length = length;
		this.fuel = fuel;
		this.x = this.y = 0.0;
		this.sfc = 1;
		this.tankage = 100.0;
		this.purchaseday = new Day(purchaseday);
	}
	
	public Car(int name, int number, //int width, int height, int length, double tankage, 
			double fuel//, double sfc
			) {
		super();
		switch(name) {
		case 0 : this.name = CarBrand.HYUNDAI;
				 this.width = 130;
				 this.height = 140;
				 this.length = 150; 
				 this.tankage = 20.0;
				 this.sfc = 0.3; break;
		case 1 : this.name = CarBrand.BENZ; 
				 this.width = 230;
				 this.height = 240;
				 this.length = 250;
				 this.tankage = 30.0;
				 this.sfc = 0.5; break;
		case 2 : this.name = CarBrand.AUDI;
				 this.width = 230;
				 this.height = 340;
				 this.length = 350;
				 this.tankage = 40.0;
				 this.sfc = 0.7; break;
		}
		this.number = number;
 //		this.width = width;
//		this.height = height;
//		this.length = length;
//		this.tankage = tankage;
		this.fuel = fuel <= tankage? fuel: tankage;
//		this.sfc = sfc;
		this.x = this.y = 0.0;
//		System.out.println("A car is produced");
//		this.purchaseday = new Day();
	}
	
	public CarBrand getName() {
		return this.name;
	}
	
	public double getX() {
		return this.x;
	}
	
	public double getY() {
		return this.y;
	}
	
	public double getFuel() {
		return Math.ceil(this.fuel);
	}
	
	public Day getPurchaseday() {
		return new Day(purchaseday);
	}
	
	@Override
	public String toString() {
		return "Car [name=" + (name != null? name : carname) + ", number=" + (number != 0? number : "exCar") + ", width=" + width + ", height=" + height + ", length="
				+ length + ", tankage=" + tankage + ", fuel=" + fuel + ", sfc=" + sfc + (purchaseday != null? ", purchaseDay=" + purchaseday + "]": "]");
	}
	
	public void selectCar() {
		for(CarBrand brand : CarBrand.values()) {
			System.out.print("[" + brand.ordinal() + "]" + brand + " ");
		}
	}
	
	public boolean move(double dx, double dy) {
		
		double distance = Math.ceil(Math.sqrt(dx * dx + dy * dy));
		System.out.println("distance: " + distance);
		double consumption = Math.ceil(distance / this.sfc);
		System.out.println("estimated consumption: " + consumption);
		if(consumption > this.fuel) {
			System.out.println("cant move! not enough fuel");
			return false;
		}
		else {
			this.fuel -= consumption;
			this.x += dx;
			this.y += dy;
			System.out.println("move!");
			return true;
		}
	}
	
	public void charge(double fuel) {
		if(fuel > 0) {
			this.fuel += fuel;
			if(this.fuel > this.tankage) this.fuel = this.tankage;
		}
	}
	
	public void printLocation() {
		System.out.println("current location : (" + x + "," + y + ")");
	}

}
