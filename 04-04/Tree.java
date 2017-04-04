
public class Tree<T extends Comparable<T>>  {

	private static class Node<T> {
		public T value;
		public Node<T> left;
		public Node<T> right;
		public Node(T value , Node<T> left, Node<T> right) {
			this.value = value;
			this.left = left;
			this.right = right;
		}
		public Node(T value) {
			this(value, null, null);
		}
	}

	private Node<T> root;

	/**
	 * Constructor
	 */
	public Tree() { root = null; }

	/**
	 * Size block
	 * @param cur
	 * @return
	 */
	private int sizeH(Node<T> cur) {
		if (cur == null) { return 0; }
		else { return 1 + sizeH(cur.left) + sizeH(cur.right); }
	}
	public int size() { return sizeH(root); }
	
	/**
	 * Insert(add) block
	 * @param v
	 * @param cur
	 * @return
	 */
	private Node<T> insertH(T v, Node<T> cur) {
		if (cur == null) { return new Node<>(v); }
		else {
			if (v.compareTo(cur.value) < 0) { cur.left = insertH(v, cur.left); }
			else { cur.right = insertH(v, cur.right); }
			return cur;
		}
	}
	public void insert(T v) { root = insertH(v, root); }

	/**
	 * Print the in-order traversal
	 */
	public void printInorder(Node<T> cur) {
		if (cur.left == null) { System.out.println(cur.value); }
		else { printInorder(cur.left); printInorder(cur.right); }
	}
	
	public static void main(String[] args) {
		Tree<Integer> Try = new Tree<Integer>();
		Try.insert(5);		
		Try.printInorder(Try.root);
	}
}
