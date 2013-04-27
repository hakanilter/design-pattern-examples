package responsibility.observer;

import java.util.Observable;

public class NewsAgency extends Observable
{
	public void notifyRecentNews(String news) 
	{
		setChanged();
		notifyObservers(news);
	}
}
