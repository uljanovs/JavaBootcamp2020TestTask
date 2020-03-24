package sef.ATestTask.FirstActivity;


//TODO Implement class Student with parent Person

import javax.xml.ws.handler.Handler;

public class Student extends Person implements Humanity {

    private String nationality;
    private String schoolName;

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String announce() {
        String personAnnounce = super.announce();
        return personAnnounce + "I study at" + schoolName;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    @Override
    public String getNationality() {
        return this.nationality;
    }
}