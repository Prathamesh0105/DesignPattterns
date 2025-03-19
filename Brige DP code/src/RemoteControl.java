//Abstraction
public abstract class RemoteControl{   //this is second part of bridge
    protected TV implementor;          
    protected RemoteControl(TV tv){
      this.implementor = tv;
    }
    public void on(){      
        implementor.on();   
    }   
    public void off(){      
        implementor.off();   
    }      
    public void setChannel(int channel){   
        implementor.tuneChannel(channel);   
    }
}
