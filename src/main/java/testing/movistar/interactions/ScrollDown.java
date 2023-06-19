package testing.movistar.interactions;

import io.appium.java_client.MobileBy;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

import static testing.movistar.drivers.AppiumAndroidDriver.driver;

public class ScrollDown implements Interaction {


    @Override
    public <T extends Actor> void performAs(T actor) {
        driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(15)"));

    }

    public static ScrollDown on(){
        return Instrumented.instanceOf(ScrollDown.class).withProperties();
    }
}
