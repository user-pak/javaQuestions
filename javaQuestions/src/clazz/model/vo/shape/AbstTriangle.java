package clazz.model.vo.shape;

public abstract class AbstTriangle extends Shape{

	private int length;
	
	public AbstTriangle(int length) {
		setLength(length);
	}

	public void setLength(int length) {
		this.length = length;
	}
	
	public int getLength() {
		return length;
	}
	
	public String toString() {
		return "AbstTriangle(length: " + length + ")";
	}
 	
}
