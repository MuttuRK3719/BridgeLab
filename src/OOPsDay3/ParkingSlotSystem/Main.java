package OOPsDay3.ParkingSlotSystem;

public class Main {
    public static void main(String[] args) {
        Car c1 = new Car();
        Truck t1 = new Truck();
        Bike b1 = new Bike();
        ParkingSlotSystem p = new ParkingSlotSystem();
        p.partVehicle(c1);
        p.partVehicle(b1);
        p.partVehicle(t1);
        System.out.println(p.availableParkingSlot());
        System.out.println(p.getRevenue());

    }
}