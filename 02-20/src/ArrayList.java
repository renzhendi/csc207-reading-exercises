import java.util.Arrays;

public class ArrayList<T> implements List<T>{
	
	private T[] data;
	private int validCount;
	
	public ArrayList() {
		data = new T[16]; // capacity
		validCount = 0;
	}
	
	public int getSize() {
		return validCount;
	}
	
	public T get(int index) {
		if (index >= validCount) {
			throw new IndexOutOfBoundsException();
		} else {
			return data[index];
		}
	}
	
	public void addFirst(T v) {
		for (int i = validCount; i > 0; i--) {
			data[i] = data[i-1];
		}
		data[0] = v;
	}
	
	public void addLast(T v) {
		if (data.length <= validCount) {
			data = Arrays.copyOf(data, data.length*2);
		}
		data[validCount++] = v;
	}

}
