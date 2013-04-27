package responsibility.proxy;

public class CustomerServiceSecurityProxy implements CustomerService
{
	private CustomerService customerService;

	public CustomerServiceSecurityProxy(CustomerService customerService) {
		this.customerService = customerService;
	}
	
	@Override
	public void update(Customer c) 
	{
		System.out.println("checking security constrains...");
		customerService.update(c);
	}
}
