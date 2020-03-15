package clazz.model.vo;

import java.util.GregorianCalendar;
import static java.util.GregorianCalendar.*;

public class Point2D {

	private static int counter = 0;
	private static int day;
	
	private int x = 0;
	private int y = 0;
	
	static {
		GregorianCalendar calendar = new GregorianCalendar();
		day = calendar.get(DATE);
	}
	
	{
		if(++counter == day) {
			System.out.println("winning!");
			System.out.println(counter + " Point2D has been constructed");
		}
	}
	
	public Point2D() {}
	
	public Point2D(int x) {
		this.x = x;
	}
	public Point2D(int x, int y) {
		this(x);
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public static int getCounter() {
		return counter;
	}
	@Override
	public String toString() {
		return "(" + x + " , " + y + ")";
	}
}
