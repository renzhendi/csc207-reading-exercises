
public class StringMethods {

	/**
	 * @param s1: the string whose suffix is to be checked
	 * @param s2: the string to be repeated as suffix
	 * @param n: the number of repetitions
	 * return: the boolean value whether s1 ends with n repetitions of s2
	 */
	
	public static boolean endsWithRep(String s1, String s2, int n){
		String s2Rep = "";
		for (int i=0; i<n; i++){
			s2Rep += s2;
		}
		// System.out.println(s2Rep);
		return s1.endsWith(s2Rep);
	}
	
	public static void main(String[] args) {
		System.out.println(endsWithRep("foobarbar", "bar", 2));
		System.out.println(endsWithRep("foobarbar", "baz", 1));
		// TODO Auto-generated method stub

	}

}
