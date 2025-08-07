package OOPsProblemsDay4.TollManagement;

public class Car extends Vehicle {
    Car(String numberPlate, String brand) {
        super(numberPlate, brand);
    }

    @Override
    String getStayBoothTime() {
        return "Car will take 30 seconds to pass toll ";
    }

    @Override
    void getVehicleDetails() {
        System.out.println(getStayBoothTime());
        System.out.println(getNumberPlate());
        System.out.println(getTollAmount());
    }
}
