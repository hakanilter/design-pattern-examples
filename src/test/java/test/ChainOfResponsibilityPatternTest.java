package test;

import org.junit.Test;

import responsibility.chain.ChiefExecutiveOfficer;
import responsibility.chain.ChiefFinancialOfficer;
import responsibility.chain.FinancialSpecialist;
import responsibility.chain.Management;
import responsibility.chain.Request;

/**
 * Bir grup sinif icerisinden nesne ile ilgili islem 
 * yapacak olan sinifi bilmeden sirayla tum siniflara 
 * gonderilip islemekte kullanilir
 * 
 * Ornek Servlet Filter'lar 
 *
 */
public class ChainOfResponsibilityPatternTest 
{
	@Test
	public void test()
	{
		Management management = new FinancialSpecialist(new ChiefFinancialOfficer(new ChiefExecutiveOfficer()));
		System.out.println(management.isApproved(new Request(100)));
		System.out.println(management.isApproved(new Request(10000)));
		System.out.println(management.isApproved(new Request(100000)));
	}
}
