import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AsteroidTrackerTest {

	@Test
	void addTest() {
		AsteroidTracker a = new AsteroidTracker();
		a.addAsteroid("Big Rock", 40);
	}
	
	@Test
	void getNextTest() {
		AsteroidTracker a = new AsteroidTracker();
		a.addAsteroid("The littler one", 20);
		String n = a.getNext().getName();
		assertEquals("The littler one", n);
	}
	
	@Test
	void reorderTest() {
		AsteroidTracker a = new AsteroidTracker();
		a.addAsteroid("Little rock", 10);
		a.addAsteroid("Big rock", 50);
		assertEquals("Big rock", a.getNext().getName());
		assertEquals("Little rock", a.getNext().getName());
		assertEquals("All Destroyed", a.getNext().getName());
	}
}

