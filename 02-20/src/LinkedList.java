
public class LinkedList {
	
	// fields
	public Node firstNode;

	// constructors
	public LinkedList() {
		firstNode = new Node();
	}
	
	public LinkedList(int firstValue) {
		firstNode = new Node(firstValue, null);
	}
}
