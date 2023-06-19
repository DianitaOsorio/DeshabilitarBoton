package stepdefinitions;


import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import testing.movistar.drivers.AppiumAndroidDriver;
import testing.movistar.questions.ValidarTextoPrivilegios;
import testing.movistar.tasks.VerPrivilegios;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

public class VerMisPrivilegiosStepDefinitions {
    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^que el usuario esta en la pantalla principal$")
    public void queElUsuarioEstaEnLaPantallaPrincipal() {
        OnStage.theActorCalled("").can(BrowseTheWeb.with(AppiumAndroidDriver.yourBrowser().onDriver()));
    }


    @Cuando("^da click en el boton ver mis privilegios$")
    public void daClickEnElBotonVerMisPrivilegios() {
        OnStage.theActorInTheSpotlight().attemptsTo(VerPrivilegios.socialMedia());

    }

    @Entonces("^lo debe direccionar al sitio de privilegios$")
    public void loDebeDireccionarAlSitioDePrivilegios() {
        String expectedLBL_VALIDAR_TEXTO ="Tus privilegios2 de 7";
        OnStage.theActorInTheSpotlight().should(seeThat(" validar texto", ValidarTextoPrivilegios.value(),equalTo(expectedLBL_VALIDAR_TEXTO)));

    }


}
