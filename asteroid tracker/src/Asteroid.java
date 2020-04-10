
public class Asteroid {
	private int danger;
	private  String title;
	
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
