package riccardogulin.u5d14.factory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class FactoryRunner implements CommandLineRunner {
	@Autowired
	MargheritaFactory mFactory;

	@Autowired
	ProsciuttoFactory pFactory;

	@Override
	public void run(String... args) throws Exception {
		Pizza margherita = mFactory.orderPizza();
		Pizza prosciutto = pFactory.orderPizza();

	}

}
