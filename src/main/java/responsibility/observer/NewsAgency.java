package responsibility.observer;

import java.util.ArrayList;
import java.util.List;

public class NewsAgency 
{
	private List<Subscriber> subscribers = new ArrayList<Subscriber>();
	
	public void register(Subscriber subscriber) {
		subscribers.add(subscriber);
	}
	
	public void unregister(Subscriber subscriber) {
		subscribers.remove(subscriber);
	}
	
	public void notifyRecentNews(String news)
	{
		for (Subscriber subscriber : subscribers) {
			subscriber.update(news);
		}
	}
}
