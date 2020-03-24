package sef.ATestTask.FirstActivity;


//TODO Implement class Student with parent Person

public class Student extends Person {
    public String schoolname;


    public String getSchoolname() {
        return schoolname;
    }

    public void setSchoolname(String schoolname) {
        this.schoolname = schoolname;
    }


    public void student_introduce() {
        System.out.println("I am study in university " + getSchoolname());

    }


}





