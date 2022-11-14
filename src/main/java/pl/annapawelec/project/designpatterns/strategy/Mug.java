package pl.annapawelec.project.designpatterns.strategy;

public class Mug {
  private Drink drink;

  public Mug(Drink drink) {
    this.drink = drink;
  }

  public void coffeinate(){
    System.out.println("Człowiek pije... ");
    drink.drink();
  }
}
