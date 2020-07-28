package java8Excersise;

import java.util.Comparator;



public class Trycomparator implements Comparator<Pesrson>{



	@Override
	public int compare(Pesrson o1, Pesrson o2) {
		// TODO Auto-generated method stub
		return o1.getLastNmae().compareToIgnoreCase(o2.getLastNmae());
	}





}
