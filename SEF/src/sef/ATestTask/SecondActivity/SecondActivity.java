package sef.ATestTask.SecondActivity;
import java.lang.Math;

// Complete Code
public class SecondActivity {

	public double sum(double a, double b) {
		return a + b;
	}

	public double divide(double a, double b) {
		double result;
		try{
			result = a/b;
		} catch(ArithmeticException e) {
			throw new ArithmeticException("/ by zero");
		}
		return a/b;
	}

	public double subtract(double a, double b) {
		return a - b;
	}

	public double multiply(double a, double b) {
		return a * b;
	}

	public double square(double a) {
		return a * a;
	}

	public double root(double a) {
		return Math.sqrt(a);
	}

	public static void main(String[] args) {
		SecondActivity calculator = new SecondActivity();

		System.out.println(calculator.sum(10.2, 5));
		System.out.println(calculator.divide(100, 0));
		System.out.println(calculator.subtract(20, 8));
		System.out.println(calculator.multiply(20, 8));
		System.out.println(calculator.square(20));
		System.out.println(calculator.root(20));

		//TODO Use the calculator to calculate different values
		//Example ->
		//calculator.sum(10.2, 5);
		//calculator.divide(100, 33);
		// and more

	}

	//TODO create the Calculator (here or in additional class)

}
