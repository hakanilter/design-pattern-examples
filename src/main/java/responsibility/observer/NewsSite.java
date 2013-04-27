package responsibility.observer;

public class NewsSite implements Subscriber 
{
	@Override
	public void update(String news) {
		System.out.println("news site notified: " + news);
	}
}
