package AllDemoExamples.InterfaceExamples.InterfaceExamples;

public interface Vehicle {
    void mileage(int litres, int kilometres);

    void vehicleDetails(String name, String model, String mfgYear, String maxSpeed);
}

class Bike implements Vehicle {
    @Override
    public void mileage(int litres, int kilometres) {
        int mileage = kilometres / litres;
        System.out.println("mileage : " + mileage);
    }

    @Override
    public void vehicleDetails(String name, String model, String mfgYear, String maxSpeed) {
        System.out.println("bikeName : " + name);
        System.out.println("bikemodel : " + model);
        System.out.println("bikemfgyear : " + mfgYear);
        System.out.println("maxspeed : " + maxSpeed);
    }
        public static void main(String[] args) {
        Bike obj = new Bike();
        obj.vehicleDetails("R15", "2-2-2003", "2023", "150");
        obj.mileage(15, 150);
    }
}
