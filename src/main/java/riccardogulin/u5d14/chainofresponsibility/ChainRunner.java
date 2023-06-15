package riccardogulin.u5d14.chainofresponsibility;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ChainRunner implements CommandLineRunner {


	@Override
	public void run(String... args) throws Exception {
		LoggerFilter logger = new LoggerFilter();
		PasswordFilter password = new PasswordFilter();
		RoleCheckerFilter role = new RoleCheckerFilter();

		logger.setNext(password);
		password.setNext(role);

		logger.check("user@gmail.com", "1234");
	}

}
