package sef.ATestTask.FirstActivity;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class FirstActivity {

	public static void main(String[] args) {

		//TODO 1 Create collection of employee (more than 5) list or map
		//		System.out.println() result
		List<Employee> list = new ArrayList<>();
		list.add(new Employee(1, "Manager","Tesla", 1000));
		list.add(new Employee(2, "HR", "Tesla", 780));
		list.add(new Employee(3, "Clark", "Tesla", 600));
		list.add(new Employee(4,"Supervisor", "Tesla",900));
		list.add(new Employee(5,"Firstader","Tesla",800));


//		arr[j-1];
//		list.get(j-1);
		//TODO 2 sort and this employees by salary (from min to max)
		for(int i = 0; i < list.size(); i++) {
			for(int j = 1; j < list.size()-i; j++){
				if(list.get(j-1).getSalary() > list.get(j).getSalary()) {
					Employee tmp = list.get(j);
					list.set(j, list.get(j -1));
					list.set(j -1, tmp);
				}
			}
		}

		for (Employee employee : list) {
			System.out.println("Name: " + employee.getFirstName() + " Salary: " + employee.getSalary());
		}
		// TIP - google bubble sort
		//		System.out.println() result

		Person person = new Student("Bootcamp");
		person.setFirstName("Gosha");
		person.setSecondName("Kucenko");
		person.setAge(75);

		System.out.println(person.announce());
		//TODO 3 create instance of a Student as a Person ->
		// than ask him introduce()
		// than make them Student
		// than ask him introduce()

		//TODO 4 Create method for full change of employee information
		// for example some employee change his work


	}

	//4
	public void changeEmployeeInformation(Employee employee, int empId,String jobTitle, String companyName, double salary) {

	}
	
	
}
