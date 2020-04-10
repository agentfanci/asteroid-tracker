import java.util.Comparator;

public class AsteriodDangerComparator implements Comparator<Asteroid> {

	@Override
	public int compare(Asteroid arg0, Asteroid arg1) {
		return arg1.getDanger()-arg0.getDanger();
		//this is "backward" so we can have a high number for "Danger" for ones that should be destroyed first
		
	}

}
