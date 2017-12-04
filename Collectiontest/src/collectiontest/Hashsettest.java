package collectiontest;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Hashsettest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set s = new HashSet();
		s.add("A");
		s.add("D");
		s.add("C");
		s.add("B");
		s.add("A");
		s.add("C");
		s.add("D");
		s.add("B");
		// set is a interface which removes duplicate
		Iterator it = s.iterator();
		while (it.hasNext()) {
			// hash is a class which removes the duplicate and provides output
			// in a random manner
			System.out.println(it.next());
		}
	}

}
