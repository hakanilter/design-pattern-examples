package responsibility.observer;

import java.util.Observable;

public class NewsPaper extends NewsFeed
{
	public NewsPaper(NewsAgency mediator) {
		super(mediator);
	}

	@Override
	public void update(Observable o, Object arg) {
		System.out.println("newspaper notified: " + arg);
	}
}
