package prototype;

public class Tea implements Cloneable
{
	private int sugarCount;
	
	public Tea(int sugarCount) {
		this.sugarCount = sugarCount;
	}
	
	public int getSugarCount() {
		return sugarCount;
	}
	
	public void setSugarCount(int sugarCount) {
		this.sugarCount = sugarCount;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
