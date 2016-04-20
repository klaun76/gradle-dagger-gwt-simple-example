package test.client.coffee;

import java.util.logging.Logger;

class ElectricHeater implements Heater {
  boolean heating;

  @Override public void on() {
    Logger.getLogger("Test").fine("~ ~ ~ heating ~ ~ ~");
    this.heating = true;
  }

  @Override public void off() {
    this.heating = false;
  }

  @Override public boolean isHot() {
    return heating;
  }
}
