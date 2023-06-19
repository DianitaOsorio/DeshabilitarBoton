package stepdefinitions;


import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import testing.movistar.drivers.AppiumAndroidDriver;
import testing.movistar.tasks.BPrepago;

public class BotonPrepagoStepDefinitions {
    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }
    @Dado("^que el usuario esta en la sesion nuestras categorias$")
    public void queElUsuarioEstaEnLaSesionNuestrasCategorias() {
        OnStage.theActorCalled("").can(BrowseTheWeb.with(AppiumAndroidDriver.yourBrowser().onDriver()));
    }


    @Cuando("^da click en el boton prepago$")
    public void daClickEnElBotonPrepago() {
        OnStage.theActorInTheSpotlight().attemptsTo(BPrepago.socialMedia());
    }

    @Entonces("^direcciona a la pantalla privilegios de prepago$")
    public void direccionaALaPantallaPrivilegiosDePrepago() {

    }



}
