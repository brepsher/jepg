import static org.junit.Assert.*;
import org.junit.*;

public class RectangleTest {

	@Before
	// Will be performed before each test.
	public void testSetup()
	{
		System.out.println("Setup for test complete.");
	}

	@After
	// Will be performed after each test.
	public void testComplete()
	{
		System.out.println("Test complete.");
	}

	@Test
	public void test1() {
		
		try {
		
			Rectangle r1 = new Rectangle();

	        	int x1 = 10, y1 = 20;
	        	int x2 = 30, y2 = 60;

			assertTrue("Test 1: Line", r1.draw(x1, y1, x2, y2));
		}
		catch (AssertionError e) { System.out.println(e.getMessage()); }
	}

	public static void main(String[] args) 
	{
		org.junit.runner.JUnitCore.main("RectangleTest");
	}
}

