import java.util.PriorityQueue;

public class AsteroidTracker {
	public PriorityQueue<Asteroid> record;
	
	public AsteroidTracker() {
		record = new PriorityQueue<Asteroid>(new AsteriodDangerComparator());
		
	}
	
	public void addAsteroid(String title, int danger) {
		Asteroid ast = new Asteroid(title, danger);
		record.add(ast);
		
	}
	
	public Asteroid getNext() {
		Asteroid nex = record.poll();
		System.out.println("Next Asteroid to Destroy: " + nex.getName());
		return nex;
	}
}
