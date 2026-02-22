package collect;

import java.util.Comparator;

public class BasedOnName implements Comparator<ITCProducts>{

	@Override
	public int compare(ITCProducts o1, ITCProducts o2) {
		
		return o1.pname.compareTo(o2.pname);
	}

}
