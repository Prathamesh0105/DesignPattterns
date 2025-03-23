//public class RealObjectProxy implements RealObject
//{
//    RealObject ROI=new RealObjectImpl();
//    public void doSomething() 
//    {
//        //Perform additional logic and security
//        //Even we can block the operation execution
//        System.out.println("Delegating work on real object");
//        ROI.doSomething();
//        //Perform additional logic     
//    }
//}


public class RealObjectProxy implements RealObject
{
    RealObject ROI=null;
    public void doSomething() 
    {
        //Perform additional logic and security
        //Even we can block the operation execution
        if(ROI==null)
            ROI=new RealObjectImpl();
        System.out.println("Delegating work on real object");
        ROI.doSomething();
        //Perform additional logic    
        ROI=null;  // Object no longer referenced
        System.gc(); // Ensures FULL GC before application exits. Garbage collector takes care of freeing memory
        
         
    }
}