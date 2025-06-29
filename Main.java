abstract class Logistics{
    String name;
}
abstract class Factory{
    public abstract Logistics createLogistic();
}
class TruckFactory extends Factory{
    public Logistics createLogistic(){
        return new Truck();
    }
}
class BoatFactory extends Factory{
    public Logistics createLogistic(){
        return new Boat();
    }
}
class PlaneFactory extends Factory{
    public Logistics createLogistic(){
        return new Plane();
    }
}
class Truck extends Logistics{
    String name="Грузовик";
}
class Boat extends Logistics{
    String name="Лодка";
}
class Plane extends Logistics{
    String name="Самолет";
}
public class Main {
    public static void main(String[] args) {
    }
}