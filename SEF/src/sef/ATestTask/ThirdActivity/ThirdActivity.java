package sef.ATestTask.ThirdActivity;
//Needs to be completed
//This program accepts a user name and checks user's validity
//The user name is checked against an array of names.

public class ThirdActivity {

    public static void main(String[] args) throws CustomException {
        ThirdActivity ta = new ThirdActivity();
        //TODO handle exception on proper way
        ta.validateUser("Ivan");
        ta.catchExeption();
    }

    void catchExeption() {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        try {
            for (int i = 0; i <= 10; i++) {
                System.out.println(arr[i]);
            }
        } catch (IndexOutOfBoundsException exception) {
            System.out.println("Ooops, the value is incorrect");
        } finally {
            System.out.println("This should get printed even if there is an exception");
        }

    }

    void validateUser(String name) throws CustomException {
        String[] validUsers = {"John", "Mike", "Missi", "Peacy"};
        boolean flag = false;
        //TODO if name in a list -> set flag=true
        // if at the end flag=0 -> throw the exception
        //flag stores true if a match is found else it should remain false

        for (int i = 0; i < 4; i++) {
            if (validUsers[i].equals(name)) {
                flag = true;
                break;
            }
        }
        if (flag == false) {
            throw new CustomException();
        } else if (flag == true) {
            System.out.println("Welcome to the program!");
        }

    }

    void catchMe(int num1, int num2) {
        //TODO Catch exception
        try {
            int result = num1 / num2;
            System.out.println("The result is :" + result);
        } catch (ArithmeticException exc) {
            System.out.println("Division by zero is forbidden!");
        }
        //TODO prints a message "Thank you for using this program." always
        finally {
            System.out.println("Thank you for using this program.");
        }

    }
}

