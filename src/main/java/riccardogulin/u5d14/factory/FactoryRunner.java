package riccardogulin.u5d14.factory;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class FactoryRunner implements CommandLineRunner {
//	@Autowired
//	MargheritaFactory mFactory;
//
//	@Autowired
//	ProsciuttoFactory pFactory;

	@Override
	public void run(String... args) throws Exception {
		BasePizzaFactory factory;

		if (true) {
			factory = new MargheritaFactory();
		} else {
			factory = new ProsciuttoFactory();
		}
//		

		factory.orderPizza();

	}

}
