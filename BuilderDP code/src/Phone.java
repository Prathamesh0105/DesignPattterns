public class Phone {
    private String os;
    private int ram;
    private int screenSize;
    
    public Phone(){}
    public Phone(String os,int ram,int screenSize ){
    this.os=os;
    this.ram=ram;
    this.screenSize=screenSize;
}
    public Phone setOS(String s){
        this.os=s;
        return this;
    }
    public Phone setRAM(int s){
        this.ram=s;
        return this;
    }
     
    public Phone setScreenSize(int s){
        this.screenSize=s;
        return this;
    }
    @Override
    public String toString(){
        return "Phone with  "+os+" OS  "+ram+" GB RAM  "+screenSize+"  Inches Screen";
    }
}
