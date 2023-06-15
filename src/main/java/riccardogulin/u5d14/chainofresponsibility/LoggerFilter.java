package riccardogulin.u5d14.chainofresponsibility;

public class LoggerFilter extends Filter {

	@Override
	public void check(String email, String password) {
		System.out.println("Email: " + email + ", password: " + password);
		goNext(email, password);
		
	}

}
