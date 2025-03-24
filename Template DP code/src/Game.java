public abstract class  Game {
   void initialize(){                               // Hook operation
    System.out.println("Welcome Screen");
    System.out.println("company logo design");
   
   }
   abstract void startPlay();                      // Primitive operation
   abstract void endPlay();                        // Primitive operation

   //template method
   public final void play(){

      //initialize the game
      initialize();

      //start game
      startPlay();

      //end game
      endPlay();
   }
}
