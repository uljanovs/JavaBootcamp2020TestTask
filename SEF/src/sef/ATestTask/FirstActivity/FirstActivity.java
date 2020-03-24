package sef.ATestTask.FirstActivity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class FirstActivity extends Employee {

    public static void main(String[] args) {

        //TODO 1 Create collection of employee (more than 5) list or map
        //		System.out.println() result
        Employee employee1 = new Employee("John", "Snow", 25, 01, "Tester", "Snowwhite", 1000);
        Employee employee2 = new Employee("Dina", "Peppa", 29, 02, "Assistant", "Rosenrot", 1500);
        Employee employee3 = new Employee("John", "Heppner", 50, 03, "Musician", "Wolfsheim", 9000);
        Employee employee4 = new Employee("Till", "Lindemann", 57, 04, "Singer", "Rammstein", 3600);
        Employee employee5 = new Employee("Steve", "Hewitt", 52, 05, "Drummer", "Placebo", 2800);
        Employee employee6 = new Employee("Martin", "Gore", 60, 06, "Composer", "DepecheMode", 3400);
        List<Employee> employees = new ArrayList<>();
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);
        employees.add(employee5);
        employees.add(employee6);

        for (Employee employee : employees) {
            System.out.println("First name:" + employee.getFirstName() + " Second name:" + employee.getSecondName() + " Age:" + employee.getAge() + " Id:" + employee.getEmpId() + " Job:" + employee.getJobTitle() + " Company:" + employee.getCompanyName() + " Salary:" + employee.getSalary());
        }
        //TODO 2 sort and this employees by salary (from min to max)
        // TIP - google bubble sort
        //		System.out.println() result

        Comparator<Employee> EmpSalary = new Comparator<Employee>() {

            @Override
            public int compare(Employee o1, Employee o2) {
                double sal1 = o1.getSalary();
                double sal2 = o2.getSalary();

                return (int) (sal1 - sal2);
            }

        };

        Collections.sort(employees, EmpSalary);
        for (Employee employee : employees) {
            System.out.println("First name:" + employee.getFirstName() + " Second name:" + employee.getSecondName() + " Age:" + employee.getAge() + " Id:" + employee.getEmpId() + " Job:" + employee.getJobTitle() + " Company:" + employee.getCompanyName() + " Salary:" + employee.getSalary());
        }

        System.out.println("___");
        System.out.println("sort, name, second name");
        Comparator<Employee> EmpName = new Comparator<Employee>() {

            @Override
            public int compare(Employee o1, Employee o2) {
                int firstCompare = o1.getFirstName().compareTo(o2.getFirstName());
                if (firstCompare != 0){
                    return firstCompare;
                }
                return o1.getSecondName().compareTo(o2.getSecondName());
            }

        };

        Collections.sort(employees, EmpName);
        for (Employee employee : employees) {
            System.out.println("First name:" + employee.getFirstName() + " Second name:" + employee.getSecondName() + " Age:" + employee.getAge() + " Id:" + employee.getEmpId() + " Job:" + employee.getJobTitle() + " Company:" + employee.getCompanyName() + " Salary:" + employee.getSalary());
        }
        //TODO 3 Create instance of a student as a person ->
        // than ask him introduce()
        // than make them Student
        // than ask him introduce()
        Person s = new Student();
        s.setFirstName("Leo");
        s.setSecondName("Ololeo");
        s.setAge(99);
        System.out.println(s.announce());



        Person tempPerson = s;
        tempPerson.announce();
        Student tempStudent = (Student) tempPerson;
        tempStudent.announce();

        //TODO 4 Create method for full change of employee information
        // for example some employee change his work

        employee1 = modify(employee1,9,"l","l");
        employee1.getCompanyName();

    }

    public static Employee modify(Employee employee, int empId, String jobTitle,
                           String companyName){
        employee.setEmpId(empId);
        employee.setCompanyName(companyName);
        employee.setJobTitle(jobTitle);
        return employee;
    }

}
