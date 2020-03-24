package sef.ATestTask.SecondActivity;

import junit.framework.TestCase;

// Complete Code
public class SecondActivity {

	public static void main(String[] args) {
		SecondActivity calculator = new SecondActivity();

		//TODO Use the calculator to calculate different values
		//Example ->
		//calculator.sum(10.2, 5);
		//calculator.divide(100, 33);
		// and more

		int x = 10;
		int y = 5;
		int[] nums = {1, 2, 3, 4};

		System.out.println("Addition - " + add(x, y));
		System.out.println("Subtraction - " + subtract(x, y));
		System.out.println("Multiply - " + multiply(nums));
		System.out.println("Divide - " + divide(x, y));
	}

	private static int add(int x, int y) {
		int sum = x + y;
		return sum;
	}

	private static int subtract(int x, int y) {
		int diff = 0;
		if (x > y) {
			diff = x - y;
		} else {
			diff = y - x;
		}
		return diff;
	}

	private static int multiply(int[] numbers) {
		int temp = 1;

		for (int i = 0; i < numbers.length; i++) {
			temp = temp * numbers[i];
		}
		return temp;
	}

	private static int divide(int x, int y) {
		int divValue = 0;
		if (x == 0 || y == 0) {
			System.out.println("Oops! one of my numbers is 0, i can't do the division");
			divValue = 0;
		} else {
			divValue = x / y;
		}
		return divValue;
	}
}
		//TODO create the Calculator (here or in additional class)

class MyCalculator {

	public static void main(String[] args) {

		int x = 10;
		int y = 5;

		int[] nums = {1, 2, 3, 4};

		System.out.println("Addition - " + add(x,y));
		System.out.println("Subtraction - " + subtract(x,y));
		System.out.println("Multiply - " + multiply(nums));
		System.out.println("Divide - " + divide(x,y));

	}


	private static int add(int x, int y) {
		int sum = x + y;
		return sum;
	}

	private static int subtract(int x, int y) {
		int diff = 0;
		if (x > y) {
			// complete the code
		} else {
			// complete the code
		}

		return diff;
	}

	private static int multiply(int[] numbers) {
		int temp = 1;

		for (int i = 0; i < numbers.length; i++) {
			temp = temp * numbers[i];
		}
		return temp;

	}

	private static int divide(int x, int y) {
		int divValue = 0;
		if (x == 0 || y == 0) {
			// complete the code
		} else {
			// complete the code
		}
		return divValue;

	}

}