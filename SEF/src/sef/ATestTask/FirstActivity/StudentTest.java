package sef.ATestTask.FirstActivity;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StudentTest {


    @Test
    public void testCheckStudent(){
        Student student = new Student();
        student.setFirstName("First");
        student.setSecondName("Second");
        student.setSchoolName("School");
        assertEquals("I am an error message", "First", student.getFirstName());
        assertEquals("I am an error message", "Second", student.getSecondName());
        assertEquals("I am an error message", "School", student.getSchoolName());
    }

}
