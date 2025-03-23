public class MobileContext {
    MobileAlertState state;
    int brightness;
    public MobileContext(){
        state= new Ringer();
    }
    public void setState(MobileAlertState s){
        state=s;
    }
    public MobileAlertState getState(){
        return state;
    }
    public void setBrightness(int b){
        brightness=b;
    }
    public int getBrightness(){
        return brightness;
    }
    public void work(){
        System.out.println(" checking the current Context state and working accordingly \n");
        state.work(this); // can access the other information of object/context to actually make object work accordingly
    }
}
