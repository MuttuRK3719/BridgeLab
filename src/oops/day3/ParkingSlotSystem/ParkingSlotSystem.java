package OOPsDay3.ParkingSlotSystem;

public class ParkingSlotSystem {
    Vehicle []vehicles=new Vehicle[10];
    int index=0;
    public void partVehicle(Vehicle v){
        vehicles[index++]=v;
    }
    public String availableParkingSlot(){
        return "Available parking slotes are : "+(vehicles.length-index);
    }
    public double getRevenue(){
        double bikeCharge=50;
        double carCharge=100;
        double truckCharge=200;
        double charges=0;
        for (int i = 0; i < index; i++) {
            if(vehicles[i] instanceof Bike) charges+=bikeCharge;
            else if(vehicles[i] instanceof Car) charges+=carCharge;
            else if(vehicles[i] instanceof Truck)charges+=truckCharge;
        }
        return charges;
    }

}
