package clazz.model.vo;

public class Id {

	private static int counter = 0;
	public static int pseudo = 0;
	
	private int id;
	private static int step = 1;
	
	public Id() {
//		this.id = ++counter;
		this.id = counter += step;
	}
	
	public int getId() {
		return this.id;
	}
	
	public static int getMaxId() {
		return counter;
	}
	
	public static int getStep() {
		return Id.step;
	}
	
	public static void modifyStep(int step) {
		Id.step = step>0? step : 1;
	}
}
