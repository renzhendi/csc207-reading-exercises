
public class Node<T> {
	
	public T value;
	public Node<T> nextNode;
	
	public Node(T thisVal, Node<T> nextPoint) {
		value = thisVal;
		nextNode = nextPoint;
	}
}
