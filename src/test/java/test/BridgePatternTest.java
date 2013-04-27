package test;

import org.junit.Test;

import interfacePatterns.bridge.ImageEditor1;
import interfacePatterns.bridge.ImageEditor2;
import interfacePatterns.bridge.Rectangle;
import interfacePatterns.bridge.Triangle;

/**
 * 
 * Adapter pattern'e benzer, implementasyondan bagimsiz
 * sadece belli soyutlamalara ihtiyac varsa kullanilir
 *
 * Ornek: Log'lama ihtiyaci icin bir interface ve 
 * Log4j gibi bir implementasyon
 */
public class BridgePatternTest 
{
	@Test
	public void test()
	{
		Rectangle rectangle = new Rectangle();
		rectangle.setImageEditor(new ImageEditor1());
		rectangle.draw();
		
		Triangle triangle = new Triangle();
		triangle.setImageEditor(new ImageEditor2());
		triangle.draw();
	}
}
