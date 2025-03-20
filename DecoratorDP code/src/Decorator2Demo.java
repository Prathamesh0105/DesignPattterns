public class Decorator2Demo {

    public static void main(String[] args) {
    
    Pizza curr2 =  new CapsicumDecorator(new TomatoDecorator(new CapsicumDecorator(new VegPizza())));
    System.out.println(curr2.getDescription() +" $ "+curr2.cost());
    }   
}




 