package sef.ATestTask.FirstActivity;


//TODO Implement class Student with parent Person

public class Student extends Person {
    private String schoolName;

    //Default constructor
    public Student() {

        this.schoolName = "RTU";
    }

    //Parametrized constructor
    public Student (String firstName, String secondName, int age, String schoolName){
        super(firstName, secondName, age);
        this.schoolName = schoolName;
    }

    //getter for schoolName
    public String getSchoolName (){
        return schoolName;
    }

    //setter for schoolName
    public void setSchoolName(String schoolName){
        this.schoolName = schoolName;
    }

    //Method introduce
    public void announce(){
        System.out.println("I am study in university " + getSchoolName());
    }

}
