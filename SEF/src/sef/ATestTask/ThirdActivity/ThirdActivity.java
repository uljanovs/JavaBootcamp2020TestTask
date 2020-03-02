package sef.ATestTask.ThirdActivity;
//Needs to be completed
//This program accepts a user name and checks user's validity
//The user name is checked against an array of names.

public class ThirdActivity {
    public void catchException() {
    }
    public static void main(String[] args) {

        ThirdActivity obj = new ThirdActivity();
        //TODO handle exception on proper way
        try {
            obj.validateUser("Ivan");

        } catch (Exception c) {
            System.out.println(c.getMessage());
        }
        try {
            obj.catchException();
        } catch (Exception v) {
            System.out.println(v.getMessage());
        }

        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        try {
            for (int i = 0; i <= 10; i++) {
                System.out.println(arr[i]);
            }
        } catch (ArrayIndexOutOfBoundsException v) {
            System.out.println("Fatal Error, don't cry: " + v.toString());
        } finally {
            System.out.println("This should get printed even if there is an exception");
        }
    }


    //username:

    private void validateUser(String name) throws Exception {
        ThirdActivity obj = new ThirdActivity();
        try {
            obj.validateUser("John");
        } catch (Exception c) {
            System.out.println(c.getMessage());
        }
        String[] validUsers = {"John", "Mike", "Missi", "Peacy"};
        boolean flag = false;

        //TODO if name in a list -> set flag=true
        // if at the end flag=0 -> throw the exception
        for (int i = 0; i < 4; i++) {

            if (validUsers[i].equals(name)) {
                flag = true;
                break;
            }
        }

        if (!flag) {
            throw new Exception("Not valid username");

        } else if (flag) {
            System.out.println("Welcome");
        }
    }
    // end of username part

    ThirdActivity obj = new ThirdActivity();

    public void catchMe(int num1, int num2) {
                //TODO Catch exception
                try {
                    int result = num1 / num2;
                    System.out.println("The result is :" + result);
                } catch (ArithmeticException e) {
                    System.out.println("Division by zero is not allowed");
                    //TODO prints a message "Thank you for using this program." always
                } finally {
                    System.out.println("Thank you for using this program.");
                }
            }
        }




