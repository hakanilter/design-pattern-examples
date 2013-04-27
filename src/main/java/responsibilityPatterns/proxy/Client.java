package responsibilityPatterns.proxy;

public class Client
{
	private CustomerService customerService;

	public void setCustomerService(CustomerService customerService) {
		this.customerService = customerService;
	}
	
	public void update(Customer c) {
		customerService.update(c);
	}
}
