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

    public String announce() {
        return "I am " + getFirstName() + " " + getSecondName() + " and I am" + getAge() + "years old. I study in university" + getSchoolName() + ".";

    }
    public void introduce() {
        System.out.println("I am " + getFirstName() + " " + getSecondName() + " and I am " + getAge() + " years old. I study in university " + getSchoolName() + ".");
    }
}
