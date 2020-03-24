package sef.ATestTask.FirstActivity;

import junit.framework.TestCase;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class EmployeeTest extends TestCase {

    protected void setUp() throws Exception {
        super.setUp();
    }

    protected void tearDown() throws Exception {
        super.tearDown();
    }

    @Test
    public void testCheckEmployeeFirstNameCreatedProperly() throws NewException {
        Employee employee = new Employee();
        employee.setFirstName("Test");
        assertEquals("I am an error message", "Test", employee.getFirstName());
    }

    @Test
    public void testCheckEmployeeSecondNameCreatedProperly() throws NewException {
        Employee employee = new Employee();
        employee.setSecondName("Test");
        assertEquals("I am an error message", "Test", employee.getSecondName());
    }

    @Test
    public void testCheckEmployeeAgeCreatedProperly()  {
        Employee employee = new Employee();
        employee.setAge(123);
        assertEquals("I am an error message", 23, employee.getAge());
    }

    @Test
    public void testCheckEmpIDCreatedProperly()  {
        Employee employee = new Employee();
        employee.setEmpId(123);
        assertEquals("I am an error message", 123, employee.getEmpId());
    }

    @Test
    public void testCheckJobTitleCreatedProperly() {
        Employee employee = new Employee();
        employee.setJobTitle("Test");
        assertEquals("I am an error message", "Test", employee.getJobTitle());
    }

    @Test
    public void testCheckEmployeeCompanyNameCreatedProperly() {
        Employee employee = new Employee();
        employee.setCompanyName("Test");
        assertEquals("I am an error message", "Test", employee.getCompanyName());
    }

    @Test
    public void testCheckEmployeeSalaryCreatedProperly()  {
        Employee employee = new Employee();
        employee.setSalary(123);
        assertEquals("I am an error message", 123, employee.getSalary());
    }
    public void testEmployeeChangeIfo() throws NewException {
        List<Employee> employees = new ArrayList<>(Arrays.asList(
                new Employee("John", "Doe", 34, 1234, "developer", "Company", 2100),
                new Employee("Jane", "Doe", 27, 47289, "Assistant", "Company", 900),
                new Employee("Lizzy", "Brooks", 40, 9876, "manager", "Company", 1300),
                new Employee("Mike", "Johnson", 33, 6374, "QA engineer", "Company", 1500),
                new Employee("James", "Boone", 32, 5467, "HR", "Company", 1100),
                new Employee("Kate", "Hobbs", 28, 8566, "devOPS", "Company", 1600)
        ));
        System.out.println("Created array (" + employees.size() + ") of employees.");
        Employee randomEmployee = employees.get(ThreadLocalRandom.current().nextInt(0,employees.size()-1));
        randomEmployee.ChangeInfo("A", "B", 24, 0,"Unemployed","",0);
        assertEquals("Error message","A",randomEmployee.getFirstName());

    }

}