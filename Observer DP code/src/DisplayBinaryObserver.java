public class DisplayBinaryObserver extends Observer{

   public DisplayBinaryObserver(Subject subject){
      this.subject = subject;
      this.subject.attach(this);     // THIS LINE IS VERY IMPORTANT
   }

   @Override
   public void update() {  
       // here will be the logic for Binary representation
       System.out.println( "Binary String: " + Integer.toBinaryString( subject.getState() ) ); 
   }
}