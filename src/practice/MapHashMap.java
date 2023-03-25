package practice;

import java.util.*;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class MapHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Object, Object> h = new HashMap<>();
		h.put("Tamil", 89);
		h.put("English", 70);
		h.put(false, 89);
		h.put("Maths", 77);
		h.put("English", 66);
		h.put(null, 'T');
		h.put("Social", null);
		h.put(78.56, "Hello");
		h.put("English", 20000);

		System.out.println(h);

		Set<Object> key = h.keySet();
		for (Object k : key) {
			System.out.println(k);
		}
		System.out.println("**********************");

		Collection<Object> col = h.values();
		for (Object c : col) {
			System.out.println(c);
		}

		System.out.println("**********************");

		Set<Entry<Object, Object>> es = h.entrySet();
		for (Entry<Object, Object> e : es) {
			System.out.println(e.getKey() + "--->");
		}

	}

}
