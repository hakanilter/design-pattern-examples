package test;

import org.junit.Test;

import responsibility.observer.NewsAgency;
import responsibility.observer.NewsPaper;
import responsibility.observer.NewsSite;

/**
 *
 * Bir grup nesnenin baska bir nesne uzerindeki degisikliklerden
 * mumkun oldugunca coupling yaratmadan haberdar olmasinda kullanilir.
 * 
 * Observer'larin hepsi farkli siniflar olabilir, ortak bir arayuzu 
 * kullanirlar.
 *
 */
public class ObserverPatternTest 
{
	@Test
	public void test()
	{
		NewsAgency newsAgency = new NewsAgency();
		NewsPaper newsPaper = new NewsPaper();
		NewsSite newsSite = new NewsSite();
		
		newsAgency.register(newsPaper);
		newsAgency.notifyRecentNews("this is news 1");
		
		newsAgency.register(newsSite);
		newsAgency.notifyRecentNews("this is news 2");
	}
}
