package clazz.model.vo.shape;

public class TriangleLU extends AbstTriangle{

	public TriangleLU(int length) {
		super(length);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		for(int i = 0; i < getLength(); i++) {
			for(int j = 0; j < getLength() - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public String toString() {
		return "TriangleLU(length: " + getLength() + ")";
	}

}
