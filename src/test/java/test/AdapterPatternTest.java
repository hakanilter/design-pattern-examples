package test;

import org.junit.Test;

import interfacePatterns.adapter.GeneralElectricLampAdapter;
import interfacePatterns.adapter.Lamp;
import interfacePatterns.adapter.PhilipsLampAdapter;

/**
 *
 * Birbirine uyumlu olmayan iki sistemin arasina girerek
 * iletisim kurmalarini saglar
 *
 */
public class AdapterPatternTest 
{
	@Test
	public void test()
	{
		Lamp lamp1 = new GeneralElectricLampAdapter();
		lamp1.on();
		lamp1.off();
		
		Lamp lamp2 = new PhilipsLampAdapter();
		lamp2.on();
		lamp2.off();
	}
}
