package sef.ATestTask.ThirdActivity;
//Needs to be completed
//This program accepts a user name and checks user's validity
//The user name is checked against an array of names.

import java.util.List;
import java.util.Arrays;

public class  ThirdActivity {


    public static void main(String[] args) {
        ThirdActivity ta = new ThirdActivity();
        //TODO handle exception on proper way
          try {
              ta.validateUser("Ivan");
          } catch (Exception e) {
              System.out.println(e);
          };
          ta.catchExeption();
          ta.catchMe(10, 0);

        }

        void catchExeption () {
            int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
            try {
                for (int i = 0; i <= 10; i++) {
                    System.out.println(arr[i]);
                }
            } catch (Exception e) {}
            System.out.println("This should get printed even if there is an exception");


        }
        void validateUser (String name) throws Exception {
            String[] validUsers = {"John", "Mike", "Missi", "Peacy"};
            boolean flag = false;
            List<String> validUsersList = Arrays.asList(validUsers);
            if (validUsersList.contains(name)) {
                flag = true;
            }
            else {
                throw new Exception("Invalid user!");
            }
            //TODO if name in a list -> set flag=true
            // if at the end flag=0 -> throw the exeption
        }

        void catchMe ( int num1, int num2) {
            //TODO Catch exeption
            try {
                int result = num1 / num2;
                System.out.println("The result is: " + result);

        } catch (ArithmeticException e) {
        System.out.println("Division by zero is not allowed");
    }

            //TODO prints a message "Thank you for using this program." always
            finally {
            System.out.println("Thank you for using this program.");

        }
    }
}

