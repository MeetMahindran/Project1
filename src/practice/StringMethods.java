package practice;

public class StringMethods {

	public static void main(String[] args) {

		String s1 = "Good Morning";
		String s2 = new String("APPLE");
		String s3 = "APPLE";
		String s4 = "jaVa";
		String s5 = "    Selenium with java    ";
		String s6 = "  ADHSJJDGFN537873893teyeuu6637&*@%@$^abansgADGJBDGJ";

		System.out.println(s1);

		System.out.println(s2);

		System.out.println(s2.hashCode());

		System.out.println(s3.hashCode());

		System.out.println(s3.toLowerCase());

		System.out.println(s4.toUpperCase());

		System.out.println(s5);

		System.out.println(s5.trim());

		System.out.println(s1.charAt(7)); // Returns the character value at specified index position

		System.out.println(s2.concat(" Milkshake "));

		System.out.println(s4.contains("AV"));

		// System.out.println(s5.contentEquals("wit"));

		System.out.println(s1.endsWith("ing"));

		System.out.println(s1.equals("GOOD Morning"));

		System.out.println(s1.equalsIgnoreCase("GOOD Morning"));

		System.out.println(s3.indexOf('P'));

		System.out.println(s3.lastIndexOf('P'));

		System.out.println(s4.isEmpty());

		System.out.println(s5.length());

		System.out.println(s5.replace('j', 'J'));

		System.out.println(s5.replaceAll("java", "Python"));

		System.out.println(s6.replaceAll("[^0-9]", ""));

		String[] a = s5.split(" ");

		for (String t : a) {
			System.out.println(t);
		}

		System.out.println(s6);
		System.out.println(s6.substring(5));
		System.out.println(s6.substring(7, 15));

	}

}
