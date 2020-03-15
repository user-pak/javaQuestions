package clazz.controller;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Random;
import java.util.Scanner;

import clazz.model.service.Days;
import clazz.model.vo.Account;
import clazz.model.vo.Car;
import clazz.model.vo.Coordinate;
import clazz.model.vo.Day;
import clazz.model.vo.Human;
import clazz.model.vo.Id;
import clazz.model.vo.Period;
import clazz.model.vo.Point2D;

public class ClazzController {

	private Scanner sc = new Scanner(System.in);
	private Random random = new Random();
	
	public void humanTester() {
		
		Human changSu = new Human("ChangSu", 172, 68, getDay());
		Human jiEun = new Human("JiEun", 165, 50, getDay());
		
		changSu.gainWeight(3);
		jiEun.loseWeight(2);
		
		System.out.println(changSu.toString());
		System.out.println("id: " + changSu.getId());
		System.out.println(jiEun.toString());
		System.out.println("id: " + jiEun.getId());
		
		
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
		Car[] car = new Car[10];
		int i = 0;
		do {
			System.out.println("cars producing");
			brand.selectCar();
			int name = sc.nextInt(); 
			System.out.print("fuel: " );
			double fuel = sc.nextDouble();
			sc.nextLine();
			car[i] = new Car(name, (random.nextInt(1000) + 1), fuel);
			System.out.println(car[i].toString());
			System.out.println(car[i].hashCode());
			i++;
			System.out.print("is more produced?(Y/N): ");
		}while(confirm());
		
		do {
			System.out.print("Do you want to drive?(Y/N): ");
			do {
				if(confirm()) {
					for(int j = 0; j < i; j++) System.out.println("car[" + j + "]" + car[j].getName() + " ");
					System.out.print("which one?: ");
					int choice = sc.nextInt();
					boolean flag;
					do {
					System.out.print("width: ");
					int width = sc.nextInt();
					System.out.print("height: ");
					int height = sc.nextInt();
						System.out.println("current position: (" + car[choice].getX() +"," + car[choice].getY() + ") fuel: " + car[choice].getFuel());
						flag = car[choice].move(width, height);
						sc.nextLine();
						if(flag) System.out.print("further? ");
						else {
							System.out.print("do you want to charge? ");
							if(confirm()) {
								System.out.print("how much? ");
								car[choice].charge(sc.nextDouble());
								sc.nextLine();
								flag = true;
								System.out.print("further? ");
							}
						}
					}while(confirm());
				}
			}while(confirm());
		}while(confirm());
	}

	private boolean confirm() {
		// TODO Auto-generated method stub
		String answer = sc.nextLine();
		if(answer.substring(0).equalsIgnoreCase("Y")) return true;
		else return false;
	}
	
	public void CoordinateTester() {
		
		System.out.println("enter coordinates");
		System.out.print("x: ");
		double x = sc.nextDouble();
		System.out.print("y: ");
		double y = sc.nextDouble();
		Coordinate cod = new Coordinate(x, y);
		System.out.println(cod.toString());
		
		Coordinate codB = new Coordinate(cod);
		System.out.println("cod: " + cod + " codB: " + codB);
		System.out.println("cod.hashCode(): " + cod.hashCode());
		System.out.println("codB.hashCode(): " + codB.hashCode());
		
		if(cod.equals(codB)) System.out.println("cod.equals(codB) == true");
		
		Coordinate zero = new Coordinate();
		Coordinate set = new Coordinate(1.1,2.2);
		System.out.println("zero: " + zero);
		System.out.println("set: " + set);
		
		Coordinate[] arr = new Coordinate[3];
		for(int i = 0; i <arr.length; i++) {
			arr[i] = new Coordinate();
			System.out.println("arr[" + i + "] = " + arr[i]);
		}
	}
	
	public void HumanArrayTester() {
		
		Human[] humans = {
				new Human("ChangSu", 172, 68),
				new Human("JiEun", 165, 50),
		};
		
		Human[] humansB = new Human[2];
		for(int i = 0; i< humansB.length; i++) {
			humansB[i] = createHuman();
		}
		
		Human[][] humanMax = {
				{new Human(), new Human(),},
				{new Human(), new Human(), new Human(),},
				{new Human(),},
		};
		
		Human[][] humanMaxB = new Human[2][];
		for(int i = 0; i < humanMaxB.length; i++) {
			System.out.print("count: ");
			humanMaxB[i] = new Human[sc.nextInt()];
			sc.nextLine();
			for(int j = 0; j < humanMaxB[i].length; j++) {
				humanMaxB[i][j] = createHuman();
			}
		}
		printHumans(humans);
		printHumans(humansB);
		printHumans(humanMax);
		printHumans(humanMaxB);
	}
	
