package responsibility.chain;

public class Request 
{
	public double cost;
	
	public Request(double cost) {
		this.cost = cost;
	}

	public double getCost() {
		return cost;
	}
}
