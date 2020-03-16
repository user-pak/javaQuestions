package clazz.model.vo;

public class TimeAccount extends Account{
	
	private long timeBalance;

	public TimeAccount(String name, int accountNo, long balance, long timeBalance) {
		super(name, accountNo, balance);
		// TODO Auto-generated constructor stub
		this.timeBalance = timeBalance;
	}
	
	public long getTimeBalance() {
		return timeBalance;
	}
	
	public void cancel() {
		deposit(timeBalance);
		timeBalance = 0;
	}

}
