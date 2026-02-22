package collect;

import java.util.Comparator;

public class BasedOnPrice implements Comparator<ITCProducts>{

	@Override
	public int compare(ITCProducts o1, ITCProducts o2) {
		
		return o1.price-o2.price;
	}

}
