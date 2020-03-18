package clazz.model.vo.rockPaperScissors;

import java.util.Scanner;

public class HumanPlayer extends Player{

	private static Scanner sc;
	{
		sc = new Scanner(System.in);
	}
	@Override
	public int nextHand() {
		// TODO Auto-generated method stub
		do {
			System.out.print("[0]Rock! [1]Paper! [2]Scissors! : ");
			super.hand = sc.nextInt();
		}while(hand < 0 || hand > 2);
		return hand;
	}

}
