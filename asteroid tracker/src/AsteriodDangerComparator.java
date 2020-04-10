import java.util.Comparator;

public class AsteriodDangerComparator implements Comparator<Asteroid> {

	@Override
	public int compare(Asteroid arg0, Asteroid arg1) {
		return arg0.getDanger()-arg1.getDanger();
	}

}
