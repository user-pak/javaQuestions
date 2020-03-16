package clazz.model.service;

import clazz.model.vo.Account;
import clazz.model.vo.TimeAccount;

public class AccountCompare {

	public int compareBalance(Account a, Account b) {
		
		long totalBalanceA = a instanceof TimeAccount? a.getBalance() + ((TimeAccount)a).getTimeBalance() : a.getBalance();
		long totalBalanceB = b instanceof TimeAccount? b.getBalance() + ((TimeAccount)b).getTimeBalance() : b.getBalance();
		return totalBalanceA > totalBalanceB? 1 : totalBalanceA < totalBalanceB? -1 : 0;
	}
}
