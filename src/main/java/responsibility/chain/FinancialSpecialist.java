package responsibility.chain;

public class FinancialSpecialist extends Management 
{
	public FinancialSpecialist(Management successor) {
		super(successor);
	}

	@Override
	public boolean isApproved(Request request) 
	{
		if (request.getCost() < 1000) {
			System.out.println("approved by " + getClass().getSimpleName());
			return true;
		}
		return successor.isApproved(request);
	}
}
