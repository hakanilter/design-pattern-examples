package test;

import java.math.BigDecimal;

import org.junit.Test;

import operational.state.antipattern.DummyCoffeeMachine;
import operational.state.common.Coffee;
import operational.state.common.CoffeeMachine;
import operational.state.common.CoffeeType;
import operational.state.pattern.UltimateCoffeeMachine;

/**
 * 
 * Inheritence olmadan state degisikligi ile 
 * nesnenin davranisi degistirilebilmelidir
 * 
 * State birer nesnedir, o anki aktif state ne ise
 * aksiyonu o state yapmalidir
 * 
 */
public class StatePatternTest 
{
	@Test
	public void testDummyCoffeeMachine() {
		testCoffeeMachine(new DummyCoffeeMachine());
	}
	
	@Test
	public void testUltimateCoffeeMachine() {
		testCoffeeMachine(new UltimateCoffeeMachine());
	}
	
	private void testCoffeeMachine(CoffeeMachine coffeeMachine)
	{
		System.out.println("testing " + coffeeMachine.getClass().getSimpleName());
		coffeeMachine.addCoin(new BigDecimal("2.00"));
		coffeeMachine.order(CoffeeType.OHNE_ZUCKER);
		coffeeMachine.prepare();
		Coffee coffee = coffeeMachine.getOrder();
		System.out.println(coffee);
	}
}
