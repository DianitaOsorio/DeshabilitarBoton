package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import testing.movistar.drivers.AppiumAndroidDriver;
import testing.movistar.tasks.BTerminosRedimir;

public class BotonAceptarTerminos {
    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^que el usuario esta en el sitio$")
    public void que_el_usuario_esta_en_el_sitio() {
        OnStage.theActorCalled("").can(BrowseTheWeb.with(AppiumAndroidDriver.yourBrowser().onDriver()));
    }

    @Cuando("^da click en  boton black$")
    public void da_click_en_boton_black() {
            OnStage.theActorInTheSpotlight().attemptsTo(BTerminosRedimir.socialMedia());
        }


    @Entonces("^lo direcciona a la pantalla de beneficios$")
    public void lo_direcciona_a_la_pantalla_de_beneficios() {

    }

    @Cuando("^el usuario escoge un benficio$")
    public void el_usuario_escoge_un_benficio() {

    }

    @Entonces("^da click en aceptar terminos y redimir exitosamente$")
    public void da_click_en_aceptar_terminos_y_redimir_exitosamente() {

    }
}
