package clazz.model.vo;

import clazz.model.service.PrintSkin;
import clazz.model.service.Skinnable;
import clazz.model.vo.wearable.Headphones;

public class HeadMountedDisplay extends Headphones implements Skinnable{

	private int skin;
	
	@Override
	public void putOn() {
		// TODO Auto-generated method stub
		System.out.println("put on");
	}

	@Override
	public void putOff() {
		// TODO Auto-generated method stub
		System.out.println("put off");
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
