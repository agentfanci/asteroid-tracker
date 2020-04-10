import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AsteroidTrackerTest {

	@Test
	void addTest() { //can you add anything at all
		AsteroidTracker a = new AsteroidTracker();
		a.addAsteroid("Big Rock", 40);
	}
	
	@Test
	void getNextTest() { //does get next get the thing
		AsteroidTracker a = new AsteroidTracker();
		a.addAsteroid("The big one", 20);
		String n = a.getNext().getName();
		assertEquals("The big one", n);
	}
	
	@Test
	void reorderTest() { //does it order by danger and not when you put it in
		AsteroidTracker a = new AsteroidTracker();
		a.addAsteroid("Little rock", 10);
		a.addAsteroid("Big rock", 50);
		assertEquals("Big rock", a.getNext().getName());
		assertEquals("Little rock", a.getNext().getName());
		assertEquals("All Destroyed", a.getNext().getName());
	}
	
	@Test
	void endTest() { //can you add more after the current were done, and then add another and get the all done message again?
		AsteroidTracker a = new AsteroidTracker();
		a.addAsteroid("Little rock", 10);
		a.addAsteroid("Big rock", 50);
		a.getNext();
		a.getNext();
		String en = a.getNext().getName();
		assertEquals("All Destroyed", en);
		a.addAsteroid("New rock", 15);
		String nr = a.getNext().getName();
		assertEquals("New rock", nr);
		en = a.getNext().getName();
		assertEquals("All Destroyed", en);
		
	}
}

