package extensional.visitor;

import interfaces.composite.BasicProduct;
import interfaces.composite.CompositeProduct;
import interfaces.composite.Product;

/**
 * {@link Product}
 */
public interface Visitor 
{
	void visit(BasicProduct product);
	void visit(CompositeProduct product);
}
