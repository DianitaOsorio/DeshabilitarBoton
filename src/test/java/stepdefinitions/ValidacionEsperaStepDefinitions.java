package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import testing.movistar.drivers.AppiumAndroidDriver;
import testing.movistar.questions.ValidarMensajeModal;
import testing.movistar.questions.ValidarTextoPrivilegios;
import testing.movistar.tasks.ActivarBotonRedimir;
import testing.movistar.tasks.ValidarEsperaBoton;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;


public class ValidacionEsperaStepDefinitions {
    @Dado("^que el usuario esta en la pantalla de redenciones$")
    public void queElUsuarioEstaEnLaPantallaDeRedenciones() {
        OnStage.theActorCalled("").can(BrowseTheWeb.with(AppiumAndroidDriver.yourBrowser().onDriver()));
    }


    @Cuando("^da click al boton se visualiza de color gris$")
    public void daClickAlBotonSeVisualizaDeColorGris() {
        OnStage.theActorInTheSpotlight().attemptsTo(ValidarEsperaBoton.socialMedia());
    }

    @Entonces("^se debe esperar unos segundos que se active el boton$")
    public void seDebeEsperarUnosSegundosQueSeActiveElBoton() {

    }

    @Cuando("^se le da click varias veces$")
    public void seLeDaClickVariasVeces() {

    }

    @Entonces("^validar que se visualice de color azul y luego se visualiza modal$")
    public void validarQueSeVisualiceDeColorAzulYLuegoSeVisualizaModal() {
        String expectedLBL_VALIDAR_TEXTOMODAL ="Disfruta ofertas exclusivas en comida, ropa, obsequios, eventos y mucho más para ti!";
        OnStage.theActorInTheSpotlight().should(seeThat(" validar texto modal", ValidarMensajeModal.value(),equalTo(expectedLBL_VALIDAR_TEXTOMODAL)));

    }



}
