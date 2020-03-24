package SEF.src.sef.ATestTask.FirstActivity;
import java.util.Arrays;


public class FirstActivity extends Employee {

	private FirstActivity() {

	}

	public static void main(String[] args) {

		//TODO 1 Create collection of employee (more than 5) list or map

		//Employee array which will hold employees
		Employee employee[] = new Employee[6];
		//set different attributes of the individual employee.
		employee[0] = new Employee();
		employee[0].setFirstName("Joe");
		employee[0].setSecondName("Summer");
		employee[0].setSalary(570);

		employee[1] = new Employee();
		employee[1].setFirstName("Jim");
		employee[1].setSecondName("Snow");
		employee[1].setSalary(580);

		employee[2] = new Employee();
		employee[2].setFirstName("Julie");
		employee[2].setSecondName("Sun");
		employee[2].setSalary(500);

		employee[3] = new Employee();
		employee[3].setFirstName("Daiga");
		employee[3].setSecondName("Zara");
		employee[3].setSalary(522);

		employee[4] = new Employee();
		employee[4].setFirstName("Janis");
		employee[4].setSecondName("Zars");
		employee[4].setSalary(542);

		employee[5] = new Employee();
		employee[5].setFirstName("Dans");
		employee[5].setSecondName("Barko");
		employee[5].setSalary(666);


		System.out.println("Order of employee before sorting is");
		for (int i = 0; i < employee.length; i++) {
			System.out.println("Employee " + (i + 1) + " name : " + employee[i].getFirstName() + ", Last name : " + employee[i].getSecondName() + ", Salary : " + employee[i].getSalary());
		}


//		System.out.println() result

//TODO 2 sort and this employees by salary (from min to max)
// TIP - google bubble sort
//		System.out.println() result


//Sorting array on the basis of employee salary

//Sorting array on the basis of employee age by passing AgeComparator
		Arrays.sort(employee, new SalaryComparator());
		System.out.println("\n\nOrder of employee after sorting by employee salary is");

		for(int i=0; i < employee.length; i++){
			System.out.println("Employee " + (i + 1) + " name : " + employee[i].getFirstName() + ", Last name : " + employee[i].getSecondName() + ", Salary : " + employee[i].getSalary());
		}




//TODO 3 create instance of a Student as a Person ->
// than ask him introduce()
// than make them Student
// than ask him introduce()
		Student s = new Student();
		s.setFirstName("Krisjanis");
		s.setSchoolName("LLU");

		Person tempPerson = s;
		tempPerson.announce();
		Student tempStudent = (Student) tempPerson;
		tempStudent.announce();




//TODO 4 Create method for full change of employee information
// for example some employee change his work



	}
}

