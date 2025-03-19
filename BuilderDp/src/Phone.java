public class Phone {
    String os;
    int ram;
    int screenSize;
    String color;

    public Phone(String os, int ram, int screenSize, String color) {
        this.os = os;
        this.ram = ram;
        this.screenSize = screenSize;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Phone---> [OS:" + os + " RAM: " + ram + " SCREEN SIZE: " + screenSize + " COLOR: " + color + "]";
    }
}
