package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import testing.movistar.drivers.AppiumAndroidDriver;
import testing.movistar.models.DatosDeUsuario;
import testing.movistar.questions.ValidarTextoTradicional;
import testing.movistar.tasks.HomeMovistar;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.CoreMatchers.containsString;

public class LoginStepDefinitions {
    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }
    @Dado("^Diana se encuentra en la app mi movistar$")
    public void dianaSeEncuentraEnLaAppMiMovistar() {
        OnStage.theActorCalled("Diana").can(BrowseTheWeb.with(AppiumAndroidDriver.yourBrowser().onDriver()));

    }

    @Cuando("^Diana digita la siguiente informacion$")
    public void dianaDigitaLaSiguienteInformacion(List <DatosDeUsuario>datosDeUsuarioList) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                HomeMovistar.socialMedia().conEsteUsuario(datosDeUsuarioList.get(0).getUsuario())
                        .yEstaContrasena(datosDeUsuarioList.get(0).getContrasena()));

    }

    @Entonces("^Diana podra ver el Prod Tradicionales en el sitio(.*)$")
    public void dianaPodraVerElProdTradicionalesEnElSitio(String texto) {
        OnStage.theActorInTheSpotlight().should(seeThat(ValidarTextoTradicional.value(), containsString(texto)));
    }

}
