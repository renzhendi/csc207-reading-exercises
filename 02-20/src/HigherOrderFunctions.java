import java.util.List;
import java.util.function.BiFunction;
import java.util.Arrays;
import java.util.ArrayList;

@FunctionalInterface
interface Conv<T, U> {
	public U conv(T t);
}

public class HigherOrderFunctions {
	
	private static List<Integer> scores;     // A student's scores on homeworks in a course
	private static List<Double>  readings;   // Normalized temperature readings in the range 0.0 (cold) to 1.0 (hot)
	private static List<String>  names;      // The full names of people on payroll
	
	public HigherOrderFunctions(List<Integer> s, List<Double>  r, List<String>  n) {
		scores = s;
		readings = r;
		names = n;
	}
	
	public static <T, U> List<U> map(Conv<T, U> f, List<T> lst) {
		List<U> ret = new ArrayList<>();
		for (T t : lst) {
			ret.add(f.conv(t));
		}
		return ret;
	}
	
	public static List<Double> getPercent() {
		List<Double> ret = new ArrayList<>();
		for (int i : scores) {
			ret.add(i / 100.0);
		}
		return ret;
	} 
	
	public static List<Double> adjNormal() {
		List<Double> ret = new ArrayList<>();
		for (double d : readings) {
			ret.add(d + 0.025);
		}
		return ret;
	} 
	
	public static List<String> getInitial() {
		List<String> ret = new ArrayList<>();
		for (String s : names) {
			ret.add("" + s.charAt(0));
		}
		return ret;
	} 
	
	public static void main(String[] args) {
		List<Integer> scores = Arrays.asList(97, 92, 78, 93, 98, 85, 100, 95);
		System.out.println(map((x) -> x / 100.0, scores));
		// try BiFunction, and variable capture
		int q = 5;
		BiFunction<Integer, Integer, Integer> plus = (x, y) -> { int z = x + y + q; return z; };
	}
}
