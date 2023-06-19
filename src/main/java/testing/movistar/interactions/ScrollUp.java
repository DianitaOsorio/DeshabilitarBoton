package testing.movistar.interactions;

import io.appium.java_client.MobileBy;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

import static testing.movistar.drivers.AppiumAndroidDriver.driver;

public class ScrollUp implements Interaction {
    @Override
    public <T extends Actor> void performAs(T t) {
        driver.findElement(MobileBy.AndroidUIAutomator( "new UiScrollable(new UiSelector().scrollable(true)).scrollToBeginning(1)"));
    }

    public static ScrollUp on(){
        return Instrumented.instanceOf(ScrollUp.class).withProperties();
    }

}
