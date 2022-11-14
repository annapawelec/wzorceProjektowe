package pl.annapawelec.project.designpatterns.strategy;

public class Coffee implements Drink{
  @Override
  public void drink() {
    System.out.println("pijemy 5mg kofeiny");
  }
}
