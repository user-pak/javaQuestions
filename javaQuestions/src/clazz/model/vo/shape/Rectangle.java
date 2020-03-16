package clazz.model.vo.shape;

public class Rectangle extends Shape{

	private int width;
	private int height;
	
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Rectangle(width: " + width + " height: " + height + ")";
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		for(int i = 1; i <= height; i++) {
			for(int j = 1; j <= width; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
