package OOPsProblemsDay4.TollManagement;

public abstract class Vehicle {
    private static double tollAmount;
    private final String numberPlate;
    private final String brand;

    Vehicle(String numberPlate, String brand) {
        this.numberPlate = numberPlate;
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public String getNumberPlate() {
        return numberPlate;
    }

    public String getTollAmount() {
        return "Amount required to toll is: " + tollAmount;
    }


    public static void setTollAmount(double tollAmount) {
        Vehicle.tollAmount = tollAmount;
    }

    abstract String getStayBoothTime();

    abstract void getVehicleDetails();
}
