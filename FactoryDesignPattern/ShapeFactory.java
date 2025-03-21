public class ShapeFactory extends Shape {

    public Shape getShape(String s){
        switch(s){
            case "Circle":
                return new Circle();
            case "Square":
                return new Square();
            default:
                return null;
        }

    }
}
