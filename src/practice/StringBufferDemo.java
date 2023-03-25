package practice;

public class StringBufferDemo {

	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer("HelloEveryone");
		sb.append(" Good Morning");

		System.out.println(sb);

		sb.append("ALL THE BEST ");

		System.out.println(sb);

		StringBuilder sbuild = new StringBuilder("Selenium");
		sbuild.append(" + java ");

		System.out.println(sbuild);

	}

}
