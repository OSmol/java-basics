package by.epam.cdp.java_basics_part_1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please, input a double variable");
		double num1, num2;
		while (sc.hasNextDouble() == false) {
			sc.next();
		}
		num1 = sc.nextDouble();
		
		System.out.println("Please, input one more double variable");
		while (sc.hasNextDouble() == false) {
			sc.next();
		}
		num2 = sc.nextDouble();

		// execute static methods
		methodTask1(num1, num2);
		methodTask2(10);
		methodTask3(3, 6);
		methodTask4(3, 2, 6);
		methodTask5(23.45, 12.34);
		methodTask6(12, 15);
		methodTask7(5);
		methodTask8(3.23, 4.56, 23.34);
		methodTask9(1.2, 3.67, 0.32, 234.123);
		methodTask10(3.4, 8.983);
		methodTask11(2.53, 23.44);
		System.out.println("12. Result " + round(methodTask12(3.2, 2.5, 23.4, 332.23), 3));
		methodTask13(1.2, 32.3, 23.4, 87.4, 33.2, 3.4);
		methodTask14(12.4);
		methodTask15();
		methodTask16(3727);
		methodTask17(3.2, 4.3);
		methodTask18(12.3);
		methodTask19(12.2);
		methodTask20(1234.3);
		methodTask21(111.444);
		System.out.println("22. Result " + methodTask22(32489));
		methodTask23(34.5, 39.7);
		methodTask24(2, 4.6, 0.57);
		methodTask25(2.4, 23.3, 1);
		methodTask26(2, 4.6, 0.57);
		methodTask27(3);
		methodTask28(1.32);
		methodTask29(2, 4, 3.5);
		methodTask30(1, 2, 3);

		// execute methods of object
		Main obj = new Main();
		obj.methodTask31(5, 3, 4, 2);
		obj.methodTask32(23, 44, 12, 12, 34, 56);
		obj.methodTask33('+');
		obj.methodTask34(1032409257);
		obj.methodTask35(12392, 123);
		obj.methodTask36(3828);
		obj.methodTask37();
		obj.methodTask38(1.1, 2.0);
		obj.methodTask39(12.2);
		obj.methodTask40(12.2);
	}

	private static double round(double x, int deg) {
		double roundOff = (double) Math.round(x * Math.pow(10, deg)) / Math.pow(10, deg);
		return roundOff;
	}

	private static void methodTask1(double a, double b) {
		System.out.printf("1. Sum = %1.3f, diff = %2.3f, comp = %3.3f, quot = %4.3f", a + b, a - b, a * b, a / b);
		System.out.println();
	}

	public static void methodTask2(int a) {
		int res = 3 + a;
		System.out.println("2. Result " + res);
	}

	public static void methodTask3(double x, double y) {
		double res = 2 * x + (y - 2) * 5;
		System.out.println("3. Result " + res);
	}

	public static void methodTask4(double a, double b, double c) {
		double res = ((a - 3) * b / 2) + c;
		System.out.println("4. Result " + res);
	}

	public static void methodTask5(double a, double b) {
		double res = (a + b) / 2;
		System.out.println("5. Result " + res);
	}

	public static void methodTask6(int n, int m) {
		double totalVol = m * (80 / n + 12);
		System.out.println("6. Result " + totalVol);
	}

	public static void methodTask7(int l) {
		int sqr = 2 * l * l;
		System.out.println("7. Result " + sqr);
	}

	public static void methodTask8(double a, double b, double c) {
		double res = (b + Math.sqrt(b * b + 4 * a * c)) / (2 * a) - c * Math.pow(a, 3) + Math.pow(b, -20);
		System.out.println("8. Result " + round(res, 3));
	}

	public static void methodTask9(double a, double b, double c, double d) {
		double res = 1 / d;
		System.out.println("9. Result " + round(res, 3));
	}

	public static void methodTask10(double x, double y) {
		double res = (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)) * Math.tan(x * y);
		System.out.println("10. Result " + round(res, 3));
	}

	public static void methodTask11(double a, double b) {
		double hyp = Math.sqrt(a * a + b * b);
		double sqr = a * b / 2;
		System.out.println("11. Square " + round(sqr, 3) + ", perimeter " + round(a + b + hyp, 3));
	}

	public static double methodTask12(double x1, double y1, double x2, double y2) {
		double a = Math.abs(x2 - x1), b = Math.abs(y2 - y1), res = Math.sqrt(a * a + b * b);
		return res;
	}

	public static void methodTask13(double x1, double y1, double x2, double y2, double x3, double y3) {
		double len1 = methodTask12(x1, y1, x2, y2);
		double len2 = methodTask12(x1, y1, x3, y3);
		double len3 = methodTask12(x3, y3, x2, y2);
		double perHalf = len1 + len2 + len3;
		double sqr = Math.sqrt(perHalf * (perHalf - len1) * (perHalf - len2) * (perHalf - len3));
		System.out.println("13. Square " + round(sqr, 3) + ", perimeter " + round(perHalf * 2, 3));
	}

	public static void methodTask14(double r) {
		double len = 2 * Math.PI * r;
		double sqr = Math.PI * r * r;
		System.out.println("14. Square " + round(sqr, 3) + ", length " + round(len, 3));
	}

	public static void methodTask15() {
		for (int i = 1; i <= 4; i++) {
			System.out.println("15. Degree " + round(i, 3) + ": " + round(Math.pow(Math.PI, i), 3) + "; ");
		}
	}

	public static void methodTask16(int num) {
		int res = 1;
		int tmp;
		while (num > 0) {
			tmp = num % 10;
			res = res * tmp;
			num = num / 10;
		}
		System.out.println("16. Result " + res);
	}

	public static void methodTask17(double a, double b) {
		double res1 = (a * a * a + b * b * b) / 2;
		double res2 = Math.sqrt(Math.abs(a) * Math.abs(b));
		System.out.println("17. Result 1 is " + round(res1, 3) + ", result 2 is " + round(res2, 3));
	}

	public static void methodTask18(double a) {
		double res1 = a * a;
		double res2 = res1 * 6;
		double res3 = res1 * a;
		System.out.println("18. Result 1 is " + round(res1, 3) + ", result 2 is " + round(res2, 3) + ", result 3 is "
				+ round(res3, 3));
	}

	public static void methodTask19(double a) {
		double res1 = a * a * Math.sqrt(3) / 4;
		double res2 = a * Math.sqrt(3) / 2;
		double res3 = res2 / 3;
		double res4 = res3 * 2;
		System.out.println("19. Result 1 is " + round(res1, 3) + ", result 2 is " + round(res2, 3) + ", result 3 is "
				+ round(res3, 3) + ", result 4 is " + round(res4, 3));
	}

	public static void methodTask20(double len) {
		double res1 = len * len / 4 / Math.PI;
		System.out.println("20. Result " + round(res1, 3));
	}

	public static void methodTask21(double x) {
		int y = (int) x;
		double res = (x * 1000 - y * 1000) + y / 1000.0;
		System.out.println("21. Result " + res);
	}

	public static String methodTask22(int t) {
		int min = t / 60;
		int hr = min / 60;
		int sec;
		min = min - hr * 60;
		sec = t - hr * 60 * 60 - min * 60;
		String str = hr + "hr " + min + "min " + sec + "s";
		return str;
	}

	public static void methodTask23(double R, double r) {
		if (R <= r) {
			System.out.println("23. R > r - please, correct values");
		} else {
			double res = Math.PI * (R * R - r * r);
			System.out.println("23. Result " + round(res, 3));
		}
	}

	public static void methodTask24(double a, double b, double alpha) {
		double res1 = a * b / Math.sin(alpha);
		System.out.println("24. Result " + round(res1, 3));
	}

	public static void methodTask25(double a, double b, double c) {
		double d = Math.sqrt(b * b - 4 * a * c);
		double x1 = (-1) * b + d / (2 * a), x2 = (-1) * b - d / (2 * a);
		System.out.println("25. Results " + round(x1, 3) + " " + round(x2, 3));
	}

	public static void methodTask26(double a, double b, double y) {
		double res = a * b * Math.sin(y) / 2;
		System.out.println("26. Result " + round(res, 3));
	}

	public static void methodTask27(double a) {
		double resTemp1 = a * a;
		double resTemp2 = resTemp1 * resTemp1;
		double resTemp3 = resTemp2 * resTemp2;
		double resTemp4 = resTemp3 * resTemp1;
		System.out.println("27. Results " + resTemp3 + " " + resTemp4);
	}

	public static void methodTask28(double x) {
		double gr = x * 180 / Math.PI;
		int deg = (int) gr;
		int min = (int) ((gr - deg) * 60);
		int sec = (int) ((gr - deg - min / 60.0) * 3600);
		System.out.println("28. Result " + deg + " degrees " + min + "mins " + sec + "sec");
	}

	public static void methodTask29(double a, double b, double c) {
		if (a + b > c && b + c > a && a + c > b) {
			double alpha = Math.acos((c * c + b * b - a * a) / (2 * c * b));
			double beta = Math.acos((a * a + c * c - b * b) / (2 * a * c));
			double gamma = Math.acos((a * a + b * b - c * c) / (2 * a * b));
			int alphaDeg = (int) (alpha / Math.PI * 180);
			int betaDeg = (int) (beta / Math.PI * 180);
			int gammaDeg = (int) (gamma / Math.PI * 180);
			System.out.println("29. Result " + round(alpha, 3) + " (" + alphaDeg + "), " + round(beta, 3) + " ("
					+ betaDeg + "), " + round(gamma, 3) + " (" + gammaDeg + "), ");
		} else {
			System.out.println("29. Incorrect values");
		}
	}

	public static void methodTask30(double r1, double r2, double r3) {
		double rCom = 1 / (1 / r1 + 1 / r2 + 1 / r3);
		System.out.println("30. Result " + round(rCom, 3));
	}

	public void methodTask31(double v, double v1, double t1, double t2) {
		double s = v * t1 + (v - v1) * t2;
		System.out.println("31. Result " + s);
	}

	public void methodTask32(int m, int n, int k, int p, int q, int r) {
		int totalSec = m * 3600 + n * 60 + k;
		int addSec = p * 3600 + q * 60 + r;
		int newTimeSec = (addSec + totalSec) % (24 * 3600);
		String str = methodTask22(newTimeSec);
		System.out.println("32. Result " + str);
	}

	public void methodTask33(char ch) {
		int charNo = (int) ch;
		char charPrev = (char) (charNo - 1), charNext = (char) (charNo + 1);
		System.out.println("33. Results " + charNo + " " + charPrev + " " + charNext);
	}

	public void methodTask34(int byteSize) {
		int loopCount = 0;
		double byteSizeNew = byteSize;
		while (byteSize >= 1024) {
			byteSize = byteSize / 1024;
			loopCount++;
		}
		String measure;
		switch (loopCount) {
		case 0:
			measure = "b";
			break;
		case 1:
			measure = "Kb";
			break;
		case 2:
			measure = "Mb";
			break;
		case 3:
			measure = "Gb";
			break;
		default:
			measure = "Tb";
			break;
		}
		byteSizeNew = byteSizeNew / Math.pow(1024, loopCount);
		System.out.println("34. Result " + round(byteSizeNew, 3) + measure);
	}

	public void methodTask35(int m, int n) {
		double mD = m, nD = n;
		double diff = mD / nD;
		int numA = (int) diff;
		double numB = round(diff - numA, 5);

		int minA = 10, maxB = 0;
		int tmp;

		while (numA > 1) {
			minA = Math.min(minA, numA % 10);
			numA = numA / 10;
		}
		while (numB > 0) {
			numB = numB * 10;
			tmp = (int) numB;
			maxB = Math.max(maxB, tmp);
			numB = numB - tmp;
		}
		System.out.println("35. Result " + minA + " " + maxB);
	}

	public void methodTask36(int num) {
		int tmp;
		double num1 = 1, num2 = 1;
		while (num > 0) {
			tmp = num % 10;
			if (tmp % 2 == 1) {
				num1 = num1 * tmp;
			} else {
				num2 = num2 * tmp;
			}
			num = num / 10;
		}
		double res = num1 / num2;
		System.out.println("36. Result " + res);
	}

	public void methodTask37() {
		// 1
		int n = 12;
		if (n / 100 == 0 && n % 2 == 0) {
			System.out.println("37. true ");
		} else {
			System.out.println("37. false ");
		}

	}

	public void methodTask38(double x, double y) {
		// a
		if (y >= 0 && x + y <= 4 && y - x <= 4) {
			System.out.print("38. a. true ");
		} else {
			System.out.print("38. a. false ");
		}

		// b
		if ((y >= 0 && y <= 4 && x <= 2 && x >= -2) || (y >= -3 && y <= 0 && x <= 4 && x >= -4)) {
			System.out.print("b. true ");
		} else {
			System.out.print("b. false ");
		}

		// c
		if ((x * x + y * y <= 4 && x >= 0 && y >= 0) || (x * x + y * y <= 5 && x >= 0 && y <= 0)) {
			System.out.print("b. true ");
		} else {
			System.out.print("b. false ");
		}
	}

	public void methodTask39(double x) {
		double x2 = x * x;
		double x3 = x2 * x;
		double x4 = x3 * x;
		double res = 2 * x4 - 3 * x3 + 4 * x2 - 5 * x + 6;
		System.out.println("39. Result " + round(res, 3));
	}

	public void methodTask40(double x) {
		double x2 = 3 * x * x;
		double x3 = 2 * x + 4 * x * x * x;
		double res1 = x2 - x3;
		double res2 = 1 + x2 + x3;
		System.out.println("40. Results " + round(res1, 3) + " " + round(res2, 3));
	}
}
