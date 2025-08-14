package oops.day5.onlinefoodorder;

public class CreditCard implements Payments {

    @Override
    public void paymentDoneBy(Payments p) {
        System.out.println("Payment done by using credit card ");
    }
}
