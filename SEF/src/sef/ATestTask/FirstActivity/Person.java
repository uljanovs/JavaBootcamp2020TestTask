package SEF.src.sef.ATestTask.FirstActivity;


import SEF.src.sef.ATestTask.ThirdActivity.CustomExceptionActivity;

public class Person {

//TODO 1 Implement Person Attributes


	//Attributes
	public String firstName;
	public String secondName;
	public int age;

	//Behavior - default constructor
	public Person() {
		this.firstName = "Unknown";
		this.secondName = "Unknown";
		this.age = 0;

	}

	//Behavior - parameterized constructor
	public Person(String firstName, String secondName, int age) {
		this.firstName = firstName;
		this.secondName = secondName;
		this.age = age;
	}

	// getter for String firstName
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	// getter for int age
	public int getAge() {
		return age;
	}

	// setter for int age
	public void setAge(int age) {
		this.age = age;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	//TODO 2 add all person info into announce() method
	public void announce() {
		System.out.println("I am " + getFirstName() + " " + getSecondName() + " " + "and I am " + age + " " + "years old");
	}

	void validateUser(String firstName) throws CustomExceptionActivity {
		Person obj = new Person();
		try {
			obj.validateUser("Ivan");
		} catch (CustomExceptionActivity z) {
			System.out.println(z.getMessage());
		}
	}

	}