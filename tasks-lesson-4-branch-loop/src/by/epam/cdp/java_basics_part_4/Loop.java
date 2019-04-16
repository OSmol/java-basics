package by.epam.cdp.java_basics_part_4;

public class Loop {
	public static void methodTask5() {
		int i = 2;
		int sum = 0;
		while (i < 100) {
			sum = sum + i;
			i = i + 2;
		}
		System.out.println(sum);
	}

	public static void methodTask7() {
		int a = -10;
		int b = 20;
		int h = 2;
		int func = 0;

		for (int i = a; i <= b; i = i + h) {
			if (i > 2) {
				func = i;
			} else {
				func = -i;
			}
			System.out.print(func + " ");
		}
		System.out.println();
	}

	public static void methodTask40() {
		int N = 169;
		int tmp = 0;
		int digit = 0;
		boolean flag = true;

		for (int i = 0; i <= N; i++) {
			tmp = i;
			flag = true;
			while (tmp > 0) {

				digit = tmp % 10;
				tmp = tmp / 10;

				if (digit != 0 && i % digit != 0) {
					flag = false;
				}

			}

			if (flag == true) {
				System.out.print(i + " ");
			}

		}
	}
}
