package operational.command;

public class OrderDrinkCommand implements Command 
{
	@Override
	public String getName() {
		return "Order Drink";
	}

	@Override
	public void execute() {
		System.out.println("drink ordered");
	}
}
