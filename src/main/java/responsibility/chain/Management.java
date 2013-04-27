package responsibility.chain;

public abstract class Management 
{
	protected Management successor;
	
	public Management(Management successor) {
		this.successor = successor;
	}
	
	public abstract boolean isApproved(Request request);
}
