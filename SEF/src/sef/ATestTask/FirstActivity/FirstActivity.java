package sef.ATestTask.FirstActivity;

import java.util.ArrayList;
import java.util.List;

public class FirstActivity {

	public static void main(String[] args) {

		//TODO 1 Create collection of employee (more than 5) list or map
		//		System.out.println() result
		Employee a = new Employee();
		a.setFirstName("Johanna");
		a.setSecondName("Nickelson");
		a.setEmpId(1);
		a.setCompanyName("redmadrobot");
		a.setJobTitle("iOS developer");
		a.setSalary(2200);
		a.setAge(32);

		Employee b = new Employee();
		b.setFirstName("Steve");
		b.setSecondName("Ronny");
		b.setEmpId(2);
		b.setCompanyName("redmadrobot");
		b.setJobTitle("Android developer");
		b.setSalary(2000);
		b.setAge(29);

		Employee c = new Employee();
		c.setFirstName("Emily");
		c.setSecondName("Richards");
		c.setEmpId(3);
		c.setCompanyName("redmadrobot");
		c.setJobTitle("Product Owner");
		c.setSalary(1700);
		c.setAge(43);

		Employee d = new Employee();
		d.setFirstName("Gregory");
		d.setSecondName("Chernyshevsky");
		d.setEmpId(4);
		d.setCompanyName("redmadrobot");
		d.setJobTitle("Project Manager");
		d.setSalary(1900);
		d.setAge(35);

		Employee e = new Employee();
		e.setFirstName("Olaf");
		e.setSecondName("Cruzenshtern");
		e.setEmpId(5);
		e.setCompanyName("redmadrobot");
		e.setJobTitle("iOS developer");
		e.setSalary(2500);
		e.setAge(40);

		Employee f = new Employee();
		f.setFirstName("Marika");
		f.setSecondName("Klodt");
		f.setEmpId(6);
		f.setCompanyName("redmadrobot");
		f.setJobTitle("Sales Manager");
		f.setSalary(2600);
		Employee g = new Employee();
		g.setFirstName("Louis");
		g.setSecondName("Shoo");
		g.setEmpId(7);
		g.setCompanyName("redmadrobot");
		g.setJobTitle("Sales Manager");
		g.setSalary(2300);
		f.setAge(26);

		//Create an ArrayList
		List<Employee> employeeList = new ArrayList<Employee>();
		// List implemented as growable array

		// Add elements to the list

		employeeList.add(a);
		employeeList.add(b);
		employeeList.add(c);
		employeeList.add(d);
		employeeList.add(e);
		employeeList.add(f);
		employeeList.add(g);

		System.out.printf("Employees list \n- - - - - - - - - - - - - - - - - - -\n");

		for (Employee employee : employeeList) {

			System.out.println(employee.getempId() + "\n- - - - -\nName: " + employee.getFirstName() + " " + employee.getSecondName() + ".\nAge: " + employee.getAge() + ".\nCompany: " + employee.getCompanyName() + ".\nJob Title: " + employee.getJobTitle() + "\nSalary: " + employee.getSalary() + ".\n-------------------------");
		}
		//TODO 2 sort and this employees by salary (from min to max)
		// TIP - google bubble sort
		//		System.out.println() result
		System.out.println("\n\nEmployee list sorted by salary from min to max\n- - - - - - - - - - - - - - - - - - -");

		Employee temp;
		if (employeeList.size() > 1) // check if the number of orders is larger than 1
		{
			for (int x = 0; x < employeeList.size(); x++) // bubble sort outer loop
			{
				for (int i = 0; i < employeeList.size() - x - 1; i++) {
					if (employeeList.get(i).compareTo(employeeList.get(i + 1)) > 0) {
						temp = employeeList.get(i);
						employeeList.set(i, employeeList.get(i + 1));
						employeeList.set(i + 1, temp);
					}
				}
			}
		}
		for (int i = 0; i < employeeList.size(); i++) {
			System.out.println((i + 1) + ") Name :: " + employeeList.get(i).getFirstName() + " " + employeeList.get(i).getSecondName() + ", Salary :: " + employeeList.get(i).getSalary());
		}
		System.out.println("-----------------------------------------------------------");
		//TODO 3 create instance of a Student as a Person ->
		// than ask him introduce()
		// than make them Student
		// than ask him introduce()
		System.out.println("\n\nCasting Person to Student\n- - - - - - - - - - - - - - - - - - -");
		Person hPerson = new Person();
		hPerson.setFirstName("Holly");
		hPerson.setSecondName("Din");
		hPerson.setAge(25);
		hPerson.introduce();
		//Student hStudent = (Student) hPerson; // convert person to student
		Student hStudent = new Student();
		hStudent.setFirstName(hPerson.getFirstName());
		hStudent.setSecondName(hPerson.getSecondName());
		hStudent.setAge(hPerson.getAge());
		hStudent.setSchoolName("TSI");
		hStudent.introduce();
		System.out.println("-----------------------------------------------------------");
		//TODO 4 Create method for full change of employee information
		// for example some employee change his work


	}

	
	
}
