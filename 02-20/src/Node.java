
public class Node {
	
	// fields
	private int value;
	private Node nextNode;
	
	// constructors
	public Node() {
		setValue(0);
		setNextNode(null);
	}
	
	public Node(int thisVal, Node nextPoinnt) {
		setValue(thisVal);
		setNextNode(nextPoinnt);
	}
	
	// getters and setters
	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public Node getNextNode() {
		return nextNode;
	}

	public void setNextNode(Node nextNode) {
		this.nextNode = nextNode;
	}

}
