package test.client.coffee;

import dagger.Lazy;
import javax.inject.Inject;
import java.util.logging.Logger;

class CoffeeMaker {
  private final Lazy<Heater> heater; // Create a possibly costly heater only when we use it.
  private final Pump pump;

  @Inject CoffeeMaker(Lazy<Heater> heater, Pump pump) {
    this.heater = heater;
    this.pump = pump;
  }

  public void brew() {
    heater.get().on();
    pump.pump();
    Logger.getLogger("Test").fine(" [_]P coffee! [_]P ");
    heater.get().off();
  }
}
