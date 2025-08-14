package OOPsProblemsDay4.TollManagement;

public class Main {
    public static void main(String[] args) {
        Bike.setTollAmount(150);
        Car.setTollAmount(300);
        Truck.setTollAmount(500);
        Vehicle bike = new Bike("KA 28 MN 1947", "Hero Honda");
        Vehicle car = new Car("KA 29 EF 1999", "BMW");
        bike.getVehicleDetails();
        car.getVehicleDetails();
    }
}
