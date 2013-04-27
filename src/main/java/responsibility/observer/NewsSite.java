package responsibility.observer;

import java.util.Observable;

public class NewsSite implements Subscriber 
{
	@Override
	public void update(Observable o, Object arg) {
		System.out.println("news site notified: " + arg);
	}
}
