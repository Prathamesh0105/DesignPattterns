public class Leaf implements Employee{
    private String name;
    private long empId;
    private String position;
 
    public Leaf(long empId, String name, String position)
    {
        this.empId = empId;
        this.name = name;
        this.position = position;
    }
     
    @Override
    public void showEmployeeDetails() 
    {
        System.out.println(empId+"\t" +name+"\t"+ position);
    }
    public void addEmployee(Employee emp)
    {
       // subordinates.add(emp);
    }
      
    public void removeEmployee(Employee emp)
    {
       // subordinates.remove(emp);
    }
}
