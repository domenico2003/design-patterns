package riccardogulin.u5d14.factory;

public abstract class Pizza {
	public void bake() {
		System.out.println("COTTA");
	}

	public double getPrezzoBase() {
		return 3.0;
	}

	public abstract void getIngredients();
}
