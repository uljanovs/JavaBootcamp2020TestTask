package sef.ATestTask.FirstActivity;


public class Person {

//TODO 1 Implement Person Attributes
	String firstName;
	String secondName;
	int age;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	//TODO 2 add all person info into announce() method
	public String announce() {
		return "My name is " + getFirstName() + " " + getSecondName() +  " and I am " + getAge();
	}
}

