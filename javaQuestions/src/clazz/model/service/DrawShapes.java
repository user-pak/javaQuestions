package clazz.model.service;

import java.util.Scanner;

import clazz.model.vo.shape.HorzLine;
import clazz.model.vo.shape.Point;
import clazz.model.vo.shape.Rectangle;
import clazz.model.vo.shape.Shape;
import clazz.model.vo.shape.VertLine;

public class DrawShapes {

	private Scanner sc = new Scanner(System.in);
	
	public Shape drawPoint() {
		// TODO Auto-generated method stub
		return new Point();
	}

	public Shape drawLine(int type) {
		// TODO Auto-generated method stub
		int length;
		do{
			System.out.print("length: ");
			length = sc.nextInt();
		}while(length <= 0);
		
		return type == 2? new HorzLine(length) : new VertLine(length);
	}

	public Shape drawRectangle() {
		// TODO Auto-generated method stub
		int width, height;
		do {
			System.out.print("width : ");
			width = sc.nextInt();
			System.out.print("height : ");
			height = sc.nextInt();
		}while(width <= 0 || height <= 0);
		
		return new Rectangle(width, height);
	}

	
}
