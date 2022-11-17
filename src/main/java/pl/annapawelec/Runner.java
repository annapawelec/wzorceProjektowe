package pl.annapawelec;


import pl.annapawelec.project.designpatterns.strategy.Coffee;
import pl.annapawelec.project.designpatterns.strategy.Drink;
import pl.annapawelec.project.designpatterns.strategy.Mug;
import pl.annapawelec.project.designpatterns.strategy.Water;

public class Runner {
    public static void main(String[] args) {
//        Water water = new Water.WaterBuilder()
//                .setName("woda")
//                .setCalciumLevel(100)
//                .setFluorLevel(50)
//                .build();
//        System.out.println(water);
        Drink water = new Coffee();
        Mug mug = new Mug(water);
        mug.coffeinate();
    }
}
