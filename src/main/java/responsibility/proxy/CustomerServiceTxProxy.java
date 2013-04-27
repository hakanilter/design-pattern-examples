package responsibility.proxy;

public class CustomerServiceTxProxy implements CustomerService
{
	private CustomerService customerService;

	public CustomerServiceTxProxy(CustomerService customerService) {
		this.customerService = customerService;
	}
	
	@Override
	public void update(Customer c) 
	{
		try {
			System.out.println("starting transaction...");
			customerService.update(c);
			System.out.println("transaction completed");
		} catch (Exception e) {
			System.out.println("transaction failed");
			throw new RuntimeException(e);
		}
	}
}
