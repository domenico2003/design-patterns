package riccardogulin.u5d14.observer;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ObserverRunner implements CommandLineRunner {


	@Override
	public void run(String... args) throws Exception {
		Mediaworld m = new Mediaworld();
		User u = new User();
		AppleStore a = new AppleStore();

		Apple apple = new Apple();
		apple.addSubscriber(m);
		apple.addSubscriber(u);
		apple.addSubscriber(a);

		apple.makeAnnouncment("è uscito il nuovo iphone 1000");
		apple.removeSubscriber(u);

		apple.makeAnnouncment("è uscito il nuovo macbook pro 20");
	}

}
