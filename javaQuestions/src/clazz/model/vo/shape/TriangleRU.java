package clazz.model.vo.shape;

public class TriangleRU extends AbstTriangle{

	public TriangleRU(int length) {
		super(length);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		for(int i = getLength(); i >=1; i--) {
			for(int j = 1; j <= getLength() - i; j++) {
				System.out.print(" ");
			}
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public String toString() {
		return "TriangleRU(length: " + getLength() + ")";
	}

}
