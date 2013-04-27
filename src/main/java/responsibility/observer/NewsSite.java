package responsibility.observer;

import java.util.Observable;
import java.util.Observer;

public class NewsSite implements Observer 
{
	@Override
	public void update(Observable o, Object arg) {
		System.out.println("news site notified: " + arg);
	}
}
