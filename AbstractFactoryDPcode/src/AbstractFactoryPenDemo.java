public class AbstractFactoryPenDemo {
    public static void main(String[] args) {
    
    PenFactory pf=new PenFactory();               
    Pen p;
    //Demonstrate any one case. 
    p= pf.getPen("sketch");    
    System.out.println(p);
    p.write();
    //USE PRODUCT METHODS
    }
}

