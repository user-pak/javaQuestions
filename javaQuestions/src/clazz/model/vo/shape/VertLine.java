package clazz.model.vo.shape;

public class VertLine extends AbstLine{

	public VertLine(int length) {
		super(length);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		for(int i = 1; i <= getLength(); i++) {
			System.out.println("|");
		}
		System.out.println();
	}
	
	@Override
	public String toString() {
		return "VertLine(length : " + getLength() + ")";
	}

}
