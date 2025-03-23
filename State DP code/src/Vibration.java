public class Vibration implements MobileAlertState{
    public void work(MobileContext c){
        System.out.println(" Mobile is Vibratiog");
        c.setBrightness(20);
    }
}