package practice;

import java.util.LinkedHashMap;

public class MapLinkedHashMap {

	public static void main(String[] args) {

		LinkedHashMap<Object, Object> l = new LinkedHashMap<>();
		l.put("Sunrise", 567);
		l.put("Tamil", 89);
		l.put("English", 70);
		l.put(false, 89);
		l.put("Maths", 77);
		l.put("English", 66);
		l.put(null, 'T');
		l.put("Social", null);
		l.put(78.56, "Hello");
		l.put("English", 20000);

		System.out.println(l);
	}

}
