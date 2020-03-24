package sef.ATestTask.FirstActivity;

public class Employee extends Person implements Comparable<Employee>  {

    private int empId;
    private String jobTitle;
    private String companyName;
    private double salary;

    //TODO 1 create different constructors
    //Default constructor
    public Employee() {
        this.empId = 11001;
        this.jobTitle = "Developer";
        this.companyName = "Accenture";
        this.salary = 1400.333;
    }

    //Parametrized constructor
    public Employee(String firstName, String secondName, int age, int empId, String jobTitle, String companyName, double salary) {
       super(firstName, secondName, age);
        this.empId = empId;
        this.jobTitle = jobTitle;
        this.companyName = companyName;
        this.salary = salary;
    }

    //TODO 2 add getters and setters
    //getter for int empId
    public int getEmpId() {
        return empId;
    }

    //setter for int empId
    public void setEmpId(int empId) {
        this.empId = empId;
    }

    //getter for String jobTitle
    public String getJobTitle() {
        return jobTitle;
    }

    //setter for String jobTitle
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    //getter for String companyName
    public String getCompanyName() {
        return companyName;
    }

    //setter for String companyName
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    //getter for double salary
    public double getSalary() {
        return salary;
    }

    //setter for double salary
    public void setSalary(double salary) {
        this.salary = salary;
    }

    //TODO 3 override method announce()

    public void announce() {
        System.out.println("My name is " + getFirstName() + getSecondName() + " and i am " + getAge() + " years old."
                + " I am work as " + getJobTitle() + " in " + getCompanyName());
    }

    //stuff for FirstActivity.java
    @Override
    public int compareTo(Employee emp) {
        return (this.getSalary() < emp.getSalary()? -1:
             (this.getSalary()==emp.getSalary() ? 0:1));
    }

    //FirstActivity.java TODO 4
    public void ChangeInfo(String firstName, String secondName, int age, int empId, String jobTitle, String companyName, double salary) throws NewException {
        this.setFirstName(firstName);
        this.setSecondName(secondName);
        this.setAge(age);
        this.setEmpId(empId);
        this.setJobTitle(jobTitle);
        this.setCompanyName(companyName);
        this.setSalary(salary);
    }
}
