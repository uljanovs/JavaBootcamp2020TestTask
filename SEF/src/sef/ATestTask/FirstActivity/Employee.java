package sef.ATestTask.FirstActivity;

public class Employee extends Person implements Humanity{

    private int empId;
    private String jobTitle;
    private String companyName;
    private double salary;
    private String nationality;


    //TODO 1 create different constructors
    public Employee() {
        this.empId = -1;
        this.jobTitle = "Master";
        this.companyName = "Kingdom";
        this.salary = 12345;
    }

    public Employee(String firstName, String secondName, int age, int empId, String jobTitle, String companyName, double salary) {
        super(firstName, secondName, age);
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
        String personAnnounce = super.announce();
        return personAnnounce +"I work as" +jobTitle+ "in" +companyName;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    @Override
    public String getNationality() {
        return this.nationality;
    }
}