import static org.junit.Assert.*;

import org.junit.Test;

public class TestPlanetExplorer {

	// Create a new PlanetExplorer for tests
	PlanetExplorer explorer = new PlanetExplorer(100,100,"(5,5)(7,8)");
	
	@Test
	public void test_getInitialPosition() {
			
		// Get value
		int position = explorer.getPosition();
		
		// Assert
		assertEquals("Invalid initial position", 0, 0, position);
	}
	
	@Test
	public void test_getDirection() {
		fail("Not yet implemented");
	}
	
	@Test
	public void test_moveForward() {
		fail("Not yet implemented");
	}
}
