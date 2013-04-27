package interfaces.facade;

public class MortgageFacade 
{
	private CreditCardService creditCardService = new CreditCardService();
	private DeptService deptService = new DeptService();
	private RegistrationService registrationService = new RegistrationService();
	
	public void apply(String name, String cardNumber) 
	{
		if (!creditCardService.check(cardNumber)) {
			throw new RuntimeException("invalid credit card");
		}
		if (!deptService.check(cardNumber)) {
			throw new RuntimeException("invalid credit card");
		}
		registrationService.register(name);
	}
}
