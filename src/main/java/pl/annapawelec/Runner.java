package pl.annapawelec;

import pl.annapawelec.builder.Water;

public class Runner {
    public static void main(String[] args) {
        Water water = new Water.WaterBuilder()
                .setName("woda")
                .setCalciumLevel(100)
                .setFluorLevel(50)
                .build();
        System.out.println(water);
    }
}
