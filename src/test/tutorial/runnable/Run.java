package test.tutorial.runnable;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread taskA = new Thread(new MultiTask("Crow"));
		Thread taskB = new Thread(new MultiTask("Sparrow"));
		Thread taskC = new Thread(new MultiTask("Bulbul"));
		taskA.start();
		taskB.start();
		taskC.start();
	}

}
