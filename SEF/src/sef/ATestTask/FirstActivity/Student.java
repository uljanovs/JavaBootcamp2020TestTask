package sef.ATestTask.FirstActivity;

//TODO Implement class Student with parent Person
public class Student extends Person {
    String schoolName;

    public Student() {
        System.out.println("I'm a Student Constructor");
    }

    public Student(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setEmpId(String schoolName) {
        this.schoolName = schoolName;
    }

    public void introduce() {
        System.out.println("Inside Person Class");

    }
}