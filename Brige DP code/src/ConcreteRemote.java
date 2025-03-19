//Refined abstraction
public class ConcreteRemote extends RemoteControl{   
    private int currentChannel;       
    ConcreteRemote(TV tv, int channel){
        super(tv);
        this.currentChannel=channel;
    }
    //functionalities not supported are below
    public void nextChannel(){       
        currentChannel++;   
        setChannel(currentChannel);   
    }      
    public void prevChannel(){       
        currentChannel--;   
        setChannel(currentChannel);   
    }      
}
