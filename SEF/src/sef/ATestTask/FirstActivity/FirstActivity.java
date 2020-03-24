package sef.ATestTask.FirstActivity;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class FirstActivity {

	public static void main(String[] args) {

//TODO 1 Create collection of employee (more than 5) list or map
        //		System.out.println() result

        List<Employee> employees = new ArrayList<Employee>();
        employees.add(new Employee("Joe", 27, "Assistant", 1000));
        employees.add(new Employee("Chandler", 28, "Bookkeeper", 3000));
        employees.add(new Employee("Ross", 28, "Manager", 4000));
        employees.add(new Employee("Monica", 27, "HR", 2500));
        employees.add(new Employee("Rachel", 27, "PR", 3500));
        employees.add(new Employee("Phoebe", 29, "Intern", 500));

        System.out.println(employees);

        Collections.sort(employees);

        //TODO 2 sort and this employees by salary (from min to max)
            for(int i = 0; i <employees.size(); i++) {
                    for(int j = 1; j < employees.size()-i; j++){
                            if(employees.get(j-1).getSalary() > employees.get(j).getSalary()); }
                    {
                        int j = 0;
                        Employee tmp = employees.get(j);
                        employees.set(j, employees.get(j -1));
                        employees.set(j -1, tmp);
                            }
                    }
            for (Employee employee : employees) {
                    System.out.println("Name: " + employee.getFirstName() + " Salary: " + employee.getSalary());
            }

/*
        TODO 3 create instance of a Student as a Person ->
         than ask him introduce()
         than make them Student
         than ask him introduce()
        */

        Person person = new Student();
            person.setFirstName("Mark");
            person.setSecondName("Zuckerberg");
            person.setAge(45);

            System.out.println(person.announce("I am" + person.getFirstName());
    }

    //TODO 4 Create method for full change of employee information
    // for example some employee change his work
        public void change(Employee employee, int empId,String jobTitle, String companyName, double salary) {

        }
}