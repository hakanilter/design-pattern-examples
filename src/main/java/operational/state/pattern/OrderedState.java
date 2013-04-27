package operational.state.pattern;

import operational.state.common.Coffee;
import operational.state.common.CoffeeType;

public class OrderedState extends BaseState
{
	private CoffeeType coffeeType;
	
	public OrderedState(UltimateCoffeeMachine coffeeMachine, CoffeeType coffeeType) 
	{
		super(coffeeMachine);
		this.coffeeType = coffeeType;
	}

	@Override
	public void prepare() 
	{
		System.out.println("preparing coffee...");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		coffeeMachine.state = new ReadyState(coffeeMachine, new Coffee(coffeeType));
		System.out.println("coffe is ready");
	}
	
	public CoffeeType getCoffeeType() {
		return coffeeType;
	}
}
