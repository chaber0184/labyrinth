package project3;

import static org.junit.Assert.*;

import org.junit.Test;

public class PossibleLocationsStackTest {

	@Test
	public void testAdd() {
		try {
			PossibleLocationsStack test = new PossibleLocationsStack();
			Location locTest1 = new Location(24,53);
			test.add(locTest1);
			Location locTest2 = new Location(1,1);
			test.add(locTest2);
			Object locTest3 = null;
			//test.add(locTest3);
			assertEquals("First entry in list should be locTest2",locTest2,test.getTop().getElement());
			assertEquals("Second entry in list should be locTest1",locTest1,test.getTop().getNext().getElement());
		}
		catch(Exception e) {
			fail("testAdd failed: Exception thrown\n" + e.getClass() + "\n" + e.getMessage());
		}
		
	}

	@Test
	public void testRemove() {
		fail("Not yet implemented");
	}

	@Test
	public void testIsEmpty() {
		fail("Not yet implemented");
	}

	@Test
	public void testToString() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetSize() {
		fail("Not yet implemented");
	}

}
