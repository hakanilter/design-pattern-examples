package extensional.visitor;

import interfaces.composite.BasicProduct;
import interfaces.composite.CompositeProduct;

public class ProductVisitor implements Visitor 
{
	private double totalWeight;
	private double totalPrice;
	
	private int compositeProductCount = 0;
	
	public void visit(BasicProduct product)
	{
		totalWeight += product.getWeight();
		totalPrice += product.getPrice();
	}
	
	public void visit(CompositeProduct product)
	{
		++compositeProductCount;
		if (compositeProductCount == 1) {
			System.out.println("you have a promotion");
			totalPrice += product.getPrice() / 2;
		} else {
			totalPrice += product.getPrice();			
		}
		totalWeight += product.getWeight();
	}

	public double getTotalWeight() {
		return totalWeight;
	}

	public double getTotalPrice() {
		return totalPrice;
	}
}
