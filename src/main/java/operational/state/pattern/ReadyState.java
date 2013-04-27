package operational.state.pattern;

import operational.state.common.Coffee;

public class ReadyState extends BaseState 
{
	private Coffee coffee;
	
	public ReadyState(UltimateCoffeeMachine coffeeMachine, Coffee coffee) 
	{
		super(coffeeMachine);
		this.coffee = coffee;
	}

	@Override
	public Coffee getOrder() {
		return coffee;
	}
}
