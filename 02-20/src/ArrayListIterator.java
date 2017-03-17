import java.util.Iterator;

public class arraylistiterator<T> implements Iterator<T> {
	
	private arraylist<T> lst;
	private int index;
	
	public arraylistiterator(arraylist<T> list) {
		this.lst = list;
		index = 0;
	}
	
	public boolean hasNext() {
		return index < lst.getSize();
	}
	
	public T next() {
		return lst.get(index++);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
