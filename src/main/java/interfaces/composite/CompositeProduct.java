package interfaces.composite;

import java.util.HashSet;
import java.util.Set;

import extensional.visitor.Visitor;

public abstract class CompositeProduct implements Product 
{
	private Set<Product> products = new HashSet<Product>();
	
	@Override
	public double getWeight() 
	{
		double totalWeight = 0;
		for (Product product : products) {
			totalWeight += product.getWeight();
		}
		return totalWeight;
	}

	@Override
	public double getPrice() 
	{
		double totalPrice = 0; 
		for (Product product : products) {
			totalPrice += product.getPrice();
		}
		return totalPrice;
	}
	
	@Override
	public void add(Product product) {
		products.add(product);
	}

	@Override
	public void remove(Product product) {
		product.remove(product);
	}
	
	// added for visitor pattern
	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
}
