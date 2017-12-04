package collectiontest;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Linkedhashsettest {
// iterator is a pair of set 
	//which doesnt have index iterator will be used
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet s= new LinkedHashSet();
		//tree is a class which removes duplicate and provides output in a ascending order
		s.add("A");
		s.add("D");
		s.add("C");
		s.add("B");
		s.add("A");
		s.add("C");
		s.add("D");
		s.add("B");
		//set is a interface which removes duplicate
		Iterator it=s.iterator();// to point  one by one
		while (it.hasNext()){// hashnext will check memory space 
			//hash is a class which removes the duplicate and provides output in a random manner
			System.out.println(it.next());//next is a function which reads the memory value
		}
	}

}
