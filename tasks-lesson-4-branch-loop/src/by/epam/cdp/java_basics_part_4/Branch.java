package by.epam.cdp.java_basics_part_4;

public class Branch {
	public static void methodTask1() {
		int a = 3;
		int b = 10;

		if (a < b) {
			System.out.println(7);
		} else {
			System.out.println(8);
		}
	}

	public static void methodTask8() {
		int a = 3;
		int b = 10;
		int min;

		if (a * a < b * b) {
			System.out.println(7);
		} else {
			System.out.println(8);
		}
	}

	public static void methodTask9() {
		int a = 3;
		int b = 3;
		int c = 3;

		if (a == b && b == c) {
			System.out.println("equilateral");
		} else {
			System.out.println("non-equilateral");
		}
	}

	public static void methodTask13() {
		int x1 = 5;
		int y1 = 10;
		int x2 = -1;
		int y2 = -10;

		double len1 = Math.sqrt(x1 * x1 + y1 * y1);
		double len2 = Math.sqrt(x2 * x2 + y2 * y2);

		if (len1 > len2) {
			System.out.println("B");
		} else if (len1 == len2) {
			System.out.println("equal");
		} else {
			System.out.println("A");
		}
	}

	public static void methodTask40() {
		int x = 10;
		double func;

		if (x <= 13) {
			func = 9 - Math.pow(x, 3);
		} else {
			func = (-3) / (x + 1);
		}

		System.out.println(func);
	}
}
