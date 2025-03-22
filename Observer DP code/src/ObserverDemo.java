public class ObserverDemo {
    public static void main(String[] args) {
      Subject subject = new ConcreteSubject();

      Observer o1= new DisplayBinaryObserver(subject);
      Observer o2=new DisplayHexaObserver(subject);
      Observer o3=new DisplayOctalObserver(subject);
    

      System.out.println("\nFirst state change: 11");	
      subject.setState(11);
      
      System.out.println("\nSecond state change: 7");	
      subject.setState(7);
   }
    
}
