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
import static testing.movistar.userinterfaces.VerPrivilegios.*;

public class VerPrivilegios implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(LST_LINEAS, isVisible()).forNoMoreThan(200).seconds(),
                Click.on(LST_LINEAS),
                ScrollDown.on(),
                ScrollUp.on(),
                ExplicitWait.here(10),
                Click.on(BTN_LINEA_SEL),
                ExplicitWait.here(10),
                ScrollDown.on(),
                ScrollUp.on(),
                ScrollUp.on(),
                WaitUntil.the(BTN_MOVISTARP, isVisible()).forNoMoreThan(200).seconds(),
                Click.on(BTN_MOVISTARP),
                ExplicitWait.here(10),
                Click.on(BTN_VER_MIS_PRIVILEGIOS),
                ExplicitWait.here(10)

                );
    }

    public static VerPrivilegios socialMedia() {
        return Instrumented.instanceOf(VerPrivilegios.class).withProperties();
    }
}