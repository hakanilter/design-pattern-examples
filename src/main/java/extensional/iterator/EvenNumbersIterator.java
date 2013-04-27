package extensional.iterator;

import java.util.Iterator;
import java.util.List;

public class EvenNumbersIterator implements Iterator<Integer> 
{
	private List<Integer> data;
	private int currentIndex = 0;
	
	public EvenNumbersIterator(List<Integer> data) {
		this.data = data;
	}
	
	@Override
	public boolean hasNext() {
		return currentIndex < data.size();				
	}

	@Override
	public Integer next() 
	{
		Integer value = null;
		do {
			value = null;
			value = data.get(currentIndex++);
		} while (value % 2 != 0);
		return value;
	}

	@Override
	public void remove() {
		throw new UnsupportedOperationException();
	}
}
