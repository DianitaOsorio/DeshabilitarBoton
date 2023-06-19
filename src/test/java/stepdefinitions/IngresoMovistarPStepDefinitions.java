package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import testing.movistar.drivers.AppiumAndroidDriver;
import testing.movistar.tasks.Ingreso;

public class IngresoMovistarPStepDefinitions {

    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }
    @Dado("^que el usuario ingrese a la aplicacion de mi movistar$")
    public void queElUsuarioIngreseALaAplicacionDeMiMovistar() {
        OnStage.theActorCalled("").can(BrowseTheWeb.with(AppiumAndroidDriver.yourBrowser().onDriver()));
    }


    @Cuando("^da click en el boton movistar preferencial$")
    public void daClickEnElBotonMovistarPreferencial() {
        OnStage.theActorInTheSpotlight().attemptsTo(Ingreso.socialMedia());
    }

    @Entonces("^lo direcciona al home de movistar preferencial$")
    public void loDireccionaAlHomeDeMovistarPreferencial() {

    }

}
