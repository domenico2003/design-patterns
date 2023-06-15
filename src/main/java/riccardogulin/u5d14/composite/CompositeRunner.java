package riccardogulin.u5d14.composite;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CompositeRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		GrandParent aldo = new GrandParent("Aldo");
		Parent giovanni = new Parent("Giovanni");
		Child giacomo = new Child("Giacomo");
		Child ajeje = new Child("Ajeje");

		aldo.addChild(giovanni);
		giovanni.addParent(aldo);
		giovanni.addChild(giacomo);
		giovanni.addChild(ajeje);

		aldo.print();

	}

}
