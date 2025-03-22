
public class MealBuilder{
    Meal meal = new Meal();
    public Meal prepareVegMeal (){
      meal.addItem(new VegBurger());
      meal.addItem(new Coke());
      return meal;
   }
   public Meal prepareNonVegMeal (){
      meal.addItem(new ChickenBurger());
      meal.addItem(new Pepsi());
      return meal;
   }
}
