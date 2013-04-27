package interfaces.adapter;

import oodp.philips.Philips;

public class PhilipsLampAdapter implements Lamp 
{
	private Philips lamp = new Philips();

	@Override
	public void on() {
		lamp.switchOn();
	}

	@Override
	public void off() {
		lamp.switchOff();
	}
}
