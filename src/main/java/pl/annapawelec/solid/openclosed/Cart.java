package pl.annapawelec.solid.openclosed;

public class Cart {
    public void payForItems(Payment payment){
        payment.pay();
    }
}
