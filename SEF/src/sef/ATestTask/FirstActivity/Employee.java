package SEF.src.sef.ATestTask.FirstActivity;

public class Employee extends Person {
    //Attributes
    private int empId;
    private String jobTitle;
    private String companyName;
    private double salary;



    //TODO 1 create different constructors
    //default constructor
    public Employee() {
    }

    //Behavior - parameterized constructor
    public Employee (int empId, String jobTitle, String companyName, double salary) {
    }

    //TODO 2 add getters and setters

    //getter for int empId
    public int getEmpId(){return empId;
    }
    //setter for int empId
    public int setEmpId(int empId){
        this.empId = empId;
        return empId;
    }
    //getter for String jobTitle
    public String getJobTitle(){return jobTitle;}
    //setter for String jobTitle
    public void setJobTitle(String jobTitle){
        this.jobTitle = jobTitle;
    }
    //getter for String companyName
    public String getCompanyName(){return companyName;}
    //setter for String companyName
    public void setCompanyName(String companyName){
        this.companyName = companyName;
    }
    //getter for int empId
    public double getSalary(){return salary;
    }
    //setter for int empId
    public void setSalary(double salary){
        this.salary = salary;
    }



    //TODO 3 override method announce()
    @Override
    public void announce () {
        System.out.println("My name is" + " " + firstName + " " + "and i am" + " " + age + " " + "years old" + "\nI am work as" + " " + jobTitle + " " + "in" + companyName);
    }

}