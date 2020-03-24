package sef.ATestTask.ThirdActivity;

public class CustomException extends Exception {
    public String getMessage() {
        return "No such a name found";
    }
}
