package sef.ATestTask.FirstActivity;

import junit.framework.TestCase;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EmployeeTest extends Test {

    public void checkEmployeeCreatedProperly(){
        Employee employee = new Employee();
        employee.setFirstName("Test1");
        assertEquals("I am an error message", "Test1", employee.getFirstName());
    }

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getFirstName() {
    }

    @Test
    void setFirstName() {
    }

    @Test
    void getAge() {
    }

    @Test
    void setAge() {
    }

    @Test
    void getSecondName() {
    }

    @Test
    void setSecondName() {
    }

    @Test
    void announce() {
    }

    @Test
    void getEmpId() {
    }

    @Test
    void setEmpId() {
    }

    @Test
    void getJobTitle() {
    }

    @Test
    void setJobTitle() {
    }

    @Test
    void getCompanyName() {
    }

    @Test
    void setCompanyName() {
    }

    @Test
    void getSalary() {
    }

    @Test
    void setSalary() {
    }

    @Test
    void testAnnounce() {
    }

    @Test
    void compareTo() {
    }
}