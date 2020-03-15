package clazz.model.vo;

public class Account {

	private static int counter = 0;
	private String name;
	private int accountNo;
	private long balance;
	private Day openDay;
	private int id;
	
	{
		id = ++counter;
		System.out.println("Thank you for openning a bank account!");
	}
	
	public Account(String name, int accountNo) {
		this(name, accountNo, 0, new Day());
	}
	
	public Account(String name, int accountNo, long balance, Day openday) {
		super();
		this.name = name;
		this.accountNo = accountNo;
		this.balance = balance;
		this.openDay = new Day(openday);
	}
	
	public Account(String name, int accountNo, long balance) {
		super();
		this.name = name;
		this.accountNo = accountNo;
		this.balance = balance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}

	public long getBalance() {
		return balance;
	}

	public void setBalance(long balance) {
		this.balance = balance;
	}
	
	public Day getDay() {
		return new Day(this.openDay);
	}
	public int getId() {
		return id;
	}
	
	@Override
	public String toString() {
		return "Account [name=" + name + ", accountNo=" + accountNo + ", balance=" + balance + "]";
	}

	public String deposit(long dep) {
		this.balance += dep;
		return toString();
	}
	
	public String withdraw(long dep) {
		if(this.balance >= dep) {
			this.balance -= dep;
			return toString();
		}
		else return "no money";
	}
}
