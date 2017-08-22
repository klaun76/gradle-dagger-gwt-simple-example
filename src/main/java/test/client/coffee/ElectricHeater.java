package test.client.coffee;

class ElectricHeater implements Heater {
  boolean heating;

  @Override public void on() {
    CoffeeApp.testoutput("~ ~ ~ heating ~ ~ ~");
    this.heating = true;
  }

  @Override public void off() {
    this.heating = false;
  }

  @Override public boolean isHot() {
    return heating;
  }
}
