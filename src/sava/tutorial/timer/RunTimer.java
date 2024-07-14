package sava.tutorial.timer;

import java.util.Timer;
import java.util.TimerTask;

public class RunTimer {
	
	
	class Task extends TimerTask {
		

		@Override
		public void run() {
			// TODO Auto-generated method stub
			System.out.println("할 일");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Timer timer = new Timer();
		timer.schedule(new RunTimer().new Task(),1);
	}

}
