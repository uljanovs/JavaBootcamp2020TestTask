package sef.ATestTask.FirstActivity;

import junit.framework.TestCase;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class StudentTest extends TestCase {


    public void testEmptyConstructor() {
        Student student = new Student();
        student.setSchoolName("of Chester");

        assertEquals("I study in University", "of Chester", student.getSchool());
        assertThat(student.getSchool(), is ("of Chester"));
        }
}