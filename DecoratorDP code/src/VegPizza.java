public class VegPizza extends Pizza{
  double value;
  String description;
  
  public VegPizza() {
  description = "VegPizza";
  value=200.0;
 }

public double cost(){
  return value;
 }
}