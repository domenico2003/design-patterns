package riccardogulin.u5d14.chainofresponsibility;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public abstract class Filter {
	private Filter next;

	public abstract void check(String email, String password);

	public void goNext(String email, String password) {
		if (this.getNext() != null) {
			next.check(email, password);
		} else {
			System.out.println("SIAMO ARRIVATI A FINE CATENA");
		}
	}

}
