public class Cricket extends Game{
    void endPlay() {
      System.out.println("Cricket Game Finished!");
   }

   @Override
   void initialize() {
      super.initialize();
      System.out.println("Cricket Game Initialized! Start playing.");
   }

   @Override
   void startPlay() {
      System.out.println("Cricket Game Started. Enjoy the game!");
   }
}