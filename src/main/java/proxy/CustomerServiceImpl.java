package proxy;

public class CustomerServiceImpl implements CustomerService 
{
	public void update(Customer customer) {
		System.out.println("updating customer: " + customer);
	}
}
