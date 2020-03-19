package clazz.model.vo.shape;

import clazz.model.service.Plane2D;

public class Parallelogram extends Shape implements Plane2D{

	private int width;
	private int height;
	
	public Parallelogram(int width, int height) {
		this.width = width;
		this.height = height;
	}
	@Override
	public int getArea() {
		// TODO Auto-generated method stub
		return width * height;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Parallelogram(width: " + width + " heigth: " + height + ")";
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		for(int i = 1; i <= height; i++) {
			for(int j = 1; j <= height - i; j++) {
				System.out.print(" ");
			}
			for(int j = 1; j <= width; j++) {
				System.out.print("#");
			}
			System.out.println();
		}
	}

}
