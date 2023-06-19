package testing.movistar.tasks;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import testing.movistar.interactions.ExplicitWait;
import testing.movistar.interactions.ScrollDown;
import testing.movistar.interactions.ScrollUp;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static testing.movistar.userinterfaces.BTerminosRedimir.*;

public class BTerminosRedimir implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(LST_LINEAS, isVisible()).forNoMoreThan(200).seconds(),
                Click.on(LST_LINEAS),
                ScrollDown.on(),
                //ScrollUp.on(),
                ExplicitWait.here(10),
                Click.on(BTN_LINEA_SEL),
                ExplicitWait.here(10),
                ScrollDown.on(),
                ScrollUp.on(),
                ScrollUp.on(),
                WaitUntil.the(BTN_MOVISTARP, isVisible()).forNoMoreThan(200).seconds(),
                Click.on(BTN_MOVISTARP),
                ExplicitWait.here(10),
                Click.on(BTN_BLACK),
                ExplicitWait.here(6),
                ScrollDown.on(),
                Click.on(BTN_MARCAS_ALIADAS),
                ExplicitWait.here(10),
                Click.on(LBL_TIQUETE_IBERIA),
                ExplicitWait.here(10),
                Click.on(BTN_ACEPTAR_TERMINOS),
                ExplicitWait.here(6)


        );
//        TouchAction touchAction = new TouchAction(BrowseTheWeb.as(T actor).getDriver());
//        touchAction.tap(100).perform();
    }

    public static BTerminosRedimir socialMedia() {
        return Instrumented.instanceOf(BTerminosRedimir.class).withProperties();
    }

}