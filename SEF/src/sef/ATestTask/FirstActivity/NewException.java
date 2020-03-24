package sef.ATestTask.FirstActivity;

public class NewException  extends Exception {
    public String getMessage()
    {
        return "Invalid name (contains numbers)";
    }
}
