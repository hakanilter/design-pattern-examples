package responsibility.chain;

public class ChiefFinancialOfficer extends Management
{
	public ChiefFinancialOfficer(Management successor) {
		super(successor);
	}

	@Override
	public boolean isApproved(Request request) 
	{
		if (request.getCost() < 50000) {
			System.out.println("approved by " + getClass().getSimpleName());
			return true;
		}
		return successor.isApproved(request);
	}
}
