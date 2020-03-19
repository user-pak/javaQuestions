package clazz.model.service;

public class PrintSkin implements Skinnable{

	private int skin;
	
	public static void printSkin(int skin) {
		
		switch(skin) {
		case BLACK : System.out.println("black"); break;
		case RED : System.out.println("red"); break;
		case GREEN : System.out.println("green"); break;
		case BLUE : System.out.println("blue"); break;
		case YELLOW : System.out.println("yellow"); break;
		}
	}

	@Override
	public void changeSkin(int skin) {
		// TODO Auto-generated method stub
		this.skin = skin;
	}
}
