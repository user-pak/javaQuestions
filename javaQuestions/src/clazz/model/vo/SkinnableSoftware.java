package clazz.model.vo;

import clazz.model.service.Skinnable;

public class SkinnableSoftware implements Skinnable{

	private int skin;
	
	public SkinnableSoftware() {
		this.skin = BLACK;
	}
	
	public SkinnableSoftware(int skin) {
		this.skin = skin;
	}
	@Override
	public void changeSkin(int skin) {
		// TODO Auto-generated method stub
		this.skin = skin;
	}
	
	public String getSkinString() {
		switch(skin) {
		case BLACK : return "black";
		case RED : return "red";
		case GREEN : return "green";
		case BLUE : return "blue";
		case YELLOW : return "yellow";
		default : return " ";
		}
	}

}
