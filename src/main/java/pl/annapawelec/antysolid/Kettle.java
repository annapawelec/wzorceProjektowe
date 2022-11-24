package pl.annapawelec.antysolid;

// single responsibility principle
public class Kettle {
    public void boilWater(){
        System.out.println("boiled water");
    }
    public String singSong(){
        return "singing song.. lalala";
    }
    public void playChess(){
        System.out.println("playing chess..");
    }
    public void feedBirds(){
        System.out.println("feeding birds");
    }
}
