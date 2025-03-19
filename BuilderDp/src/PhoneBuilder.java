public class PhoneBuilder {
    private String os;
    private int ram;
    private int screenSize;
    private String color;

    public PhoneBuilder setOs(String os) {
        this.os = os;
        return this;
    }

    public PhoneBuilder setRam(int ram) {
        this.ram = ram;
        return this;
    }

    public PhoneBuilder setScreenSize(int screenSize) {
        this.screenSize = screenSize;
        return this;
    }

    public PhoneBuilder setColor(String color) {
        this.color = color;
        return this;
    }

    public Phone getPhone() {
        return new Phone(os, ram, screenSize, color);
    }
}
