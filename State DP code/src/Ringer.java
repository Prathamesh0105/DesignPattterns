public class Ringer implements MobileAlertState{
    public void work(MobileContext c){
        System.out.println(" Mobile is Ringing");
        c.setBrightness(50);
    }
}