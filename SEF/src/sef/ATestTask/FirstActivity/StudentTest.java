package sef.ATestTask.FirstActivity;

import junit.framework.TestCase;
import org.junit.Test;

public class StudentTest extends TestCase {
    protected void setUp() throws Exception {
        super.setUp();
    }

    protected void tearDown() throws Exception {
        super.tearDown();
    }

    public void testCheckStudentCreatedProperly()  {
        Student student = new Student();
        student.setSchoolName("Test");
        assertEquals("I am an error message", "Test", student.getSchoolName());
    }
}
