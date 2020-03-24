package sef.ATestTask.FirstActivity;


//TODO Implement class Student with parent Person

public class Student extends Person {
    private String schoolName;

    public Student() {
        this.schoolName = "Unknown";
    }

    public Student(String schoolName) {
        this.schoolName = schoolName;

    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String announce(String st) {return "I am study in university  " + getSchoolName();
    }

}

