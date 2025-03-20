import java.util.ArrayList;
import java.util.List;
 
public class Composite implements Employee
{
    private List<Employee> subordinates = new ArrayList<Employee>();
      
    @Override
    public void showEmployeeDetails() 
    {
        for(Employee emp:subordinates)
        {
            emp.showEmployeeDetails();
        }
    }
      
    public void addEmployee(Employee emp)
    {
        subordinates.add(emp);
    }
      
    public void removeEmployee(Employee emp)
    {
        subordinates.remove(emp);
    }
}