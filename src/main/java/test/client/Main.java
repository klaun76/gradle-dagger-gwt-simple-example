package test.client;

import com.google.gwt.core.client.EntryPoint;
import test.client.coffee.CoffeeApp;

import java.util.logging.Logger;

/**
 * Created by martinliptak on 20/04/16.
 */
public class Main implements EntryPoint {
    @Override
    public void onModuleLoad() {
        Logger.getLogger("Test").info("GWT-loaded");
        CoffeeApp.main(null);
    }
}