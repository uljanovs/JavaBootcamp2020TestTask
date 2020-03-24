package SEF.src.sef.ATestTask.FirstActivity;
import java.util.*;

public class SalaryComparator implements Comparator{
    public int compare(Object employee1, Object employee2){

        double employee1Salary = ((Employee)employee1).getSalary();
        double employee2Salary = ((Employee)employee2).getSalary();

        if(employee1Salary > employee2Salary)
            return 1;
        else if(employee1Salary < employee2Salary)
            return -1;
        else
            return 0;
    }

}


