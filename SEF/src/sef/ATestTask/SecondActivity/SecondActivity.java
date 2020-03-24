package sef.ATestTask.SecondActivity;


// Complete Code
public class SecondActivity {

	public static void main(String[] args) {
		SecondActivity calculator = new SecondActivity();


		//TODO Use the calculator to calculate different values
		//Example ->
		Double sum = calculator.sum(10.2, 5);
		Double divide= calculator.divide(100, 33);
		// and more


		//TODO create the Calculator (here or in additional class)


	}

	public double divide(int i, int i1) {
		if(i1==0){
			return 0;
		}
		return 1/i1;
	}

	public double sum(double v, int i) {
		return v+i;
	}
}

