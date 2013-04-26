package bridge;

import oodp.cizim1.CizimProgramiV1;

public class ImageEditor1 implements ImageEditor 
{
	private CizimProgramiV1 api = new CizimProgramiV1();
	
	@Override
	public void drawLine() {
		api.cizgiCiz();
	}

	@Override
	public void drawCircle() {
		api.cemberCiz();
	}
}
