package pl.annapawelec.project.designpatterns.strategy;

public class Water implements Drink{
  @Override
  public void drink() {
    System.out.println("Pijemy 0mg kofeiny");
  }
}
