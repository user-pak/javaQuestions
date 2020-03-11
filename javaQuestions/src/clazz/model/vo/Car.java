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
	
	public Car() {
//		System.out.println("to select a car");
	};
	
	public Car(int name, int number, //int width, int height, int length, double tankage, 
			double fuel//, double sfc
			) {
		super();
		switch(name) {
		case 1 : this.name = CarBrand.HYUNDAI;
				 this.width = 130;
				 this.height = 140;
				 this.length = 150; 
				 this.tankage = 20.0; break;
		case 2 : this.name = CarBrand.BENZ; 
				 this.width = 230;
				 this.height = 240;
				 this.length = 250;
				 this.tankage = 30.0; break;
		case 3 : this.name = CarBrand.AUDI;
				 this.width = 230;
				 this.height = 340;
				 this.length = 350;
				 this.tankage = 40.0; break;
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
	}
	
	public double getX() {
		return this.x;
	}
	
	public double getY() {
		return this.y;
	}
	
	public double getFuel() {
		return this.fuel;
	}
	
	@Override
	public String toString() {
		return "Car [name=" + name + ", number=" + number + ", width=" + width + ", height=" + height + ", length="
				+ length + ", tankage=" + tankage + ", fuel=" + fuel + ", sfc=" + sfc + "]";
	}
	
	public void selectCar() {
		for(CarBrand brand : CarBrand.values()) {
			System.out.print("[" + brand.ordinal() + "]" + brand + " ");
		}
	}
	
	public boolean move(double dx, double dy) {
		
		double distance = Math.sqrt(dx * dx + dy * dy);
		double consume = distance / this.sfc;
		if(consume > this.fuel) return false;
		else {
			this.fuel -= consume;
			this.x += dx;
			this.y += dy;
			return true;
		}
	}
	
	public void charge(double fuel) {
		if(fuel > 0) {
			this.fuel += fuel;
			if(fuel > this.tankage) this.fuel = this.tankage;
		}
	}
}
