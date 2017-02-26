import java.util.Arrays;


public class ArrayList {
	
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
