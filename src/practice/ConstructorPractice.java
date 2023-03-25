package practice;

public class ConstructorPractice extends SecondConstructor {

	int a, b;

	ConstructorPractice() // Non-Parameterized constructor
	{
		this(20, 10);
		a = 50;
		b = 20;
	}

	ConstructorPractice(int v1, int v2) // Parameterized constructor
	{
		this(55);
		System.out.println("Addition 2 : " + (v1 + v2));
	}

	ConstructorPractice(int n1) {
		this(4.5, 8);
		System.out.println("Addition 3 : " + (n1 + n1));
	}

	ConstructorPractice(double v1, int v2) {
		this(20, 5.8);
		System.out.println("Addition 4 : " + (v1 + v2));
	}

	ConstructorPractice(int v1, double v2) {
		super("Hello");
		System.out.println("Addition 5 : " + (v1 + v2));
	}

	public void test1() {
		System.out.println("Addition 1: " + (a + b));
	}

	public static void main(String[] args) {
		ConstructorPractice c = new ConstructorPractice();
		c.test1();

	}

}
