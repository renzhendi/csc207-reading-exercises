import java.util.Arrays;


public class ArrayList implements List{
	
	private int[] data;
	private int validCount;
	
	public ArrayList() {
		data = new int[16]; // capacity
		validCount = 0;
	}
	
	public int getSize() {
		return validCount;
	}
	
	public int get(int index) {
		if (index >= validCount) {
			throw new IndexOutOfBoundsException();
		} else {
			return data[index];
		}
	}
	
	public void addFirst(int v) {
		for (int i = validCount; i > 0; i--) {
			data[i] = data[i-1];
		}
		data[0] = v;
	}
	
	public void addLast(int v) {
		if (data.length <= validCount) {
			data = Arrays.copyOf(data, data.length*2);
		}
		data[validCount++] = v;
	}
	
	public void main(String[] args) {
		ArrayList testArrLst = new ArrayList();
	}
}
