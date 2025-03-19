abstract class Tube{
 abstract String getTube();
}
class Metal extends Tube{
    @Override
    public String getTube(){
        return "Metal Tube created";
    }
}
class Fibre extends Tube{
    @Override
    public String getTube(){
        return "Fibre Tube created";
    }
}