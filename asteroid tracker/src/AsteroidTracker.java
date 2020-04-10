import java.util.PriorityQueue;

public class AsteroidTracker {
	public PriorityQueue<Asteroid> record;
	
	public AsteroidTracker() {
		record = new PriorityQueue<Asteroid>(new AsteriodDangerComparator());
		//make the queue with the special comparator
		
	}
	
	public void addAsteroid(String title, int danger) {
		Asteroid ast = new Asteroid(title, danger);
		record.add(ast);
		//add an asteroid from title and danger
		//high danger numbers should be destroyed sooner
	}
	
	public void addAsteroid(Asteroid a) {
		record.add(a);
		//alt add asteroid for if you already made one
	}
	
	public Asteroid getNext() {
		if (record.size() > 0) { //if there are some in the record
			Asteroid nex = record.poll();
			System.out.println("Next Asteroid to Destroy: " + nex.getName());
			return nex; //returns asteroid and prints name
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
