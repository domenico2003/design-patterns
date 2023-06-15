package riccardogulin.u5d14.chainofresponsibility;

public class PasswordFilter extends Filter {

	@Override
	public void check(String email, String password) {
		if (password.equals("1234")) {
			System.out.println("PASSWORD CORRETTA");
			goNext(email, password);
		} else {
			System.out.println("CATENA TERMINATA -> PASSWORD NON CORRETTA");
		}

	}

}
