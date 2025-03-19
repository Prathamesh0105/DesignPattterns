abstract class Refill{
    abstract String getRefill();
}
class Plastic extends Refill{

    @Override
    public String getRefill() {
        return "Plastic Refill created";
    }
}
class Sponge extends Refill{

    @Override
    public String getRefill() {
        return "Sponge Refill created";
    }
}