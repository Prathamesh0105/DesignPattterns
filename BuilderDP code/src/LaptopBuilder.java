public class LaptopBuilder {
    private String os;
    private int ram;
    private int screenSize;
    
    public LaptopBuilder setOS(String s)
    {
        this.os=s;
        return this;
    }
    public LaptopBuilder setRAM(int s)
    {
        this.ram=s;
        return this;
    }
    public LaptopBuilder setScreenSize(int s)
    {
        this.screenSize=s;
        return this;
    }
    public Laptop getgadget()
    {
        return new Laptop(os, ram, screenSize);
    }
}
