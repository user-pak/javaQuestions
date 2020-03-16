package clazz.model.vo.shape;

public abstract class Shape {

	@Override
	public abstract String toString();
	
	public abstract void draw();
	
	public void print() {
		System.out.println(toString());
		draw();
	}
}
