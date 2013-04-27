package test;

import interfaces.facade.MortgageFacade;

import org.junit.Test;

/**
 * 
 * Birden fazla sinifina erisim siklikla yapiliyorsa
 * bu karmasik davranisi encapsule edip daha basit erisim 
 * saglamak amaciyla kullanilir. Herhangi bir logic icermez. 
 *
 */
public class FacadePatternTest 
{
	@Test
	public void test()
	{
		MortgageFacade mortgageFacade = new MortgageFacade();
		mortgageFacade.apply("John Doe", "111222333444555");
	}
}
