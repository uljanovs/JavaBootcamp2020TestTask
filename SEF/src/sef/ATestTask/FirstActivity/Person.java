package sef.ATestTask.FirstActivity;


import sef.ATestTask.ThirdActivity.CustomException;

public class Person {

    //TODO 1 Implement Person Attributes
    private String firstName;
    private String secondName;
    private int age;

    //Behavior - default constructor
    public Person() {
        this.firstName = "Unknown";
        this.secondName = "Unknown";
        this.age = 0;
    }

    //Behavior - parameterized constructor
    public Person (String firstName, String secondName, int age) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
    }

    // getter for String firstName
    public String getFirstName() {
        return firstName;
    }

    //setter for String firstName
    public void setFirstName(String firstName) throws NewException {

        if(firstName.matches(".*\\d.*")){
            throw new NewException();
        } else{
            // does not contain a number
            this.firstName = firstName;
        }
    }
    // getter for secondName
    public String getSecondName() {
        return secondName;
    }

    //setter for secondName

    public void setSecondName(String secondName) throws NewException {

        if(secondName.matches(".*\\d.*")){
            throw new NewException();
        } else{
            // does not contain a number
            this.secondName = secondName;
        }
    }

    // getter for int age
    public int getAge() {
        return age;
    }

    // setter for int age
    public void setAge (int age) {
        this.age = age;
    }

    //TODO 2 add all person info into announce() method
    public void announce() {

        System.out.println("My name is " + getFirstName() + " " + getSecondName() + " and I am " + getAge() + " years old");

    }

    /*public static void main(String[] arg) throws NewException {
        Person ivan = new Person();
        ivan.setFirstName("Ivan");
        ivan.setSecondName("Chernyshev1");
       ivan.announce();
    }*/
}

