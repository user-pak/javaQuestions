package clazz.model.vo.rockPaperScissors;

import java.util.Random;

public class ComputerPlayer extends Player{

	private static Random random;
	
	{
		random = new Random();
	}

	@Override
	public int nextHand() {
		// TODO Auto-generated method stub
		hand = random.nextInt(3);
		return hand;
	}

}
