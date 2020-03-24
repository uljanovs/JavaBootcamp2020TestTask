package sef.ATestTask.SecondActivity;
// Complete Code
public class SecondActivity {

	public static void main(String[] args) {
		SecondActivity calculator = new SecondActivity();


		//TODO Use the calculator to calculate different values

		calculator.sum(10.2, 5);
		calculator.div(100, 33);
		calculator.sub(12.3, 11.2);
		calculator.div(32.1, 0);
		calculator.mult(24.5, 3.2);

	}

	//TODO create the Calculator (here or in additional class)
	public void sum(double x, double y) {
		double result = x + y;
		System.out.println(result);
	}

	public void sub(double x, double y) {
		double result = x - y;
		System.out.println(result);
	}

	public void mult(double x, double y) {
		double result = x * y;
		System.out.println(result);
	}

	public void div(double x, double y) {
		if (y == 0) {
			System.out.println("Nope, you can't divide by zero");
		} else {
			double result = x / y;
			System.out.println(result);
		}
	}

	public double getSum(double x, double y) {
		return x + y;
	}

	public double getSub(double x, double y) {
		return x - y;
	}

	public double getMult(double x, double y) {
		return x * y;
	}

	public double getDiv(double x, double y) {
			return x / y;
	}
}


