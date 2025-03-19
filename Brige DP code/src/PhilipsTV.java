//Concrete Implementor
public class PhilipsTV implements TV{
    public void on(){
    //Philips specific on
         System.out.println("Philips ON");
    }
    public void off(){
    //Philips specific off
        System.out.println("Philips OFF");
    }
    public void tuneChannel(int channel){
    //Philips specific tuneChannel}
        System.out.println("Philips channel Number tuned"+channel);
        
        
        
        
        
        
        
    }    
}
