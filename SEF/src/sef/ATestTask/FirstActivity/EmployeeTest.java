package sef.ATestTask.FirstActivity;

import junit.framework.TestCase;
import org.junit.Test;

public class EmployeeTest extends TestCase {

    @Test
    public void testCheckEmployeeCreatedProperly(){
        Employee employee = new Employee();
        employee.setFirstName("Test1");
        assertEquals("I am an error message", "Test1", employee.getFirstName());
    }

}