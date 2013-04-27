package constructionPatterns.prototype;

import java.util.ArrayList;
import java.util.List;

public class Tea implements Cloneable
{
	private int sugarCount;
	private List<String> list = new ArrayList<String>();
	
	// constructor
	public Tea(int sugarCount) {
		this.sugarCount = sugarCount;
	}
	
	// copy constructor
	public Tea(Tea tea) {
		this.sugarCount = tea.sugarCount;
	}
	
	public int getSugarCount() {
		return sugarCount;
	}
	
	public void setSugarCount(int sugarCount) {
		this.sugarCount = sugarCount;
	}
	
	public List<String> getList() {
		return list;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
