public abstract class ColdDrink implements Item{
    public Packing packing(){
        return new Bottle();
    }   
    public String toString(){
        return "BOTTLE";
    }
}
