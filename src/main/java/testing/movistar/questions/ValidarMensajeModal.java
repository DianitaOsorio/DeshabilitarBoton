package testing.movistar.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import testing.movistar.userinterfaces.VerPrivilegios;


public class ValidarMensajeModal implements Question <String> {

    @Override
    public String answeredBy(Actor actor) {

        return VerPrivilegios.LBL_VALIDAR_TEXTO.resolveFor(actor).getText();
    }
    public static Question<String> value() {
        return new ValidarMensajeModal();
}}