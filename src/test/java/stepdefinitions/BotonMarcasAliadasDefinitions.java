package stepdefinitions;


import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import testing.movistar.drivers.AppiumAndroidDriver;
import testing.movistar.tasks.BMarcasAliadas;

public class BotonMarcasAliadasDefinitions {
    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }
    @Dado("^que el usuario esta en sesion mejorar categorias$")
    public void queElUsuarioEstaEnSesionMejorarCategorias() {
        OnStage.theActorCalled("").can(BrowseTheWeb.with(AppiumAndroidDriver.yourBrowser().onDriver()));
    }


    @Cuando("^da click en el boton marcas aliadas$")
    public void daClickEnElBotonMarcasAliadas() {
        OnStage.theActorInTheSpotlight().attemptsTo(BMarcasAliadas.socialMedia());
    }

    @Entonces("^direcciona a la pantalla privilegios actuales$")
    public void direccionaALaPantallaPrivilegiosActuales() {

    }


    }





