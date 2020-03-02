/*package sef.ATestTask.FirstActivity;

public class Employee extends Person {

    private int empId;
    private String jobTitle;
    private String companyName;
    private double salary;

    //TODO 1 create different constructors
    public Employee(){

    }

    //TODO 2 add getters and setters


    //TODO 3 override method announce()
}*/
package sef.ATestTask.FirstActivity;
public class Employee extends Person {
    private int empId;
    private String jobTitle;
    private String companyName;
    private double salary;

    //TODO 1 create different constructors
    //public Employee(){
    public Employee() {
            System.out.println("I'm an Employee Constructor");
        }

    public Employee(int empId, String jobTitle, String companyName, double salary) {
            this.empId = empId;
            this.jobTitle = jobTitle;
            this.companyName = companyName;
            this.salary = salary;

        }

//TODO 2 add getters and setters

        public int getEmpId() {
            return (int) empId;
        }

        public void setEmpId(int empId) {
            this.empId = empId;
        }

        public String getJobTitle() {
            return jobTitle;
        }

        //TODO 2 add getters and setters
        public void setJobTitle(String jobTitle) {
            this.jobTitle = jobTitle;
        }
        public String getCompanyName() {
            return companyName;
        }

        public void setCompanyName(String companyName) {
            this.companyName = companyName;
        }

        //TODO 3 override method announce()
        public double getSalary() {
            return salary;
        }

        public void setSalary(double salary) {
            this.salary = salary;
        }


      /*2.3 Add method for introduce of person ->
            "My name is <name> and i am <age> years old
    I am work as <jobTitle> in <company>"*/


//TODO 3 override method announce()

        public void announce() {
            System.out.println("Inside Person Class");

        }
    }