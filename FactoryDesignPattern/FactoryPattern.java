public class FactoryPattern {
    public static void main(String[] args) {
        
        ShapeFactory obj=new ShapeFactory();
        Shape s=obj.getShape("Square");
        s.draw();
    }
}
