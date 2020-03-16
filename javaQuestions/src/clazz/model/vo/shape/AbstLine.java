package clazz.model.vo.shape;

public abstract class AbstLine extends Shape{

	private int length;
	
	public AbstLine(int length) {
		setLength(length);
	}

	public void setLength(int length) {
		// TODO Auto-generated method stub
		this.length = length;
	}
	
	public int getLength() {
		return length;
	}
	
	@Override
	public String toString() {
		return "AbstLine(length: " + length + ")";
	}
	
}
