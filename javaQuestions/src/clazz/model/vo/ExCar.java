package clazz.model.vo;

public class ExCar extends Car{

	private double totalMileage;
	
	public ExCar(String name, int width, int height, int length, double fuel, Day purchaseday) {
		super(name, width, height, length , fuel, purchaseday);
		totalMileage = 0.0;
	}
	public double getTotalMileage() {
		return totalMileage;
	}
	@Override
	public String toString() {
		return super.toString() + ", totalMileage=" + totalMileage + "]";
	}
	public boolean move(double dx, double dy) {
		
		double distance = Math.ceil(Math.sqrt(dx * dx + dy * dy));
		if(super.move(dx, dy)) {
			totalMileage += distance;
			return true;
		}
		return false;
	}
	
}
