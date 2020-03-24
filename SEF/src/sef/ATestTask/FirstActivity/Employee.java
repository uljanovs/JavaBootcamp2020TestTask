package sef.ATestTask.FirstActivity;

public class Employee extends Person {

    int empId;
    String jobTitle;
    String companyName;
    double salary;

    //TODO 1 create different constructors
    public Employee() {
        this.empId = 0;
        this.jobTitle = "Unknown";
        this.companyName = "Unknown";
        this.salary = 0;
    }

    public Employee(int empId, String jobTitle, String companyName, double salary) {
        this.empId = empId;
        this.jobTitle = jobTitle;
        this.companyName = companyName;
        this.salary = salary;
    }

    public Employee(int empId, String jobTitle) {
        this.empId = empId;
        this.jobTitle = jobTitle;
    }

    public Employee(String companyName, double salary) {
        this.companyName = companyName;
        this.salary = salary;
    }

    //TODO 2 add getters and setters
    public int getEmpId() {
        return empId;
}
    public void setEmpId(int empId){
        this.empId = empId;
    }
    public String getJobTittle() {
        return jobTitle;
    }
    public void setJobTitle(String jobTitle){
        this.jobTitle = jobTitle;
    }
    public String getCompanyName() {
        return companyName;
    }
    public void setCompanyName(String companyName){
        this.companyName = companyName;
    }
    public double getSalary(){
        return salary;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }
    // setter for int age

    //TODO 3 override method announce()

    public String announce() {
        return "My name is " + getFirstName() + " " + getSecondName() + "and I am " + getAge() + ". I am work sa " + getJobTittle() + "in " + getCompanyName();
    }
    //"My name is <name> and i am <age> years old
    //   I am work as <jobTitle> in <company>"
}

