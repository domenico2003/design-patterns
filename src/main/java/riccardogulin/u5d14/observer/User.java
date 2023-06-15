package riccardogulin.u5d14.observer;

public class User implements Subscriber {

	@Override
	public void receiveUpdate(Apple store) {
		System.out.println("Ciao sono un utente normale e ho appena ricevuto la notizia che ");
		System.out.println(store.getAnnouncment());
	}

}
