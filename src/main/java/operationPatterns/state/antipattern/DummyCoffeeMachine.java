package operationPatterns.state.antipattern;

import static operationPatterns.state.antipattern.MachineState.ENOUGH_BALANCE;
import static operationPatterns.state.antipattern.MachineState.NOT_ENOUGH_BALANCE;
import static operationPatterns.state.antipattern.MachineState.ORDERED;
import static operationPatterns.state.antipattern.MachineState.READY;

import java.math.BigDecimal;

import operationPatterns.state.common.CoffeeType;
import operationPatterns.state.common.Coffee;
import operationPatterns.state.common.CoffeeMachine;
import operationPatterns.state.common.CoffeeType;

public class DummyCoffeeMachine implements CoffeeMachine 
{
	private final BigDecimal price = new BigDecimal("1.00"); 

	private MachineState currentState = MachineState.NOT_ENOUGH_BALANCE;
	private BigDecimal balance = new BigDecimal("0.00");
	private CoffeeType coffeeType;
	private Coffee coffee;

	@Override
	public void addCoin(BigDecimal coin)
	{
		switch (currentState) {
			case NOT_ENOUGH_BALANCE:
			case ENOUGH_BALANCE:
				balance = balance.add(coin);
				checkBalance();
				System.out.println("coin added, current balance: " + balance);
				break;
			default:
				throw new IllegalStateException();
		}
	}

	@Override
	public void order(CoffeeType coffeeType) 
	{
		if (hasEnoughBalance()) {
			balance = balance.subtract(price);
			this.coffeeType = coffeeType;
			currentState = MachineState.ORDERED;
			System.out.println("coffee ordered, current balance: " + balance);
		} else {
			throw new IllegalStateException();
		}
	}

	@Override
	public void prepare() 
	{
		if (currentState == MachineState.ORDERED) {
			System.out.println("preparing coffee...");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			coffee = new Coffee(coffeeType);
			coffeeType = null;
			currentState = MachineState.READY;
			System.out.println("coffe is ready");
		} else {
			throw new IllegalStateException();
		}
	}

	@Override
	public Coffee getOrder() 
	{
		if (currentState == MachineState.READY) {
			return coffee;
		} else {
			throw new IllegalStateException();
		}
	}

	@Override
	public void cancel() 
	{
		if (currentState == MachineState.ORDERED) {
			balance = balance.add(price);
			System.out.println("order cancelled, current balance: " + balance);
			currentState = MachineState.READY;
		} else {
			throw new IllegalStateException();
		}
	}
	
	private void checkBalance()
	{
		if (hasEnoughBalance()) {
			currentState = MachineState.ENOUGH_BALANCE;
		} else {
			currentState = MachineState.NOT_ENOUGH_BALANCE;
		}
	}
	
	private boolean hasEnoughBalance() {
		return balance.compareTo(price) >= 0;	
	}	
}
