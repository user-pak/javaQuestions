package clazz.model.vo.shape;

public class HorzLine extends AbstLine{

	public HorzLine(int length) {
		super(length);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		for(int i = 1; i <= getLength(); i++) {
			System.out.print("-");
		}
		System.out.println();
	}
	
	@Override
	public String toString() {
		return "HorzLine(length: " + getLength() + ")";
	}

}
