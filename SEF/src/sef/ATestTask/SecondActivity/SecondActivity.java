package sef.ATestTask.SecondActivity;
// Complete Code
public class SecondActivity {

	public static void main(String[] args) {
		SecondActivity calculator = new SecondActivity();

		double result = calculator.sum(10.2, 5);
		System.out.println(result);
		result = calculator.substraction(756.2, 65.3);
		System.out.println(result);
		double divide = calculator.divide(100, 33);
		System.out.println(divide);
		double multiply = calculator.multiply(2, 3);
		System.out.println(multiply);
	}

	public double sum(double v, double i) {
		return v + i;
	}
	public double divide(double v, double i){
		return v / i;
	}
	public double multiply(double v, double i){
		return v * i;
	}
	public double substraction(double v, double i){
		return v - i;
	}
	//TODO create the Calculator (here or in additional class)

}
