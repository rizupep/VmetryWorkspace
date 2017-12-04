package hashtest;

import java.util.Enumeration;
import java.util.Hashtable;

public class Hashtabletest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable table = new Hashtable();// key and value
		// hashtable is a faster data recovery
		table.put("Name", "ABC");// key,value
		table.put("password", "123");
		table.put("domain", "testing");
		table.put("company", "vmetry");
		// table.put("address", null);
		// table.put(null, "adyar");

		// System.out.println(table.get("company"));

		Enumeration e = table.keys();

		while (e.hasMoreElements()) {
			String key = (String) e.nextElement();
			System.out.println(key + "----" + table.get(key));

		}
	}

}
