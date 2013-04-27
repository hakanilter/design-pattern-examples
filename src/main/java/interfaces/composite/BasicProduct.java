package interfaces.composite;

import extensional.visitor.Visitor;

public abstract class BasicProduct implements Product 
{
	private double weight;
	private double price;
	
	public BasicProduct(double weight, double price) 
	{
		this.weight = weight;
		this.price = price;
	}
	
	@Override
	public double getWeight() {
		return weight;
	}

	@Override
	public double getPrice() {
		return price;
	}

	@Override
	public void add(Product product) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void remove(Product product) {
		throw new UnsupportedOperationException();
	}

	// added for visitor pattern
	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
}
