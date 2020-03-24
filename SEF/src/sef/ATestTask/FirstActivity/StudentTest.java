package SEF.src.sef.ATestTask.FirstActivity;

import junit.framework.TestCase;

public class StudentTest extends TestCase {

    public void testcheckStudentCreatedProperly(){
        Student student = new Student();
        student.setSchoolName("LU");
        assertEquals("I am an error message", "LU", student.getSchoolName());
    }
}
