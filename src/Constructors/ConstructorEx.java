package Constructors;

public class ConstructorEx {
//Constructor
	ConstructorEx() {

		System.out.println("0-argument Constructor");
	}

	ConstructorEx(int a, int b) {
		System.out.println(a + b);
		System.out.println("Parametrized Constructor-1");
	}

	ConstructorEx(boolean b, char c) {
		System.out.println(b);
		System.out.println(c);
		System.out.println("Parametrized Constructor-2");
	}

	public static void main(String[] args) {

		ConstructorEx s3 = new ConstructorEx(true, 'H');

		ConstructorEx s2 = new ConstructorEx(100, 400);

		ConstructorEx s1 = new ConstructorEx();

	}

}
