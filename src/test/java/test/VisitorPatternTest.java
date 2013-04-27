package test;

import interfaces.composite.Coke;
import interfaces.composite.CokeWithGlass;
import interfaces.composite.Glass;
import interfaces.composite.Product;

import java.util.ArrayList;
import java.util.List;

import junit.framework.Assert;

import org.junit.Test;

import extensional.visitor.ProductVisitor;

public class VisitorPatternTest 
{
	@Test
	public void testWithNoPromotion()
	{
		List<Product> shoppingBasket = new ArrayList<Product>();
		shoppingBasket.add(new Coke());
		shoppingBasket.add(new Coke());
		shoppingBasket.add(new Glass());
		shoppingBasket.add(new Glass());
		
		ProductVisitor visitor = new ProductVisitor();
		for (Product product : shoppingBasket) {
			product.accept(visitor);
		}
		
		Assert.assertEquals(6, visitor.getTotalPrice(), 0.1);
		Assert.assertEquals(6, visitor.getTotalWeight(), 0.1);
	}
	
	@Test
	public void testWithPromotion()
	{
		List<Product> shoppingBasket = new ArrayList<Product>();
		shoppingBasket.add(new Coke());
		shoppingBasket.add(new Glass());
		shoppingBasket.add(new CokeWithGlass());
		
		ProductVisitor visitor = new ProductVisitor();
		for (Product product : shoppingBasket) {
			product.accept(visitor);
		}

		Assert.assertEquals(4.5, visitor.getTotalPrice(), 0.1);
		Assert.assertEquals(6, visitor.getTotalWeight(), 0.1);
	}
}
