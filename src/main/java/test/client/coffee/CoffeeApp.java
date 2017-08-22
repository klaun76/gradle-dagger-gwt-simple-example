package test.client.coffee;

import dagger.Component;
import elemental.client.Browser;
import elemental.dom.Element;
import elemental.html.DivElement;

import javax.inject.Singleton;

public class CoffeeApp {
    public static void testoutput(String output) {
        Element oElement = Browser.getDocument().getElementById("output");
        DivElement divElement = Browser.getDocument().createDivElement();
        divElement.setInnerText(output);
        oElement.appendChild(divElement);
    }

    @Singleton
  @Component(modules = { DripCoffeeModule.class })
  public interface Coffee {
    CoffeeMaker maker();
  }

  public static void main(String[] args) {
    Coffee coffee = DaggerCoffeeApp_Coffee.builder().build();
    coffee.maker().brew();
  }
}
