package sef.ATestTask.FirstActivity;
import java.util.ArrayList;
import java.util.Collections;

public class FirstActivity extends Employee {

	public static void main(String[] args) {

		ArrayList<Employee> employees = new ArrayList<>();

		employees.add(new Employee(1, "driver", "Romashka", 3000.0));
		employees.add(new Employee(2, "manager", "Vasilek", 2000.0));
		employees.add(new Employee(3, "director", "Oduvanchik", 1000.0));
		employees.add(new Employee(4, "developer", "Carrot", 6000.0));
		employees.add(new Employee(5, "tester", "Cucumber", 4000.0));
		employees.add(new Employee(6, "teacher", "Potato", 5000.0));

		System.out.println("This is Employee list: ");

		for (int i = 0; i < employees.size(); i++) {
			Employee r = employees.get(i);
			System.out.println("ID " + r.getEmpId() + " Job Title: " + r.getJobTitle() + " Company:  " + r.getCompanyName() + " Salary: " + r.getSalary());

		}
		//TODO 1 Create collection of employee (more than 5) list or map
		//		System.out.println() result

		System.out.println("-------Sorting by salary:-------- ");

		Collections.sort(employees);
		for (int i = 0; i < employees.size(); i++) {
			Employee q = employees.get(i);

			System.out.println("ID " + q.getEmpId() + " Salary " + q.getSalary());
		}

		//TODO 2 sort and this employees by salary (from min to max)
		// TIP - google bubble sort
		//		System.out.println() result


		Student s = new Student();
		try {
			s.setFirstName("Ivan ");
			s.setSecondName("Ivanov ");
		}catch (Exception e) {System.out.println(e);}
		s.setAge(25);
		System.out.println("-------TODO 3:------");
		System.out.println(s.announce());

		s.setSchoolName("Oxford");
		System.out.println(s.announce(""));

		Student y = new Student();
		try {
			y.setFirstName("Ivan3 ");
		}catch (Exception e) {System.out.println(e);}
		try {
			y.setSecondName("Ivanov ");
		}catch (Exception e) {System.out.println(e);}
		y.setAge(40);
		System.out.println(y.announce());

		//TODO 3 create instance of a Student as a Person ->
		// than ask him introduce()
		// than make them Student
		// than ask him introduce()


		//Employee ch = new Employee(1,  "jobTitle ", "companyName ", 100);
		//System.out.println(ch.announce());

		//setEmployeeChanges(ch, 2,  "jobTitle2 ", "companyName2 ", 2500, "Ivan ", "Ivanov ", 30);
		//System.out.println(ch.announce());
	}

	public static void setEmployeeChanges(Employee ch, int id, String job , String company, double salary, String name, String family, int age) {

		ch.setEmpId(id);
		ch.setJobTitle(job);
		ch.setCompanyName(company);
		ch.setSalary(salary);
		try{
		ch.setFirstName(name);
		ch.setSecondName(family);
		}catch (Exception e) {System.out.println(e);}
		ch.setAge(age);


		//TODO 4 Create method for full change of employee information
		// for example some employee change his work

	}
}
	
	

