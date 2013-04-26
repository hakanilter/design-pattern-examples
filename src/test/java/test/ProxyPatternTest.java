package test;

import java.lang.reflect.Proxy;

import org.junit.Ignore;
import org.junit.Test;

import proxy.Client;
import proxy.Customer;
import proxy.CustomerService;
import proxy.CustomerServiceImpl;
import proxy.CustomerServiceSecurityProxy;
import proxy.CustomerServiceTxProxy;
import proxy.SecurityProxyHandler;
import proxy.TxProxyHandler;

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
	public void testWithoutSecurityAndTransaction()
	{
		Client client = new Client();
		client.setCustomerService(new CustomerServiceImpl());
		client.update(new Customer("Dave", "Mustaine"));
	}
	
	@Ignore
	@Test 
	public void testWithSecurityAndTransaction()
	{
		Client client = new Client();
		client.setCustomerService(new CustomerServiceTxProxy(
				new CustomerServiceSecurityProxy(new CustomerServiceImpl())));
		client.update(new Customer("Richard", "Dawkins"));
	}
	
	@Test
	public void testDynamicProxy()
	{
		CustomerService target = new CustomerServiceImpl();
		
		// add transaction proxy handler
		TxProxyHandler txProxyHandler = new TxProxyHandler(target);
		CustomerService customerService = (CustomerService) Proxy.newProxyInstance(
				CustomerService.class.getClassLoader(), 
				new Class[] {CustomerService.class}, 
				txProxyHandler);
		
		// add security proxy handler
		SecurityProxyHandler securityProxyHandler = new SecurityProxyHandler(customerService);
		customerService = (CustomerService) Proxy.newProxyInstance(
				CustomerService.class.getClassLoader(), 
				new Class[] {CustomerService.class}, 
				securityProxyHandler);
		
		Client client = new Client();
		client.setCustomerService(customerService);
		client.update(new Customer("Jenna", "Jameson"));
	}
}
