public class  PenFactory {
    public Pen getPen(String PenType){
    if(PenType == null){
        return null;
    }
    if(PenType.equalsIgnoreCase("GEL")){ 
        GelPenFactory pf=new GelPenFactory(); 
        return pf.compose();
    }
    if(PenType.equalsIgnoreCase("SKETCH")){ 
        SketchPenFactory pf=new SketchPenFactory(); 
        return pf.compose();
    }
    return null;
}
}
    

