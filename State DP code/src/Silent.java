public class Silent implements MobileAlertState{
    public void work(MobileContext c){
        System.out.println(" Mobile is silent");
        c.setBrightness(10);
    }
}
