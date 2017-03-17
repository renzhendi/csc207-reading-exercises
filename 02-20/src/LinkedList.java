import java.util.Iterator;

public class linkedlist<T> implements List<T>{
	
	private static class Node<T> {
		
		// fields
		public T value;
		public Node<T> nextNode;
		
		public Node(T thisVal, Node<T> nextPoint) {
			value = thisVal;
			nextNode = nextPoint;
		}
	}
	
	// fields
	private Node<T> firstNode;

	// constructors
	public linkedlist() {
		firstNode = null;
	}
	
	public linkedlist(T firstValue) {
		firstNode = new Node<T>(firstValue, null);
	}
	
	// methods
	public void addFirst(T v) {
		firstNode = new Node<T>(v, firstNode);
	}
	
	public void addLast(T v) {
		if (firstNode == null){
			firstNode = new Node<T>(v,null);
		} else {
		Node<T> curNode = firstNode;
		while (curNode.nextNode != null){
			curNode = curNode.nextNode;
		}
		curNode.nextNode = new Node<T>(v, null);
		}
	}
	
	public void remove(int index) {
		Node<T> curNode = firstNode;
		if (index >= this.getSize() || index < 0) {
			throw new IndexOutOfBoundsException("Unavailable Index!");
		} else if (index == 0) {
			firstNode = firstNode.nextNode;
		} else {
			for (int i=0; i<index-1; i++) {
				curNode = curNode.nextNode;
			}
			curNode.nextNode = curNode.nextNode.nextNode;
		} 
	}
	
	public T remove2(int index) {
		Node<T> cur = firstNode;
		if (index == 0) {
			firstNode = firstNode.nextNode;
		}
		while(index > 1) {
			cur = cur.nextNode;
			index--;
		}
		Node<T> temp = cur.nextNode;
		cur.nextNode = cur.nextNode.nextNode;
		return temp.value;
	}
	
	public int getSize() {
		int curSize = 0;
		Node<T> curNode = firstNode;
		while (curNode != null) {
			curSize += 1;
			curNode = curNode.nextNode;
		}
		return curSize;
	}
	
	public T get(int index) throws IllegalArgumentException{
		if (index < 0) {
			throw new IllegalStateException("Negative Index!");
		}
		Node<T> curNode = firstNode;
		for (int i = 0; i < index; i++){
			if (curNode.nextNode != null) {
				curNode = curNode.nextNode;
			}
			else {
				throw new IllegalStateException("Index Exceeds Size!");
			}
		}
		return curNode.value;
	}
	
	public boolean contains(T v) {
		if (firstNode == null) { return false; }
		Node<T> cur = firstNode;
		while (cur != null) {
			if (cur.value == v) {
				return true;
			} else {
				cur = cur.nextNode;
			}
		}
		return false;
	}
	
	public void printList() {
		Node<T> curNode = firstNode;
		while (curNode != null) {
			System.out.print(curNode.value);
			curNode = curNode.nextNode;
		}
		System.out.println();
	}
	
	public void dedupHead() {
		if (firstNode == null) { return; }
		T val = firstNode.value;
		Node<T> cur = firstNode;
		while (cur.nextNode != null) {
			if (cur.nextNode.value == val) {
				cur.nextNode = cur.nextNode.nextNode;
			} else {
				cur = cur.nextNode;
			}
		}
	}
	
	private static class linkedlistiterator<T> implements Iterator<T> {
		
		public linkedlist<T> lst;
		public Node<T> cur;
		
		public linkedlistiterator<T> (linkedlist<T> list, Node<T> pointer) {
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
	
	public Iterator iterator() {
		return new linkedlistiterator<>(firstNode);
	}
	// main method test
	public static void main (String[] args) {
		linkedlist<Integer> test = new linkedlist<>();
		test.addFirst(3);
		test.addLast(1);
		test.addLast(3);
		test.addLast(8);
		test.addLast(9);
		test.addLast(7);
		test.printList();
		// System.out.println(test.contains(7));
		// System.out.println(test.contains(8));
		test.remove2(2);
		// test.dedupHead();
		test.printList();
	}
}
