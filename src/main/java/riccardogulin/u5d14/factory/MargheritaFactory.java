package riccardogulin.u5d14.factory;

import org.springframework.stereotype.Component;

@Component
public class MargheritaFactory extends BasePizzaFactory {

	@Override
	public Pizza createPizza() {
		// TODO Auto-generated method stub
		return new Margherita();
	}

	@Override
	public int getCostoIngredienti() {
		// TODO Auto-generated method stub
		return 1;
	}

}
