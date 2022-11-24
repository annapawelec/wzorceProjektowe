package pl.annapawelec.antysolid;

public class Payment {

    public String pay(String paymentMethod){
        if(paymentMethod.equals("Card")){
            return "zapłaciłeś kartą";
        } else if (paymentMethod.equals("Kettle")) {
            return "zapłaciłeś czajnikiem!";
        } else if (paymentMethod.equals("Blik")) {
            return "zapłaciłeś blikiem!";
        }
        return "nie zapłaciłeś!";
    }


}
