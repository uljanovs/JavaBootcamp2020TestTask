package sef.ATestTask.FirstActivity;


//TODO Implement class Student with parent Person

public class Student extends Person {
    private String schoolName;

    public Student() {
        this.schoolName = "Unknown";
    }

    public Student(String school) {
        this.schoolName = school;
    }

    // getter for String school
    public String getSchool() {
        return schoolName;
    }

    // setter for String name
    public void setSchoolName(String school) {
        this.schoolName = school;
    }

    public void announce(String s) {
        System.out.println("I am study in university" + schoolName);
    }
}