package sef.ATestTask.FirstActivity;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import sef.ATestTask.SecondActivity.SecondActivity;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class EmployeeTest extends TestCase {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void checkEmployeeCreatedProperly() {
        Employee employee = new Employee();
        employee.setFirstName("Test1");
        assertEquals("I am an error message", "Test1", employee.getFirstName());
    }
    @Test
    public void testSetAndGetempId() {
        int testempId = 6;
        assertNull(Employee.getempId());
        Employee.setEmpId(testempId);
        assertEquals(testempId, Employee.getempId());
    }
    @Test
    public void testSetAndGetJobTitle() {
        String testJobTitle = "iOSDeveloper";
        assertNull(Employee.getJobTitle());
        Employee.setJobTitle(testJobTitle);
        assertEquals(testJobTitle, Employee.getJobTitle());
    }

    @Test
    public void testSetAndGetCompanyName() {
        String testCompanyName = "Tech/Love";
        assertNull(Employee.getCompanyName());
        Employee.setCompanyName(testCompanyName);
        assertEquals(testCompanyName, Employee.getCompanyName());
    }

    @Test
    public void testSetAndGetSalary() {
        double testSalary = 1460;
        assertNull(Employee.getSalary());
        Employee.setSalary(testSalary);
        assertEquals(testSalary, Employee.getSalary());
    }

}