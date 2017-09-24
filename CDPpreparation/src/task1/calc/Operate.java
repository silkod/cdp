package task1.calc;

public class Operate {
	public static void plus(int a, int b) {
		System.out.println("= " + (a + b));
	}

	public static void minus(int a, int b) {
		System.out.println("= " + (a - b));
	}

	public static void multiply(int a, int b) {
		System.out.println("= " + a*b);
	}

	public static void division(int a, int b) {
		double c = a;
		double d = b;
		System.out.println("= " + c/d);
	}

}
