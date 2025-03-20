public class CapsicumDecorator extends Decorator{
 Pizza pizza;
 public CapsicumDecorator(Pizza p){
  this.pizza = p;
 }

 public String getDescription(){
  return pizza.getDescription()+" ,Decorated by Capsicum toppings";
 }
 public double cost(){
  return pizza.cost()+ 5.0;
  }
}
    