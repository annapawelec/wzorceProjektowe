package pl.annapawelec.solid.openclosed;

public class BankTransfer implements Payment{
    @Override
    public String pay() {
        return "zaplaciles przelewem bankowym!";
    }
}
