public class Factorymain {
    public static void main(String[] args) {
        ShapeFactory sF=new ShapeFactory();
        Shape c=sF.getShape("CIRCLE");
        c.draw();  
    }
    
}
