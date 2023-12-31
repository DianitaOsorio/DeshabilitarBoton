package testing.movistar.interactions;

import static testing.movistar.drivers.AppiumAndroidDriver.driver;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;

import org.openqa.selenium.InvalidSelectorException;

import io.appium.java_client.MobileBy;

public class SearchScroll implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            driver.findElement(MobileBy.AndroidUIAutomator(
                    "new UiScrollable(new UiSelector().scrollable(true))" +
                            ".scrollIntoView(new UiSelector().textContains('3160482421'))"));
        } catch (InvalidSelectorException e) {

        }
    }
    public static Performable on(){
        return Instrumented.instanceOf(SearchScroll.class).withProperties();
    }
}
