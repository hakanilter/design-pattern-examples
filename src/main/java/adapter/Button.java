package adapter;

public class Button 
{
	private Lamp lamp;
	
	public Button(Lamp lamp) {
		this.lamp = lamp;
	}
	
	public void on() {
		lamp.on();
	}
	
	public void off() {
		lamp.off();
	}
}
