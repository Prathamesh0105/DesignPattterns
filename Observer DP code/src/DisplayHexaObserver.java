public class DisplayHexaObserver extends Observer{

   public DisplayHexaObserver(Subject subject){
      this.subject = subject;
      this.subject.attach(this);    // THIS LINE IS VERY IMPORTANT
   }

   @Override
   public void update() {
      // here will be the logic for Hexadecimal representation
      System.out.println( "Hex String: " + Integer.toHexString( subject.getState() ).toUpperCase() ); 
   }
}