public class PhoneBuilder implements Builder{
    Phone ph=new Phone();
    public PhoneBuilder setOS(String s)
    {
        this.ph.setOS(s);
        return this;
    }
    public PhoneBuilder setRAM(int s)
    {
        this.ph.setRAM(s);
        return this;
    }
    public PhoneBuilder setScreenSize(int s)
    {
        this.ph.setScreenSize(s);
        return this;
    }
    public Phone getgadget()
    {
        return this.ph;
    }
}
/* Compose objects rather than its members
public class PhoneBuilder {       
    private String os;
    private int ram;
    private int screenSize;
    
    public PhoneBuilder setOS(String s)
    {
        this.os=s;
        return this;
    }
    public PhoneBuilder setRAM(int s)
    {
        this.ram=s;
        return this;
    }
    public PhoneBuilder setScreenSize(int s)
    {
        this.screenSize=s;
        return this;
    }
    public Phone getPhone()
    {
        return new Phone(os, ram, screenSize);
    }
}
*/