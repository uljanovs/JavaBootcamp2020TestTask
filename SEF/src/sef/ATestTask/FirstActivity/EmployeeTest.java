package sef.ATestTask.FirstActivity;


import junit.framework.TestCase;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class EmployeeTest {

    @Test
    public void checkEmployeeCreatedProperly() {
        Employee employee = new Employee();
        employee.setFirstName("Dima");
        employee.setAge(37);
        employee.setCompanyName("Opel");
        employee.setJobTitle("Sales Manager");

        assertEquals("I am an error message", "Dima", employee.getFirstName());
        assertThat(employee.getAge(), is(37));
        assertThat(employee.getFirstName(), is("Dima"));
        assertThat(employee.getCompanyName(), is("Opel"));
        assertThat(employee.getJobTittle(), is("Sales Manager"));

    }
}
