package sava.tutorial.clazz.figure;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Point point = new Point();
//		point.draw(1,2);
//		int[] ints = {3,4};
//		point.draw(ints);
//		point.draw(5,6,7);
//		point.printString("a", "b", "c");
//		String commaSeperatorStr = "d,e,f";
//		String[] strings = commaSeperatorStr.split(",");
//		point.printString(strings);
//		System.out.println();
		Point myPoint = new Point(1,2);
		System.out.println(myPoint.x + " " + myPoint.y);
		System.out.println(myPoint);
		myPoint.movePoint(myPoint, 1, 1);
		System.out.print("****");
		System.out.println(myPoint);
		System.out.println(myPoint.x +" " +  myPoint.y );
	}

}
