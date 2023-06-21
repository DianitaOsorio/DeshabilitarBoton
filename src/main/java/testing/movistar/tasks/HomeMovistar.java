package testing.movistar.tasks;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import testing.movistar.interactions.ExplicitWait;
import testing.movistar.utils.ExcelDatatable;

import java.util.ArrayList;
import java.util.Map;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static testing.movistar.userinterfaces.HomeMovistar.*;

public class HomeMovistar implements Task {  //se implementa las acciones sobre los elementos
    private String usuario;
    private String contrasena;

    public ArrayList<Map<String, String>> dataExcel;

    @Override
    //constructor del actor
    public <T extends Actor> void performAs(T actor) {
        try {

            dataExcel = ExcelDatatable.ReadData("data.xlsx", "Sheet1");

        } catch (Exception e) {

        }
        //interactua con la interfaz del usuario
        actor.attemptsTo(
                WaitUntil.the(BTN_INICIO, isVisible()).forNoMoreThan(200).seconds(),
                Click.on(BTN_INICIO),
                Click.on(BTN_USUARIO),
                ExplicitWait.here(6),
                Enter.theValue(dataExcel.get(0).get("usuario")).into(TXT_USUARIO),
                ExplicitWait.here(6),
                Enter.theValue(dataExcel.get(0).get("contrasena")).into(TXT_CONTRASENA),
                ExplicitWait.here(6),
                Click.on(CHECK_CAPTCHA),
                ExplicitWait.here(6),
                Click.on(BTN_INICIARSESION),
                ExplicitWait.here(25),
                WaitUntil.the(LBL_VALIDACION, isVisible()).forNoMoreThan(300).seconds()

        );
    }

    //constructor que nos permite llamar los metodos
    public static HomeMovistar socialMedia() {
        return Instrumented.instanceOf(HomeMovistar.class).withProperties();
    }

    public HomeMovistar conEsteUsuario(String usuario) {
        this.usuario = usuario;
        return this;
    }

    public HomeMovistar yEstaContrasena(String contrasena) {
        this.contrasena = contrasena;
        return this;
    }
}
