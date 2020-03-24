package SEF.src.sef.ATestTask.SecondActivity;


// Complete Code
public class SecondActivity {

	public static void main(String[] args) {
		SecondActivity calculator = new SecondActivity();


		//TODO Use the calculator to calculate different values

		int x = 13;
		int y = 7;
		int[] nums = {1, 5, 8, 4};

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

	public int getSum(int a, int b) {

		return a + b;
	}

	public int getDifference(int a, int b){
		return a - b;
	}

	public double getProduct(double a, double b){
		return a * b;
	}

	public double getQuotient(double a, double b){
		return a / b;
	}
}
