package clazz.model.vo.pet;

import clazz.model.service.PrintSkin;
import clazz.model.service.Skinnable;

public class SkinnableRobotPet extends RobotPet implements Skinnable{

	private int skin;
	
	public SkinnableRobotPet(String petName, String masterName) {
		super(petName, masterName);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void changeSkin(int skin) {
		// TODO Auto-generated method stub
		this.skin = skin;
	}
	
	public void printSkin() {
		PrintSkin.printSkin(skin);
	}
}
