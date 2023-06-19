package stepdefinitions;


import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import testing.movistar.drivers.AppiumAndroidDriver;
import testing.movistar.tasks.BMejoraCategoria;

public class BotonMejorarCStepDefinitions {
    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^que el usuario en la sesion conocer categorias$")
    public void queElUsuarioEnLaSesionConocerCategorias() {
        OnStage.theActorCalled("").can(BrowseTheWeb.with(AppiumAndroidDriver.yourBrowser().onDriver()));
    }


    @Cuando("^da click en el boton mejora tu categoria$")
    public void daClickEnElBotonMejoraTuCategoria() {
        OnStage.theActorInTheSpotlight().attemptsTo(BMejoraCategoria.socialMedia());
    }

    @Entonces("^direcciona a la pantalla como mejorar categoria$")
    public void direccionaALaPantallaComoMejorarCategoria() {

    }
    }




