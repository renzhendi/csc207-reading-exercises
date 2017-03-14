import java.util.Iterator;

public class LinkedListIterator<T> implements Iterator<T> {
	
	public LinkedList<T> lst;
	public Node<T> cur;
	
	public LinkedListIterator<T> (LinkedList<T> list, Node<T> pointer) {
		this.lst = list;
		this.cur = pointer;
	}
	
	@Override
	public boolean hasNext() {
		if (cur.nextNode == null) {
			return false;
		} else {
			return true;
		}
	}
	
	@Override
	public T next() {
		T ret = cur.value;
		cur = cur.nextNode;
		return null;
	}
}
