package practice;

import java.util.ArrayList;
import java.util.Iterator;

public class ListArrayListTest {

	public static void main(String[] args) {

		ArrayList<Object> a = new ArrayList<>();
		a.add(true);
		a.add(89);
		a.add("GoodMorning");
		a.add('V');
		a.add(null);
		a.add(34.23);
		a.add("GoodMorning");

		System.out.println(a);
		a.add(3, "New");

		System.out.println(a);

		System.out.println(a.contains('V'));

		System.out.println(a.get(6));

		System.out.println(a.indexOf("GoodMorning"));

		a.set(4, false);

		System.out.println(a);

		System.out.println(a.size());

		Object[] arr = a.toArray();

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		System.out.println("__________________________");

		for (int j = 0; j < a.size(); j++) {
			System.out.println(a.get(j));
		}

		System.out.println("____________________________");

		for (Object z : a) {
			System.out.println(z);
		}

		System.out.println("____________________________");

		a.forEach(w -> System.out.println(w));

		System.out.println("____________________________");

		Iterator<Object> it = a.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
