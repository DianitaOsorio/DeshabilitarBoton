package stepdefinitions;


import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import testing.movistar.drivers.AppiumAndroidDriver;
import testing.movistar.tasks.BBlack;

public class BotonBlackStepDefinitions {
    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^que el usuario esta en el sitio de categorias$")
    public void queElUsuarioEstaEnElSitioDeCategorias() {
        OnStage.theActorCalled("").can(BrowseTheWeb.with(AppiumAndroidDriver.yourBrowser().onDriver()));
    }


    @Cuando("^da click en el boton black$")
    public void daClickEnElBotonBlack() {
        OnStage.theActorInTheSpotlight().attemptsTo(BBlack.socialMedia());
    }

    @Entonces("^direcciona a la pantalla privilegios de black$")
    public void direccionaALaPantallaPrivilegiosDeBlack() {

    }

    }




