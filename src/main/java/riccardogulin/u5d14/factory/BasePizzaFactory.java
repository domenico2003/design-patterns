package riccardogulin.u5d14.factory;

public abstract class BasePizzaFactory {
	private int speseDiConsegna = 2;

	public Pizza orderPizza() {
		Pizza p = createPizza();
		p.getIngredients();
		System.out.println("Costo totale: " + (this.getCostoIngredienti() + p.getPrezzoBase() + speseDiConsegna));
		return p;
	}

	public abstract Pizza createPizza();

	public abstract int getCostoIngredienti();

}
