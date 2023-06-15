package riccardogulin.u5d14.facade;

import org.springframework.stereotype.Component;

@Component
public class PinChecker {
	private int pinCorretto = 1234;

	public boolean isPinCorrect(int pin) {
		return pinCorretto == pin ? true : false;
	}

}
