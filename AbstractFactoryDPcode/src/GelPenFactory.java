public class GelPenFactory extends PenFactory{
    public Refill getRefill(){
        return new Plastic();
    }
    public Tube getTube(){
        return new Metal();
    }
    public Pen compose(){
        Gel p=new Gel();
        p.t=this.getTube();
        //System.out.print(p.t.getTube());
        p.r=this.getRefill();
        return p;
    }
    }
    
