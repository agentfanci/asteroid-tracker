
public class Asteroid {
	private int danger; //danger level- higher numbers should be destroyed sooner
	private  String title; //some identifier
	
	public Asteroid(String titl, int dan) {
		title = titl;
		danger = dan;
	}
	
	public int getDanger() {
		return danger; 
	}
	
	public String getName() {
		return title;
	}
}
