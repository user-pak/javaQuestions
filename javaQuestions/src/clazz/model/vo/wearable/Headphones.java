package clazz.model.vo.wearable;

import clazz.model.service.Wearable;

public class Headphones implements Wearable{

	private int volume = 0;
	
	@Override
	public void putOn() {
		// TODO Auto-generated method stub
		System.out.println("put on headphones");
	}

	@Override
	public void putOff() {
		// TODO Auto-generated method stub
		System.out.println("put off headphones");
	}
	
	public void setVolume(int volume){
		
		this.volume = volume;
		System.out.println("change volume");
	}
}
