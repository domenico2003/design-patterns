package riccardogulin.u5d14.facade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class FacadeRunner implements CommandLineRunner {
	@Autowired
	BankFacade bf;

	@Override
	public void run(String... args) throws Exception {
		bf.setAccountNumber(12345678);
		bf.setPin(1234);

		bf.preleva(500);

		bf.preleva(1000);

	}

}
