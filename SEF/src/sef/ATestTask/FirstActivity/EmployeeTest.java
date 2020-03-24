package SEF.src.sef.ATestTask.FirstActivity;

import junit.framework.TestCase;

public class EmployeeTest extends TestCase {



    public void testcheckEmployeeCreatedProperly(){
        Employee employee = new Employee(1, "S", "D", 30.0);
        employee.setEmpId(5);
        assertEquals("I am an error message", 5, employee.getEmpId());
    }

}

