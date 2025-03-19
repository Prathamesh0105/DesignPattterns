public class SketchPenFactory extends PenFactory{
    public Refill getRefill(){
        return new Sponge();
    }
    public Tube getTube(){
        return new Fibre();
    }
    public Pen compose(){
        Sketch p=new Sketch();
        p.t=this.getTube();
        p.r=this.getRefill();
        return p;
    }
   }
    
