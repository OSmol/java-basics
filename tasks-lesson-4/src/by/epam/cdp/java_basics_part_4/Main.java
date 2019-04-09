package by.epam.cdp.java_basics_part_4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		System.out.println("Task 1");
		methodTask1();
		System.out.println("Task 2");
		methodTask2();
		System.out.println("Task 3");
		methodTask3(2019, 1, 2019, 4);
	}

	public static void methodTask1() {
		double maxNum = Double.MIN_VALUE;
		double minNum = Double.MAX_VALUE;
		double genNum;
		for (int i = 0; i < 100; i++) {
			genNum = Math.random() * 200 - 100;
			minNum = Math.min(minNum, genNum);
			maxNum = Math.max(maxNum, genNum);
		}

		System.out.println("Result: minimum = " + minNum + ", maximum = " + maxNum);
	}

	public static void methodTask2() throws FileNotFoundException {

		File file = new File("src/data.txt");

		Scanner fileScanner = new Scanner(file);
		Scanner lineScanner;
		int rowSum = 0;

		System.out.println("--------");
		while (fileScanner.hasNextLine()) {
			String line = fileScanner.nextLine();
			lineScanner = new Scanner(line);

			while (lineScanner.hasNextInt()) {
				int item = lineScanner.nextInt();
				rowSum = rowSum + item;
			}

			System.out.println("| " + rowSum + " |\n--------");
			rowSum = 0;
			lineScanner.close();
		}

		fileScanner.close();
	}

	public static void methodTask3(int X, int x, int Y, int y) {
		if (X < 0 || Y < 0 || X > 9999 || Y > 9999 || x < 1 || x > 12 || y < 1 || y > 12) {
			System.out.println("Input parameters are invalid. Please, correct...");
			return;
		}

		int minYear;
		int maxYear;
		int minYearMon;
		int maxYearMon;

		if (Y > X) {
			minYear = X;
			maxYear = Y;
			minYearMon = x;
			maxYearMon = y;

		} else if (X < Y) {
			minYear = Y;
			maxYear = X;
			minYearMon = y;
			maxYearMon = x;
		} else {
			minYear = X;
			maxYear = X;
			minYearMon = Math.min(x, y);
			maxYearMon = Math.max(x, y);
		}

		int numMonth = (12 - minYearMon + 1) // MIN year till the end including months of MIN year
				+ (maxYear - minYear - 1) * 12 // full years between years w/o year MIN
				+ (maxYearMon - 1); // months of year MAX excluding month of MAX year

		int iMonth = minYearMon % 12; // transform 12 to 0
		int iYear = minYear;
		int currMonDur = 0;
		int totalMonDur = 0;
		for (int i = 0; i < numMonth; i++) {
			switch (iMonth) {
			case 0:
				currMonDur = 31;
				break;
			case 1:
				currMonDur = 31;
				break;
			case 2:
				if (iYear % 400 == 0 || (iYear % 4 == 0 && iYear % 100 != 0)) {
					currMonDur = 29;
				} else {
					currMonDur = 28;
				}
				break;
			case 3:
				currMonDur = 31;
				break;
			case 4:
				currMonDur = 30;
				break;
			case 5:
				currMonDur = 31;
				break;
			case 6:
				currMonDur = 30;
				break;
			case 7:
				currMonDur = 31;
				break;
			case 8:
				currMonDur = 31;
				break;
			case 9:
				currMonDur = 30;
				break;
			case 10:
				currMonDur = 31;
				break;
			case 11:
				currMonDur = 30;
				break;
			}
			totalMonDur = totalMonDur + currMonDur;

			iMonth = (iMonth + 1) % 12;
			if (iMonth == 1) {
				iYear = iYear + 1;
			}

		}
		System.out.println("Duration in dates " + totalMonDur);
	}
}