package responsibility.observer;

public abstract class NewsFeed implements Subscriber
{
	private NewsAgency mediator;
	
	public NewsFeed(NewsAgency mediator) {
		this.mediator = mediator;
	}

	public void notifyRecentNews(String news) {
		mediator.notifyRecentNews(news);
	}
}
