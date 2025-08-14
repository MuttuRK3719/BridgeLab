package OOPsProblemsDay4.TollManagement;

public class Bike extends Vehicle {
    Bike(String numberPlate, String brand) {
        super(numberPlate, brand);
    }

    @Override
    String getStayBoothTime() {
        return "Bike will take 15 seconds to pass toll ";
    }

    @Override
    void getVehicleDetails() {
        System.out.println(getStayBoothTime());
        System.out.println(getNumberPlate());
        System.out.println(getTollAmount());
    }
}
