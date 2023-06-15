package riccardogulin.u5d14.facade;

import org.springframework.stereotype.Component;

@Component
public class FundsChecker {
	private double availableMoney = 1000;

	private void preleva(double amount) {
		availableMoney -= amount;
	}

	public void deposita(double amount) {
		availableMoney += amount;
	}

	public boolean checkAvailability(double amount) {
		if (amount > availableMoney) {
			System.out.println("NON HAI ABBASTANZA SOLDI");
			System.out.println("IL CONTO CONTIENE " + availableMoney + "€");
			return false;
		} else {
			preleva(amount);
			System.out.println("PRELIEVO ESEGUITO");
			System.out.println("IL CONTO CONTIENE " + availableMoney + "€");
			return true;

		}
	}
}
