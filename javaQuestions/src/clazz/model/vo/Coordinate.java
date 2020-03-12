package clazz.model.vo;

public class Coordinate {

	private double x = 0.0;
	private double y = 0.0;
	
	public Coordinate() {}
	
	public Coordinate(double x, double y) {
		super();
		set(x,y);
	}
	
	public Coordinate(Coordinate cod) {
//		this.x = cod.x;
//		this.y = cod.y;
		this(cod.x, cod.y);
	}
	
	public void setX(double x) {
		this.x = x;
	}
	
	public void setY(double y) {
		this.y = y;
	}
	
	public double getX() {
		return this.x;
	}
	
	public double getY() {
		return this.y;
	}
	
	public void set(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public boolean equalTo(Coordinate cod) {
		return cod.x == this.x && cod.y == this.y;
	}
	
	@Override
	public String toString() {
		return "(" + this.x + "," + this.y + ")";
	}
}
