import java.util.Iterator;

public class linkedlistiterator<T> implements Iterator<T> {
	
	public linkedlist<T> lst;
	public Node<T> cur;
	
	public LinkedListIterator<T> (linkedlist<T> list, Node<T> pointer) {
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
