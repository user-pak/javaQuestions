package sava.tutorial.clazz.figure;

public class Point {

	public int x;
	public int y;
	
	public Point() {}
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	
	
	public void draw(int a) {
		
		
	}
	
//	public int draw(int a) {
//		
//		return 1;
//	}
	
	public void draw(int... points) {
		
		int sum = 0;
		for(int i = 0; i < points.length; i++) {
			sum += points[i];
		}
		System.out.println(sum);
		
	}
	
	public void printString(String...strings ) {
		
		for(int i = 0; i < strings.length; i++) {
			System.out.print(strings[i] + " ");
		}
	}
	
	public void movePoint(Point point, int z, int w) {
		
		point.x = point.x + z;
		point.y = point.y + w;
		
		System.out.println(point.x + " " + point.y);
		System.out.println(point);
		point = new Point(0,0);
		
		System.out.println(point.x + " /" + point.y);
		System.out.println(point);
		
	}

}
