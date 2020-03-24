package SEF.src.sef.ATestTask.ThirdActivity;
//Needs to be completed
//This program accepts a user name and checks user's validity
//The user name is checked against an array of names.

public class ThirdActivity {

    public static void main(String[] args) {
        ThirdActivity ta = new ThirdActivity();
        //TODO handle exception on proper way
        try{
            ta.validateUser("Ivan");
        }
        catch (CustomExceptionActivity c) {
            System.out.println(c.getMessage());
        }
    }

    void catchExeption() {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        try{
            for (int i = 0; i <= 10; i++) {
                System.out.println(arr[i]);
            }
        } catch (ArrayIndexOutOfBoundsException exception){
            System.out.println("Error! Array Index out of Bounds!" + exception.toString());
        }finally {
            System.out.println("This should get printed even if there is an exception");
        }
    }

    void validateUser(String firstName) throws CustomExceptionActivity {
        String[] validUsers = {"John", "Mike", "Missi", "Peacy"};
        boolean flag = false;
        for (int i = 0; i < 4; i++) {
            if (validUsers[i].equals(firstName)) {
                flag = true;
                break;
            }

        }
        if (flag = Boolean.parseBoolean(null)) {
            return;
        }
        throw new CustomExceptionActivity();


        //TODO if name in a list -> set flag=true
        // if at the end flag=0 -> throw the exception

    }

    void catchMe(int num1, int num2)
    {
        //TODO Catch exeption
            try{
                int result=num1/num2;
            System.out.println("The result is :" + result);
            }catch (ArithmeticException e){
                System.out.println("Division by zero is not allowed");
            }

            //TODO prints a message "Thank you for using this program." always
            finally {
                System.out.println("Thank you for using this program.");
            }

    }
}

