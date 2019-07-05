package compN;

import java.util.Comparator;

public class NameComp implements Comparator<TF> {

	@Override
	public int compare(TF o1, TF o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}

}
