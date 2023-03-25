package practice;

import java.util.LinkedList;

public class ListLinkedListDemo {

	public static void main(String[] args) {

		LinkedList<Object> l = new LinkedList<Object>();
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
