
public class Node {
	
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
