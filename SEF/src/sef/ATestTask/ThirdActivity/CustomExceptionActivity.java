package sef.ATestTask.ThirdActivity;

public class CustomExceptionActivity extends Exception{
    @Override
    public String getMessage() {return "You are not allowed to use this program";

    }
}
