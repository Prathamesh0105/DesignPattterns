public class Laptop {
   
    private String os="Android";
    private int ram=1;
    private int screenSize=5;
    
    public Laptop(){}
    public Laptop(String os,int ram,int screenSize ){
    this.os=os;
    this.ram=ram;
    this.screenSize=screenSize;
}
    public Laptop setOS(String s){
        this.os=s;
        return this;
    }
    public Laptop setRAM(int s){
        this.ram=s;
        return this;
    }
     
    public Laptop setScreenSize(int s){
        this.screenSize=s;
        return this;
    }
    public String toString(){
        return "Laptop with  "+os+" OS  "+ram+" GB RAM  "+screenSize+"  Inches Screen";
    }
}
