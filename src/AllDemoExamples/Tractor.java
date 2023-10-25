package AllDemoExamples;

abstract class Vehicle
{
   public abstract void engine();
}
public class Tractor extends Vehicle {

    public void engine()
    {
        System.out.println("Car engine");
    }

    public static void main(String[] args)
    {
        Vehicle v = new Tractor();
        v.engine();
    }
}
