package sef.ATestTask.FirstActivity;

import java.util.*;


public class FirstActivity {

    public static void main(String[] args) {

        //TODO 1 Create collection of employee (more than 5) list or map
        //		System.out.println() result
        ArrayList<Employee> employees = new ArrayList<Employee>();
        employees.add(new Employee(01, "developer", "q", 2500));
        employees.add(new Employee(02, "tester", "w", 2000));
        employees.add(new Employee(03, "manager", "e", 5000));
        employees.add(new Employee(04, "consultant", "r", 1500));
        employees.add(new Employee(05, "HR", "t", 1200));
        employees.add(new Employee(06, "senior developer", "t", 3000));
        employees.add(new Employee(07, "CEO", "c", 10000));


        for (int i = 0; i < employees.size(); i++) {
        	Employee e = employees.get(i);
        	System.out.println("empId - " + e.getEmpId() + " / " + "jobTitle - " + e.getJobTitle() + " / " + "company name - " + e.getCompanyName() + " / " + "salary - " + e.getSalary());

        }

        //TODO 2 sort and this employees by salary (from min to max)
        // TIP - google bubble sort
        //		System.out.println() result



	/*	for (int i = 0; i < employees.size(); i++) {
			int n = employees.size();
			Employee e = employees.get(i);
			double S = e.getSalary();

			for (int a = 0; a < n-1; a++)
				for (int b = 0; b < n-a-1; b++)
					if (S[b] > employees[b+1])
					{
						// swap arr[j+1] and arr[i]
						int temp = employees[b];
						employees[b] = employees[b+1];
						employees[b+1] = temp;
					}

			System.out.println("empId - " + e.getEmpId() + " / " + "jobTitle - " + e.getJobTitle() + " / " + "company name - " + e.getCompanyName() + " / " + "salary - " + e.getSalary());

		}*/




		//TODO 3 create instance of a Student as a Person ->
        // than ask him introduce()
        // than make them Student
        // than ask him introduce()


        //TODO 4 Create method for full change of employee information
        // for example some employee change his work


    }


}
