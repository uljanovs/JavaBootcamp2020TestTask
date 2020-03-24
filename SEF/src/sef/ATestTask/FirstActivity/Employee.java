package sef.ATestTask.FirstActivity;

public class Employee extends Person implements Comparable<Employee>{

    private int empId;
    private String jobTitle;
    private String companyName;
    private double salary;

    //TODO 1 create different constructors
    public Employee(){
        this.empId = 0;
        this.jobTitle = "Unknown";
        this.companyName = "Unknown";
        this.salary = 0.0;
    }

    public Employee(int empId,  String jobTitle, String companyName, double salary) {
        this.empId = empId;
        this.jobTitle = jobTitle;
        this.companyName = companyName;
        this.salary = salary;


    }

    //TODO 2 add getters and setters

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    //TODO 3 override method announce()
    public String announce() {
     return "My name is  " + getFirstName() + getSecondName() + " and I am " + getAge() + "years old. " + " I am work as " + getJobTitle() + getCompanyName() + "Salary: " + getSalary();
    }


    @Override
    public int compareTo(Employee o) {
        return (Double.compare(this.getSalary(), o.getSalary()));
    }
    }
