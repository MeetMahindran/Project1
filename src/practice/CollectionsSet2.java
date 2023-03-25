package practice;

import java.util.LinkedHashSet;

public class CollectionsSet2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedHashSet<Object> l = new LinkedHashSet<>();
		l.add(false);
		l.add(56);
		l.add("Hello");
		l.add(true);
		l.add(89);
		l.add("GoodMorning");
		l.add('V');
		l.add(null);
		l.add(34.23);
		l.add("GoodMorning");

		System.out.println(l);

	}

}
