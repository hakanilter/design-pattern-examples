package responsibility.observer;

public class NewsPaper implements Subscriber 
{
	@Override
	public void update(String news) {
		System.out.println("newspaper notified:" + news);
	}
}
