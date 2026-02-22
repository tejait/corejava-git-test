package collect;

import java.util.Comparator;

public class BasedOnDiscount implements Comparator<ITCProducts>{

	@Override
	public int compare(ITCProducts o1, ITCProducts o2) {
		
		return o1.discount-o2.discount;
	}
}
