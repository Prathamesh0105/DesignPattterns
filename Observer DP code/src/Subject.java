import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
	
   protected List<Observer> observers = new ArrayList<Observer>();
   

   public abstract int getState();

   public abstract void setState(int state);

   public void attach(Observer observer){
      observers.add(observer);		
   }

   public void notifyAllObservers(){
      for (Observer observer : observers) {
         observer.update();
      }
   } 	
}
