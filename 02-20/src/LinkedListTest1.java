import static org.junit.Assert.*;

import org.junit.Test;


public class linkedlistTest1 {

	@Test
	public void testLSize() {
		List<Integer> l = new linkedlist<>();
		testSize(l);
	}
	
	public void testSize(List<Integer> l) {
		assertEquals(0, l.getSize());
	}
}
