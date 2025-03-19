//Concrete Implementor 
public class SonyTV implements TV{
    public void on(){
        //Sony specific on
        System.out.println("Sony ON");
    }
    public void off(){
        //Sony specific off
        System.out.println("Sony OFF");
    }
    public void tuneChannel(int channel){
        //Sony specific tuneChannel
        System.out.println("Sony channel Number tuned"+channel);
    }
}
