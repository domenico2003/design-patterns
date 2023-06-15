package riccardogulin.u5d14.observer;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;

@Getter
public class Apple { // PUBLISHER
	private List<Subscriber> subscribers = new ArrayList<>();
	private String announcment;

	public void addSubscriber(Subscriber subscriber) {
		subscribers.add(subscriber);
	}

	public void removeSubscriber(Subscriber subscriber) {
		subscribers.remove(subscriber);
	}

	public void makeAnnouncment(String text) {
		this.announcment = text;
		for (Subscriber subscriber : subscribers) {
			subscriber.receiveUpdate(this);
		}
	}
}
