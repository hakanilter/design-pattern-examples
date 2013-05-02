package test;

import java.util.Properties;

import junit.framework.Assert;

import operational.interpreter.Context;
import operational.interpreter.PropertiesExpression;

import org.junit.Test;

/**
 * 
 * Surekli tekrarlayan bir yapi gramer ile ifade edilerek
 * islenmesi ve bir sonuc uretilmesi gerekirse kullanilir
 * 
 * Ornek: Duz yaziyi SQL'e cevirmek
 * 
 */
public class InterpreterTemplateTest 
{
	@Test
	public void test()
	{
		Context context = new Context("{name: John, surname: Doe");
		PropertiesExpression expression = new PropertiesExpression();
		Properties properties = expression.interpret(context);
		Assert.assertEquals("John", properties.get("name"));
		Assert.assertEquals("Doe", properties.get("surname"));
	}
}
