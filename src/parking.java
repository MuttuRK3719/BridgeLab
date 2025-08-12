// ==================== Interfaces ====================

// Parking-related responsibilities only
interface ParkingLot {
    void parkCar();
    void unparkCar();
    int getCapacity();
}

// Payment-related responsibilities only
interface PaymentService {
    double calculateFee(Car car);
    void doPayment(Car car);
}

// ==================== Implementations ====================

// Free parking: no payment logic needed
class FreeParking implements ParkingLot {

    private int capacity = 50;

    @Override
    public void parkCar() {
        if (capacity > 0) capacity--;
        System.out.println("Car parked. Remaining spots: " + capacity);
    }

    @Override
    public void unparkCar() {
        capacity++;
        System.out.println("Car unparked. Remaining spots: " + capacity);
    }

    @Override
    public int getCapacity() {
        return capacity;
    }
}

// Paid parking: has both parking and payment
class PaidParking implements ParkingLot, PaymentService {

    private int capacity = 30;

    @Override
    public void parkCar() {
        if (capacity > 0) capacity--;
        System.out.println("Car parked. Remaining spots: " + capacity);
    }

    @Override
    public void unparkCar() {
        capacity++;
        System.out.println("Car unparked. Remaining spots: " + capacity);
    }

    @Override
    public int getCapacity() {
        return capacity;
    }

    @Override
    public double calculateFee(Car car) {
        // Example: ₹50 per hour
        return 50 * getHours(car);
    }

    @Override
    public void doPayment(Car car) {
        System.out.println("Paid ₹" + calculateFee(car) + " for car: " + car);
    }

    private int getHours(Car car) {
        // Placeholder: assume 2 hours
        return 2;
    }
}

// ==================== Car Class ====================
class Car {
    private String plateNumber;

    public Car(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    @Override
    public String toString() {
        return plateNumber;
    }
}

// ==================== Test Class ====================
public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("KA-01-AB-1234");

        // Free parking usage
        ParkingLot freeLot = new FreeParking();
        freeLot.parkCar();
        freeLot.unparkCar();

        // Paid parking usage
        PaidParking paidLot = new PaidParking();
        paidLot.parkCar();
        paidLot.doPayment(myCar);
    }
}
