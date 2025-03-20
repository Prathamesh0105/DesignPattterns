public class TomatoDecorator extends Decorator{
 Pizza pizza;
 public TomatoDecorator(Pizza p){
  this.pizza = p;
 }

 public String getDescription(){
  return pizza.getDescription()+" ,Decorated by Tomato toppings";
 }
 public double cost(){
  return pizza.cost()+ 4.0;
  }
}
    