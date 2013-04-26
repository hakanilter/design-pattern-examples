package adapter;

import oodp.ge.GeneralElectric;

public class GeneralElectricLampAdapter implements Lamp 
{
	private GeneralElectric lamp = new GeneralElectric();
	
	@Override
	public void on() {
		lamp.electricityOn();
	}

	@Override
	public void off() {
		lamp.electricityOff();
	}
}
