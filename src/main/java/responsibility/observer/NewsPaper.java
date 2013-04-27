package responsibility.observer;

import java.util.Observable;
import java.util.Observer;

public class NewsPaper implements Observer
{
	@Override
	public void update(Observable o, Object arg) {
		System.out.println("newspaper notified: " + arg);
	}
}
