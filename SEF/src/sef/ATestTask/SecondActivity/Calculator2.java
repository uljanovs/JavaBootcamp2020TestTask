package sef.ATestTask.SecondActivity;

import java.util.Scanner;

public class Calculator2 {

        public static void main (String[] arg){
            double num1;
            double num2;
            String operation;

            Scanner input = new Scanner(System.in);

            System.out.println("please enter the first number");
            num1 = input.nextDouble();

            System.out.println("please enter the second number");
            num2 = input.nextDouble();

            Scanner op = new Scanner(System.in);

            System.out.println("Please enter operation");
            operation = op.next();

            if (operation == "+")
            {
                System.out.println("your answer is" + (num1 + num2));
            }
            else if  (operation == "-")
            {
                System.out.println("your answer is" + (num1 - num2));
            }

            else if (operation == "/")
            {
                System.out.println("your answer is" + (num1 / num2));
            }
            else if (operation == "*")
            {
                System.out.println("your answer is" + (num1 * num2));
            }

            else {
                System.out.println("Please, enter valid operator.");
            }


        }

    }

