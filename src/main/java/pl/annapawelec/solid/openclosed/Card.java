package pl.annapawelec.solid.openclosed;

public class Card implements Payment{
    @Override
    public String pay() {
        return "zapłaciłeś Kartą!";
    }
}
