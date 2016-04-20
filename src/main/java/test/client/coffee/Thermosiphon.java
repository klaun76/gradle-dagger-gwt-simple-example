package test.client.coffee;

import javax.inject.Inject;
import java.util.logging.Logger;

class Thermosiphon implements Pump {
  private final Heater heater;

  @Inject
  Thermosiphon(Heater heater) {
    this.heater = heater;
  }

  @Override public void pump() {
    if (heater.isHot()) {
      Logger.getLogger("Test").fine("=> => pumping => =>");
    }
  }
}
