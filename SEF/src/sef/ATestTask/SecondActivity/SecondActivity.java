package sef.ATestTask.SecondActivity;

// Complete Code
public class SecondActivity {

	public void main(String[] args) {
		theCalc calculator = new theCalc(theCalc.CALC_TYPE_BASIC);
		//TODO Use the calculator to calculate different values
		//Example ->
		//calculator.sum(10.2, 5);
		//calculator.divide(100, 33);
		// and more
		double result = calculator.add(10.2, 5);
		System.out.println("1) Add result is " + result);
		result = calculator.subtract(100, 33);
		System.out.println("2) Subtract result is " + result);
		// Multiply
		result = calculator.multiply(5.6, 3);
		System.out.println("3) Multiplication result is " + result);
		result = calculator.divide(3, 4);
		System.out.println("4) Divide result is " + result);

	}

	//TODO create the Calculator (here or in additional class)
	// Add


	}
