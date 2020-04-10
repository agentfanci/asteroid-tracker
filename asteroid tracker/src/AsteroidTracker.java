import java.util.PriorityQueue;

public class AsteroidTracker {
	public PriorityQueue<Asteroid> record;
	
	public AsteroidTracker() {
		record = new PriorityQueue<Asteroid>(new AsteriodDangerComparator());
		//this.addAsteroid("All Discovered Asteroids Destroyed!", 0);
		
	}
	
	public void addAsteroid(String title, int danger) {
		Asteroid ast = new Asteroid(title, danger);
		record.add(ast);
		
	}
	
	public void addAsteroid(Asteroid a) {
		record.add(a);
	}
	
	public Asteroid getNext() {
		if (record.size() > 0) {
			Asteroid nex = record.poll();
			System.out.println("Next Asteroid to Destroy: " + nex.getName());
			return nex;
		}
		else {
			Asteroid ender = new Asteroid("All Destroyed", 0);
			//danger of 0- should come last, in any case
			record.add(ender);
			this.getNext(); //the next asteroid should be the ender, but in case there's one left
			return ender; //shouldn't get here, but in case
		}
	}
}
