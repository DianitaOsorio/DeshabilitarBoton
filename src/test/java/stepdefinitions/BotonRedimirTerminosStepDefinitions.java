package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import testing.movistar.drivers.AppiumAndroidDriver;
import testing.movistar.tasks.BRedimir;
import testing.movistar.tasks.BTerminosRedimir;

public class BotonRedimirTerminosStepDefinitions {
    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^que el usuario esta en el home de preferencial$")
    public void queElUsuarioEstaEnElHomeDePreferencial() {
        OnStage.theActorCalled("").can(BrowseTheWeb.with(AppiumAndroidDriver.yourBrowser().onDriver()));
    }


    @Cuando("^la app lo direcciona a el sitio de  redenciones$")
    public void laAppLoDireccionaAElSitioDeRedenciones() {
        OnStage.theActorInTheSpotlight().attemptsTo(BRedimir.socialMedia());
    }

    @Entonces("^da click en aceptar terminos y se deshabilita el boton$")
    public void daClickEnAceptarTerminosYSeDeshabilitaElBoton() {

    }


}
