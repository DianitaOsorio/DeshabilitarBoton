package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import testing.movistar.drivers.AppiumAndroidDriver;

import testing.movistar.tasks.NoticiaServicios;

public class SesionNoticiaStepDefinitions {

    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }
    @Dado("^que el usuario esta en el home de movistar preferencial$")
    public void queElUsuarioEstaEnElHomeDeMovistarPreferencial() {
        OnStage.theActorCalled("").can(BrowseTheWeb.with(AppiumAndroidDriver.yourBrowser().onDriver()));

    }

    @Cuando("^visualiza la preview de la sesion noticias$")
    public void visualizaLaPreviewDeLaSesionNoticias() {
        OnStage.theActorInTheSpotlight().attemptsTo(NoticiaServicios.socialMedia());

    }

    @Entonces("^da click en el boton conoce mas$")
    public void daClickEnElBotonConoceMas() {

    }

    @Entonces("^lo direcciona a la pantalla principal de la noticia$")
    public void loDireccionaALaPantallaPrincipalDeLaNoticia() {

    }


}
