package sef.ATestTask.SecondActivity;

public class Calculator {
    /**
     *
     */


    private String calculatorType;
    public static final String CALC_TYPE_BASIC = "Basic";

    // Default constructor
    public Calculator() {
    }

    // Parameterized constructor
    public Calculator(String calculatorType) {
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
    public double add(double x, double y) {
        double sum = x + y;
        return sum;
    }

    // Subtract
    public double subtract(double x, double y) {
        double diff = 0;
        if (x > y) {
            diff = x - y;
        } else {
            diff = (y - x)*(-1);
        }

        return diff;
    }

    // Multiply
    public double multiply(double[] numbers) {
        double temp = 1;

        for (int i = 0; i < numbers.length; i++) {
            temp = temp * numbers[i];
        }
        return temp;

    }

    // Divide
    public double divide(double x, double y) {
        double divValue = 0;
        if (x == 0 || y == 0) {
            divValue = 0;
        } else {
            divValue = x / y;
        }
        return divValue;

    }
}

