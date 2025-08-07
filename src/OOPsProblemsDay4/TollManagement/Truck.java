package OOPsProblemsDay4.TollManagement;

public class Truck extends Vehicle {
    Truck(String numberPlate, String brand) {
        super(numberPlate, brand);
    }

    @Override
    String getStayBoothTime() {
        return "Truck take 60 seconds to pass toll ";
    }

    @Override
    void getVehicleDetails() {
        System.out.println(getStayBoothTime());
        System.out.println(getNumberPlate());
        System.out.println(getTollAmount());
    }
}
