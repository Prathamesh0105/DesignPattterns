public class DisplayOctalObserver extends Observer{

   public DisplayOctalObserver(Subject subject){
      this.subject = subject;
      this.subject.attach(this);        // THIS LINE IS VERY IMPORTANT
   }

   @Override
   public void update() {
     // here will be the logic for Octal representation
     System.out.println( "Octal String: " + Integer.toOctalString( subject.getState() ) ); 
   }
}
