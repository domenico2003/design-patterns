package riccardogulin.u5d14.facade;

import org.springframework.stereotype.Component;

@Component
public class AccountNumberChecker {
	private int accountNumber = 12345678;

	public boolean accountCheck(int account) {
		return accountNumber == account ? true : false;
	}
}
