package collect;

import java.util.Comparator;

public class BasedOnId implements Comparator<ITCProducts>{

	@Override
	public int compare(ITCProducts o1, ITCProducts o2) {
		
		return o1.pid-o2.pid;
	}

}
