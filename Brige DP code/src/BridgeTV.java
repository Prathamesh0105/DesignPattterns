
public class BridgeTV {
    public static void main(String[] args) {
     RemoteControl remoteControl = new ConcreteRemote(new PhilipsTV(),1);
        remoteControl.on();
        remoteControl.off();
        remoteControl.setChannel(443);
        
    }
}
