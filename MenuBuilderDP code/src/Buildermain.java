public class Buildermain {
      public static void main(String[] args) {
//      System.out.println("HELLO");
        MealBuilder mealBuilder = new MealBuilder();

//      Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
//      System.out.println("\nNon-Veg Meal");
//      nonVegMeal.showItems();
//      System.out.println("Total Cost: " + nonVegMeal.getCost());
        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("\nVeg Meal");
        vegMeal.showItems();
        System.out.println("Total Cost: " + vegMeal.getCost());              
   }
   }
   
