package clazz.model.service;

import java.util.Scanner;

import clazz.model.vo.pet.Pet;
import clazz.model.vo.pet.RobotPet;

public class AboutRobotPet{

	public static void petIntroduce(Pet pet) {
		pet.introduce();
	}
	
	public static void working(Pet pet) {
		Scanner sc = new Scanner(System.in);
		System.out.print("[0]clean [1]laundry [2]cook : ");
		((RobotPet) pet).work(sc.nextInt());
		sc.close();
	}
}
