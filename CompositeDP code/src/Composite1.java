public class Composite1
{
    public static void main (String[] args)
    {
      
      Employee  CEO = new Leaf(101,"John","CEO");
      Employee  SalesManager = new Leaf(102,"Robert","Manager-Sales");
      Employee  ProductionManager = new Leaf(103,"Michel","Manager-Production");
      
      Employee  MarktingPerson1 = new Leaf(111,"Damson","Marketing-Sales1");
      Employee  MarktingPerson2 = new Leaf(222,"Melvin","Marketing-Sales2");
      Employee  clerk1 = new Leaf(333,"Laura","Clerk-Sales");
      Employee  ProductionEngg1 = new Leaf(444,"Billi","Engg-Production1");
      Employee  ProductionEngg2 = new Leaf(555,"Mark","Engg-Production2");
      Employee  clerk2 = new Leaf(666,"Bob","Clerk-Production");
      
      Employee  CEOTeam = new Composite();
      Employee  SalesManagerTeam = new Composite();
      Employee  ProductionManagerTeam = new Composite();
      
      CEOTeam.addEmployee(CEO);
      CEOTeam.addEmployee(SalesManagerTeam);
      CEOTeam.addEmployee(ProductionManagerTeam);
      
      SalesManagerTeam.addEmployee(SalesManager);
      SalesManagerTeam.addEmployee(MarktingPerson1);
      SalesManagerTeam.addEmployee(MarktingPerson2);
      SalesManagerTeam.addEmployee(clerk1);
      
      ProductionManagerTeam.addEmployee(ProductionManager);
      ProductionManagerTeam.addEmployee(ProductionEngg1);
      ProductionManagerTeam.addEmployee(ProductionEngg2);
      ProductionManagerTeam.addEmployee(clerk2);

      //print all employees of the organization
      CEO.showEmployeeDetails();       
   } 
    }
   
         
       