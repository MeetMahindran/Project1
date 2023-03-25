package practice;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CollectionsSet1 {

	public static void main(String[] args) {

		// HashSet<> h = new HashSet<>();

		Set<Object> hs = new HashSet<Object>();
		hs.add("Morning");
		hs.add(56);
		hs.add("Hello");
		hs.add(true);
		hs.add(89);
		hs.add("GoodMorning");
		hs.add('V');
		hs.add(null);
		hs.add(34.23);
		hs.add("GoodMorning");

		System.out.println(hs);

		// We cannot use normal for loop and list to array method since the absence of
		// index format.

		// Enhanced For loop
		for (Object k : hs) {
			System.out.println(k);
		}
		System.out.println("***********************");

		// For each
		hs.forEach(b -> System.out.println(b));

		// Iterator

		Iterator<Object> it = hs.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
