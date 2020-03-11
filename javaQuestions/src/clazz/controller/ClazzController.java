package clazz.controller;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Random;
import java.util.Scanner;

import clazz.model.vo.Car;
import clazz.model.vo.Human;

public class ClazzController {

	private Scanner sc = new Scanner(System.in);
	private Random random = new Random();
	
	public void humanTester() {
		
		Human changSu = new Human("ChangSu", 172, 68);
		Human jiEun = new Human("JiEun", 165, 50);
		
		changSu.gainWeight(3);
		jiEun.loseWeight(2);
		
		System.out.println(changSu.toString());
		System.out.println(jiEun.toString());
		
	}
	
	public void getPassword() {
		
		System.out.print("password: ");
		String rawPW = sc.nextLine();
		try {
			MessageDigest digest = MessageDigest.getInstance("SHA-256");
			digest.update(rawPW.getBytes());
			byte[] bytes = digest.digest();
			StringBuilder pw = new StringBuilder();
			//byte[] to String(hexadecimal)
			for(byte b : bytes) {
		        pw.append(Integer.toString((b & 0xff) + 0x100, 16).substring(1));
		    }
			System.out.println("encoded pw: " + pw);
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void carTester() {
		// TODO Auto-generated method stub
		Car brand = new Car();
		brand.selectCar();
			int name = sc.nextInt(); 
			System.out.print("fuel: " );
			double fuel = sc.nextDouble();
			Car car = new Car(name, (random.nextInt(1000) + 1), fuel);
			System.out.println(car.toString());
	}

	private boolean confirm() {
		// TODO Auto-generated method stub
		System.out.print("is more produced?(Y/N): ");
		String more = sc.nextLine();
		if(more.substring(0).equalsIgnoreCase("Y")) return true;
		else return false;
	}
}
