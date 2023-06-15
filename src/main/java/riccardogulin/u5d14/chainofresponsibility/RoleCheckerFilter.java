package riccardogulin.u5d14.chainofresponsibility;

public class RoleCheckerFilter extends Filter {

	@Override
	public void check(String email, String password) {
		if (email.equals("admin@gmail.com")) {
			System.out.println("BENVENUTO ADMIN");
			goNext(email, password);

		} else {
			System.out.println("CATENA TERMINATA -> SOLO GLI ADMIN ACCEDONO");
		}
	}

}
