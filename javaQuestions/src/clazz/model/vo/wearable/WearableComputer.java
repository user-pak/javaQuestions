package clazz.model.vo.wearable;

import clazz.model.service.Wearable;

public class WearableComputer implements Wearable{

	@Override
	public void putOn() {
		// TODO Auto-generated method stub
		System.out.println("turn on");
	}

	@Override
	public void putOff() {
		// TODO Auto-generated method stub
		System.out.println("turn off");
	}
	
	public void reset() {
		System.out.println("reset");
	}

}
