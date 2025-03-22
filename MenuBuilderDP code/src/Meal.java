import java.util.ArrayList;
import java.util.List;

public class Meal {
    private List<Item> items = new ArrayList<Item>(); 
    public void addItem(Item item){
      items.add(item);
   }
public void showItems(){
      for(Item i:items){
          System.out.println("Item Name: "+i.name());
          System.out.println("Item Price: "+i.price());
          System.out.println("Packed in : "+i.packing().pack());
      }
        
}
public float getCost(){
        float cost=0.0f;
        for(Item i:items){
          cost+=i.price();
        }
        return cost;
}
}