package sef.ATestTask.FirstActivity;


public class Person {

    private String firstName;
	private String secondName;
	private int age;

	public Person(){
		this.firstName = "Name";
		this.secondName = "Surname";
		this.age = 0;
	}

	//Behavior - parameterized constructor
	public Person(String firstName, String secondName, int age){
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
	public void announce(String s) {
		System.out.println("My name is " + getFirstName() + "" + getSecondName() + "and I am" + getAge() + "years old");
	}
}


