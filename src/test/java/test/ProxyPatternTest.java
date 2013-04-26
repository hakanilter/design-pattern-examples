package test;

import org.junit.Ignore;
import org.junit.Test;

import proxy.Client;
import proxy.Customer;
import proxy.CustomerServiceImpl;
import proxy.CustomerServiceSecurityProxy;
import proxy.CustomerServiceTxProxy;

/**
 * 
 * Yaratilmasi ya da erisimi maliyetli nesnelerin
 * herhangi bir farklilik hissedilmeden cagirilmasini saglayan,
 * asil nesne yerine gecen vekil bir nesne kullanma durumuda kullanilir.
 * 
 * Asil nesneye ulasmak zorunda olmadigi durumda vekil nesne kullanilir.
 * Istemci vekil nesne kullandiginin farkinda olmaz.
 * 
 * Ornek: nakit yerine cek
 *
 */
public class ProxyPatternTest
{
	@Ignore
	@Test
	public void testWithoutTransaction()
	{
		Client client = new Client();
		client.setCustomerService(new CustomerServiceImpl());
		client.update(new Customer("Dave", "Mustaine"));
	}
	
	@Test 
	public void testWithSecurityAndTransaction()
	{
		Client client = new Client();
		client.setCustomerService(new CustomerServiceTxProxy(
				new CustomerServiceSecurityProxy(new CustomerServiceImpl())));
		client.update(new Customer("Dave", "Mustaine"));
	}
}
