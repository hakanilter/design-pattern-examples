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
		NewsPaper newsPaper = new NewsPaper(newsAgency); // mediator
		NewsSite newsSite = new NewsSite();
		
		newsAgency.addObserver(newsPaper);
		newsAgency.notifyRecentNews("this is news 1");
		
		newsAgency.addObserver(newsSite);
		newsAgency.notifyRecentNews("this is news 2");
		
		// mediator example: publish news from news paper
		newsPaper.notifyRecentNews("this is the news from news paper");
	}
}
