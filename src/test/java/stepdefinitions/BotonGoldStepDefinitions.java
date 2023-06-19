package stepdefinitions;


import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import testing.movistar.drivers.AppiumAndroidDriver;
import testing.movistar.tasks.BGold;

public class BotonGoldStepDefinitions {
    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^que el usuario esta en la sesion categorias$")
    public void queElUsuarioEstaEnLaSesionCategorias() {
        OnStage.theActorCalled("").can(BrowseTheWeb.with(AppiumAndroidDriver.yourBrowser().onDriver()));
    }


    @Cuando("^da click en el boton Gold$")
    public void daClickEnElBotonGold() {
        OnStage.theActorInTheSpotlight().attemptsTo(BGold.socialMedia());
    }

    @Entonces("^direcciona a la pantalla privilegios de gold$")
    public void direccionaALaPantallaPrivilegiosDeGold() {

    }

    }




