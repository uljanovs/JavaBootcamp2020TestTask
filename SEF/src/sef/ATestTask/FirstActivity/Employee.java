package sef.ATestTask.FirstActivity;

public class Employee extends Person {

    private int empId;
    private String jobTitle;
    private String companyName;
    private double salary;
    private String name;
    private int age;

    //TODO 1 create different constructors
    //Behavior - default constructor
    public Employee(String name, int age, String jobTitle, int salary) {
        this.name = "Unknown";
        this.age = 0;
        this.companyName = "Unknown";
        this.jobTitle = "Unknown";
        this.salary = 0;
        this.empId = 0;
    }
    //Behavior - parameterized constructors
    public Employee(String name, int age, String title, String company, double salary, int Id) {
        this.name = name;
        this.age = age;
        this.companyName = company;
        this.jobTitle = title;
        this.salary = salary;
        this.empId = Id;
    }

    public Employee(String name) {
        this.name = name;
    }

    //TODO 2 add getters and setters
// getter for String name
    public String getName() {
        return name;
    }

    // setter for String name
    public void setName(String name) {
        this.name = name;
    }

    // getter for String company
    public String getCompany() {
        return companyName;
    }

    // setter for String company
    public void setCompany(String company) {
        this.companyName = company;
    }

    // getter for String jobTitle
    public String getJobTitle() {
        return jobTitle;
    }

    // setter for String jobTitle
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    // getter for double salary
    public double getSalary() {
        return salary;
    }

    // setter for double salary
    public void setSalary(double salary) {
        this.salary = salary;
    }

    // getter for int empId
    public int getEmpId() {
        return empId;
    }

    // setter for int empId
    public void setEmpId(int empId) {
        this.empId = empId;
    }

    //TODO 3 override method announce()
    {
        System.out.println("My name is" + name + "and i am" + age + "years old." + " I work as" + jobTitle + "in" + companyName);

}
}



