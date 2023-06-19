package stepdefinitions;


import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import testing.movistar.drivers.AppiumAndroidDriver;
import testing.movistar.tasks.HRedenciones;

public class HistoricoRedencionesStepDefinitions {
    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }
    @Dado("^que el usuario esta en la pantalla principal de preferencial$")
    public void queElUsuarioEstaEnLaPantallaPrincipalDePreferencial() {
        OnStage.theActorCalled("").can(BrowseTheWeb.with(AppiumAndroidDriver.yourBrowser().onDriver()));
    }


    @Cuando("^da click en el boton historial de redenciones$")
    public void daClickEnElBotonHistorialDeRedenciones() {
        OnStage.theActorInTheSpotlight().attemptsTo(HRedenciones.socialMedia());

    }

    @Entonces("^lo debe direccionar al sitio del historico$")
    public void loDebeDireccionarAlSitioDelHistorico() {

    }


}
