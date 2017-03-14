import java.util.Iterator;

public class ArrayListIterator<T> implements Iterator<T> {
	
	private ArrayList<T> lst;
	private int index;
	
	public ArrayListIterator(ArrayList<T> list) {
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
