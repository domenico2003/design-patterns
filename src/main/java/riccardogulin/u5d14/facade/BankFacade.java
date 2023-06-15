package riccardogulin.u5d14.facade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Component
public class BankFacade {
	private int accountNumber;
	private int pin;

	@Autowired
	PinChecker pinChecker;

	@Autowired
	AccountNumberChecker accountChecker;

	@Autowired
	FundsChecker fundsChecker;

	public void preleva(double cifra) {
		if (accountChecker.accountCheck(accountNumber) && pinChecker.isPinCorrect(pin)
				&& fundsChecker.checkAvailability(cifra)) {
			System.out.println("TRANSAZIONE COMPLETATA");
		} else {
			System.out.println("ERRORE DURANTE LA TRANSAZIONE");
		}
	}
}
