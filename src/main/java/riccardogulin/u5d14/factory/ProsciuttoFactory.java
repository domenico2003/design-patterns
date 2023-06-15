package riccardogulin.u5d14.factory;

import org.springframework.stereotype.Component;

@Component
public class ProsciuttoFactory extends BasePizzaFactory {

	@Override
	public Pizza createPizza() {
		// TODO Auto-generated method stub
		return new Prosciutto();
	}

	@Override
	public int getCostoIngredienti() {
		// TODO Auto-generated method stub
		return 2;
	}

}
