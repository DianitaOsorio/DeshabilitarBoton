package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import testing.movistar.drivers.AppiumAndroidDriver;
import testing.movistar.tasks.ActivarBotonRedimir;


public class ActivarBotonRedencionStepDefinitions {
    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }
    @Dado("^que el usuario esta en el sitio de preferencial$")
    public void queElUsuarioEstaEnElSitioDePreferencial() {
        OnStage.theActorCalled("").can(BrowseTheWeb.with(AppiumAndroidDriver.yourBrowser().onDriver()));
    }


    @Cuando("^da click al boton de aceptar terminos y redimir$")
    public void daClickAlBotonDeAceptarTerminosYRedimir() {
        OnStage.theActorInTheSpotlight().attemptsTo(ActivarBotonRedimir.socialMedia());
    }

    @Entonces("^se debe activar el boton$")
    public void seDebeActivarElBoton() {

    }



}
