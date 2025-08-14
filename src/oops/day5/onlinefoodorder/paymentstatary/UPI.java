package oops.day5.onlinefoodorder;

public class UPI implements Payments{

    @Override
    public void paymentDoneBy(Payments p) {
        System.out.println("Payment is done by using UPI ");
    }
}
