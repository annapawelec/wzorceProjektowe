package pl.annapawelec.solid.singleresponsibilityprinciple;

import pl.annapawelec.project.designpatterns.strategy.Water;

public class Kettle {
// zapytac czy mozna pomimo buildera zrobic settery,
// bo przeciez chce zrobic update temperatury
// na water ale nie mam settera
    public String boilWater() {
        return "boiled water";
    }
}
