package sef.ATestTask.FirstActivity;
		//TODO 1 Create collection of employee (more than 5) list or map
		//		System.out.println() result

		//TODO 2 sort and this employees by salary (from min to max)
		// TIP - google bubble sort
		//		System.out.println() result

		//TODO 4 Create method for full change of employee information
		// for example some employee change his work
import java.util.ArrayList;

public class FirstActivity {

	public static void main(String[] args) {
		//TODO 1 Create collection of employee (more than 5) list or map
		//		System.out.println() result
		ArrayList<String> employees = new ArrayList<String>();
		employees.add("John");
		employees.add("Anton");
		employees.add("Victor");
		employees.add("Ben");
		employees.add("Marco");
		employees.add("Nathan");

		System.out.println(employees);


		//TODO 3 create instance of a Student as a Person ->
		// than ask him introduce()
		// than make them Student
		// than ask him introduce()

		Student s = (Student) new Person();
		System.out.println(s.introduce());
		Person p = new Student();
		System.out.println(p.introduce());

	}
}