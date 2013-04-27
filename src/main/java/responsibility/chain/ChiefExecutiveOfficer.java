package responsibility.chain;

public class ChiefExecutiveOfficer extends Management 
{
	public ChiefExecutiveOfficer() {
		// has no successor
		super(null);
	}

	@Override
	public boolean isApproved(Request request) 
	{
		System.out.println("approved by " + getClass().getSimpleName());
		// always approves
		return true;
	}
}
