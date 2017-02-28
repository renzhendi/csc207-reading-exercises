
public class Box<T> {
	private T value;
	public Box(T value) { this.value = value; }
	public T getValue() { return value; }
	public void setValue(T value) { this.value = value; }
	
	public static void main (String[] args) {
		Box<String> pm = new Box<>("PM");
		System.out.println("The box value is " + pm.getValue() + ".");
	}
}