	private Human createHuman() {
		
		System.out.print("name: ");
		String name = sc.nextLine();
		System.out.print("height: ");
		int height = sc.nextInt();
		System.out.print("weight: ");
		int weight = sc.nextInt();
		sc.nextLine();
		return new Human(name, height, weight);
	}
	
	private void printHumans(Human[] humans) {
		for(int i = 0; i <humans.length; i++) System.out.println("humans[" + i + "]:" + humans[i]);
	}
	
	private void printHumans(Human[][] humanMax) {
		for(int i = 0; i <humanMax.length; i++) {
			printHumans(humanMax[i]);
		}
	}
	
	public void dayTester() {
		
		System.out.print(getDay());
	}
	
	private Day getDay() {
		
		System.out.print("year: ");
		int year = sc.nextInt();
		System.out.print("month: ");
		int month = sc.nextInt();
		System.out.print("date: ");
		int date = sc.nextInt();
		sc.nextLine();
		return new Day(year, month, date);
	}
	
	public void accountTester() {
		
		System.out.print("How many bank accounts can you open? : ");
		int count = sc.nextInt();
		Account[] account = new Account[count];
		
		for(int i = 0; i < count; i++) {
			System.out.print("[0] simple  [1] detail : ");
			int type = sc.nextInt();
			sc.nextLine();
			System.out.print("name: ");
			String name = sc.nextLine();
			int accountNo = random.nextInt(10000) +1;
			if(type == 0) {
				account[i] = new Account(name, accountNo);
			}else {
				System.out.print("balance: ");
				long balance = sc.nextLong();
				Day openday = getDay();
				account[i] = new Account(name, accountNo, balance, openday);
			}
			System.out.println("Id: " + account[i].getId());
			System.out.println(account[i].toString());
			System.out.println("Openday : " + account[i].getDay().toString());
		}
	}
	
	public void periodTester() {
		
		Period KH = new Period(new Day(2019, 5, 16), new Day(2019, 12, 6));
		System.out.println("KH: " + KH.toString());
	}
	
	public void idTester() {
		
		System.out.println(Id.pseudo);
		Id a = new Id();
		Id b = new Id();
		Id.modifyStep(3);
		System.out.println("step: " + Id.getStep());
		System.out.println("a : " + a.getId());
		System.out.println("b: " + b.getId());
		Id c = new Id();
		System.out.println("c: " + c.getId());
		System.out.println("counter : " + Id.getMaxId());
	}
	
	public void mathMethod() {
		
		System.out.print("real number: ");
		double real = sc.nextDouble();
		System.out.println("abs: " + Math.abs(real));
		System.out.println("sqrt: " + Math.sqrt(Math.abs(real)));
		System.out.println("the area of ​​the circle: " + (Math.PI * Math.abs(real) * Math.abs(real)));
	}

	public void daysTester() {
		// TODO Auto-generated method stub
		System.out.print("enter year: ");
		int year = sc.nextInt();
		System.out.print("enter month: ");
		int month = sc.nextInt();
		System.out.print("enter date: ");
		int date = sc.nextInt();
		
		Day day = new Day(year, month, date);
		Days service = new Days();
		while(true) {
			System.out.print(
					"[1] Information about [2] change the date [3] compare two dates [4]date before and date after [5] end : ");
			int menu = sc.nextInt();
			if(menu == 5) break;
			switch(menu) {
			case 1 : service.display(day); break;
			case 2 : service.change(day); break;
			case 3 : service.compare(day); break;
			case 4 : service.beforeAfter(day); break;
			}
		}
	}

	public void point2DTester() {
		// TODO Auto-generated method stub
		for(int i = 0 ; i < 31; i++) {
			Point2D point = new Point2D();
			System.out.println(point.toString()+ " ");
		}
	}
	
	public void luckDraw() {
		
		Day today = new Day();
		System.out.println("Today is " + today.toString());
		
		int luck = random.nextInt(10);
		System.out.print("Today will be ");
		switch(luck) {
		case 0 : System.out.print("great!"); break;
		case 1 : case 2 : case 3 : System.out.print("good"); break;
		case 4 : case 5 : case 6 : System.out.println("no exception"); break;
		case 7 : case 8 : System.out.print("a tough day"); break;
		case 9 : System.out.print("awful!"); break;
		}
	}
}
