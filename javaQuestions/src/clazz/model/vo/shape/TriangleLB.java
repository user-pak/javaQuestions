package clazz.model.vo.shape;

public class TriangleLB extends AbstTriangle{

	public TriangleLB(int length) {
		super(length);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		for(int i = 1; i <= getLength(); i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
	public String toString() {
		return "TriangleLB(length : " + super.getLength() + ")";
	}

}
