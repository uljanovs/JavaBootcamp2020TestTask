package sef.ATestTask.FirstActivity;

import junit.framework.TestCase;

    public class StudentTest extends TestCase {

        public void checkStudentCreatedProperly() {
            Student student = new Student();
            student.setFirstName("Test1");
            assertEquals("I am an error message", "Test1", student.getFirstName());
        }
    }