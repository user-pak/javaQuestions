package clazz.model.vo;

public class ExCar extends Car{

	private double totalMileage;
	
	public ExCar(int name, int number, double fuel, Day purchaseday) {
		super(name, number, fuel);
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
