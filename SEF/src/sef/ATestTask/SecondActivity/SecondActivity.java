package sef.ATestTask.SecondActivity;
// Complete Code
public class SecondActivity {

	public static void main(String[] args) {

		//TODO Use the calculator to calculate different values
		//Example ->
		//calculator.sum(10.2, 5);
		//calculator.divide(100, 33);
		// and more

			SecondActivity calculator = new SecondActivity(SecondActivity.CALC_TYPE_BASIC);
			System.out.println("*** Calculations will be performed using "+calculator.getCalculatorType()+ " calculator ***");

			// Add
			double result = calculator.add((int) 10.2d, 5);
			System.out.println("1) Add result is " + result);

			//Divide
		   int z = calculator.divide(100, 33);
		   System.out.println("Division result is " + z);

			// Multiply
			int[] mul = {2, 3, 4};
			int a = calculator.multiply(mul);
			System.out.println("2) Multiplication result is " + a);
		}

	//TODO create the Calculator (here or in additional class)

	private String calculatorType;
	public static final String CALC_TYPE_BASIC = "Basic";

	// Default constructor
	public SecondActivity() {}

	// Parameterized constructor
	public SecondActivity(String calculatorType) {
		this.calculatorType = calculatorType;
	}

	// Getter for CalculatorType
	public String getCalculatorType() {
		return calculatorType;
	}

	// Setter for CalculatorType
	public void setCalculatorType(String calculatorType) {
		this.calculatorType = calculatorType;
	}

	// Add
	public int add(int x, int y) {
		int sum = x + y;
		return sum;
	}

	// Subtract
	public int subtract(int x, int y) {
		int diff = 0;
		if (x > y) {
			diff = x - y;
		} else {
			diff = y - x;
		}

		return diff;
	}

	// Multiply
	public int multiply(int[] numbers) {
		int temp = 1;

		for (int i = 0; i < numbers.length; i++) {
			temp = temp * numbers[i];
		}
		return temp;

	}

	// Divide
	public int divide(int x, int y) {
		int divValue = 0;
		if (x == 0 || y == 0) {
			divValue = 0;
		} else {
			divValue = x / y;
		}
		return divValue;
	}
}
