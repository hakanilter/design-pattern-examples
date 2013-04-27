package interfaces.composite;

import extensional.visitor.Visitor;

public interface Product 
{
	double getWeight();
	double getPrice();
	
	void add(Product product);
	void remove(Product product);

	// added for visitor pattern
	void accept(Visitor visitor);
}
