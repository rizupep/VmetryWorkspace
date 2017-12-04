package collectiontest;

import java.util.ArrayList;

public class Arraylisttest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a = new ArrayList();   
		a.add("Vmetry1");// 0
		a.add("Vmetry2");// 1
		a.add("Vmetry3");// 2nd index
		a.add(2, "Vmetry4");// 3
		// add to insert , get to retreive
		System.out.println(a.size());
		// a.add("Vmetry5");
		// System.out.println(a.size());
		// shift+ctrl+C to comment multi lines
		System.out.println(a.get(3));
		for (int i = 0; i < a.size(); i++) {
			System.out.println(a.get(i));
		}
	}

}
