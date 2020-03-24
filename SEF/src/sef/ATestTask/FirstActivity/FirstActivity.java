package sef.ATestTask.FirstActivity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FirstActivity {
    public static void main(String[] args) throws NewException {

        //TODO 1 Create collection of employee (more than 5) list or map
        //		System.out.println() result
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee("John", "Doe", 34, 1234, "developer", "Company", 2100));
        employees.add(new Employee("Jane", "Doe", 27, 47289, "Assistant", "Company", 900));
        employees.add(new Employee("Lizzy", "Brooks", 40, 9876, "manager", "Company", 1300));
        employees.add(new Employee("Mike", "Johnson", 33, 6374, "QA engineer", "Company", 1500));
        employees.add(new Employee("James", "Boone", 32, 5467, "HR", "Company", 1100));
        employees.add(new Employee("Kate", "Hobbs", 28, 8566, "devOPS", "Company", 1600));

		for (Employee employee : employees) {
			System.out.println("First Name" + employee.getFirstName() + "Second Name" + employee.getSecondName() + "Age"
					+ employee.getAge() + "ID" + employee.getEmpId() + "Job title" + employee.getJobTitle() + "Company"
					+ employee.getCompanyName() + "Salary" + employee.getSalary());
		}
        //TODO 2 sort and this employees by salary (from min to max)
        // TIP - google bubble sort
        //		System.out.println() result

        Collections.sort(employees);

        for (Employee employee : employees) {
            System.out.println("First Name" + employee.getFirstName() + "Second Name" + employee.getSecondName() + "Age"
					+ employee.getAge() + "ID" + employee.getEmpId() + "Job title" + employee.getJobTitle() + "Company"
					+ employee.getCompanyName() + "Salary" + employee.getSalary());
        }

        //TODO 3 create instance of a Student as a Person ->
        // than ask him introduce()
        // than make them Student
        // than ask him introduce()
        Person student = new Person("Sam", "Dean", 24);
        student.announce();
        student = new Student("Sam", "Dean", 24, "RTU");
        student.announce();



        //TODO 4 Create method for full change of employee information
        // for example some employee change his work

        Employee employee = new Employee();
        employee.ChangeInfo("John", "Doe", 34, 1234, "SEO", "Company", 2100);

    }
}


