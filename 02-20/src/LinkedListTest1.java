import static org.junit.Assert.*;

import org.junit.Test;


public class LinkedListTest1 {

	@Test
	public void testLSize() {
		List l = new LinkedList();
		testSize(l);
	}
	
	@Test
	public void testASize() {
		List l = new ArrayList();
		testSize(l);
	}
	
	public void testSize(List l) {
		assertEquals(0, l.getSize());
	}
}
