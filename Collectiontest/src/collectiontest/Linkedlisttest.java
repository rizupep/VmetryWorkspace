package collectiontest;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;

public class Linkedlisttest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList s= new LinkedList();
		//in general operation array list is faster than linked list 
		//but when frequent insertion or deletion comes linked will be faster than array
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
		Iterator it=s.iterator();
		while (it.hasNext()){
			//hash is a class which removes the duplicate and provides output in a random manner
			System.out.println(it.next());
		}
	}

}
