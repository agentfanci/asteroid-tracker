
public interface IAsteroidTracker {
	void addAsteroid(String title, int danger); //add an asteroid with a title and danger to the tracker
	Asteroid getNext(); //return and print name of asteroid with next highest danger, returns "All Destroyed" asteroid when all entered asteroids are gone
	
}
