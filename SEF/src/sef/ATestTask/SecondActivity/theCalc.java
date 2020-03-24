package sef.ATestTask.SecondActivity;

public class theCalc {
    /**
     *
     */


    private String calculatorType;
    public static final String CALC_TYPE_BASIC = "Basic";

    // Default constructor
    public theCalc() {
    }

    // Parameterized constructor
    public theCalc(String calculatorType) {
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
    public static double add(double x, double y) {
        double sum = x + y;
        return sum;
    }

    // Subtract
    public static double subtract(double x, double y) {
        double diff = 0;
        if (x > y) {
            diff = x - y;
        } else {
            diff = (y - x)*(-1);
        }

        return diff;
    }

    // Multiply
    public static double multiply(double x, double y) {
        double mult = x * y;
        return mult;

    }

    // Divide
    public static double divide(double x, double y) {
        double divValue = 0;
        if (x == 0 || y == 0) {
            divValue = 0;
        } else {
            divValue = x / y;
        }
        return divValue;

    }
}


