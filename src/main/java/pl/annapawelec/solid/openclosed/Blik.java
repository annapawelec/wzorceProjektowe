package pl.annapawelec.solid.openclosed;

public class Blik implements Payment{

    @Override
    public String pay() {
        return "zapłaciłeś Blikiem!";
    }
}
