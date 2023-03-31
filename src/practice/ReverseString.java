package practice;

public class ReverseString {

	String s1 = "Oranium";
	String result = ""; // m

	public void logic() {
		for (int i = s1.length() - 1; i >= 0; --i) {
			// System.out.print(s1.charAt(i)+ " ");
			result = result + s1.charAt(i); // m => result =mui
		}
		System.out.println(result);

	}

	public static void main(String[] args) {
		
		
		ReverseString r = new ReverseString();
		r.logic();
		
	}
}
