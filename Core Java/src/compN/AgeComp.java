package compN;

import java.util.Comparator;

public class AgeComp implements Comparator<TF> {

	@Override
	public int compare(TF o1, TF o2) {
		// TODO Auto-generated method stub
		if(o1.getAge()<o2.getAge()) {
			return -1;
		}else if(o1.getAge()>o2.getAge()) {
			return 1;
		}else
		return 0;
	
	}

}
