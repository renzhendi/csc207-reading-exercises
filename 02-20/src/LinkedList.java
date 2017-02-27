
public class LinkedList implements List{
	
	private static class Node {
		
		// fields
		public int value;
		public Node nextNode;
		
		// constructors
		public Node() {
			value = 0;
			nextNode = null;
		}
		
		public Node(int thisVal, Node nextPoinnt) {
			value = thisVal;
			nextNode = nextPoinnt;
		}
	}
	
	// fields
	private Node firstNode;

	// constructors
	public LinkedList() {
		firstNode = null;
	}
	
	public LinkedList(int firstValue) {
		firstNode = new Node(firstValue, null);
	}
	
	// methods
	public void addFirst(int v) {
		firstNode = new Node(v, firstNode);
	}
	
	public void addLast(int v) {
		if (firstNode == null){
			firstNode = new Node(v,null);
		} else {
		Node curNode = firstNode;
		while (curNode.nextNode != null){
			curNode = curNode.nextNode;
		}
		curNode.nextNode = new Node(v, null);
		}
	}
	
	public void remove(int index) {
		Node curNode = firstNode;
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
	
	public int removeWY(int index) {
		int i = 0;
		Node cur = firstNode;
		while(i != index-1) {
			cur = cur.nextNode;
			i++;
		}
		Node temp = cur.nextNode;
		cur.nextNode = cur.nextNode.nextNode;
		return temp.value;
	}
	
	public int getSize() {
		int curSize = 0;
		Node curNode = firstNode;
		while (curNode != null) {
			curSize += 1;
			curNode = curNode.nextNode;
		}
		return curSize;
	}
	
	public int get(int index) throws IllegalArgumentException{
		if (index < 0) {
			throw new IllegalStateException("Negative Index!");
		}
		Node curNode = firstNode;
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
	
	public boolean contains(int v) { return true; }
	
	public void printList() {
		Node curNode = firstNode;
		while (curNode != null) {
			System.out.print(curNode.value);
			curNode = curNode.nextNode;
		}
		System.out.println();
	}
	
	// main method test
	public static void main (String[] args) {
		LinkedList test = new LinkedList();
		test.addFirst(1);
		test.addLast(2);
		test.addLast(3);
		test.addLast(4);
		test.printList();
		test.removeWY(2);
		test.printList();
	}
}
