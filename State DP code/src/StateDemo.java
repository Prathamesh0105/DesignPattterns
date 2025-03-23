public class StateDemo {

    public static void main(String[] args) {
    
        MobileContext alertStateContext= new MobileContext();
        alertStateContext.work();
        
        System.out.println("===================");
        
        alertStateContext.setState(new Vibration());
        alertStateContext.work();
    }
    
}
