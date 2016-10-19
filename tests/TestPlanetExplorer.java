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
	public void test_getInitialDirection() {
		
		// Get initial position of explorer
		String direction = explorer.getDirection();
		
		// Assert
		assertEquals("Invalid initial direction", "N", direction);
	}
	
	@Test
	public void test_moveForward() {
		fail("Not yet implemented");
	}
}
