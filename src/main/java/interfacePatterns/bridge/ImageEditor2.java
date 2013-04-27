package interfacePatterns.bridge;

import oodp.cizim2.CizimProgramiV2;

public class ImageEditor2 implements ImageEditor 
{
	private CizimProgramiV2 api = new CizimProgramiV2();
	
	@Override
	public void drawLine() {
		api.ciz_cizgi();
	}

	@Override
	public void drawCircle() {
		api.ciz_cember();
	}
}
