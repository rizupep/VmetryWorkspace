package hashtest;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class Treemaptest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap  map = new TreeMap ();//key and value
		//tree
		map.put("Name", "ABC");//key,value
		map.put("password", "123");
		map.put("domain","testing");
		map.put("company","vmetry");
		//map.put("address", null);
		//map.put(null, "adyar");
		System.out.println(map.get("company"));
	
	Set s=map.keySet();
	Iterator it = s.iterator();
	while (it.hasNext()){
		String Key =(String) it.next();
		System.out.println(Key+"----"+map.get(Key));
	}
		
	}

}
