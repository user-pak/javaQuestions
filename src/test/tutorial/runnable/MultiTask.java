package test.tutorial.runnable;

public class MultiTask implements Runnable{
	
	private String performer;

	public MultiTask(String performer) {
		this.performer = performer;
	}
	
	@Override
	public void run() {
		
		for(int i = 0; i < 5; i++) {
			System.out.println(performer + " is running");
		}
		try {
			Thread.sleep(10000000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
