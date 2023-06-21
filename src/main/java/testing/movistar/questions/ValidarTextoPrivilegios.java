package testing.movistar.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import testing.movistar.userinterfaces.ValidarEsperaBoton;



public class ValidarTextoPrivilegios implements Question <String> {

    @Override
    public String answeredBy(Actor actor) {

        return ValidarEsperaBoton.LBL_VALIDAR_TEXTOMODAL.resolveFor(actor).getText();
    }
    public static Question<String> value() {
        return new ValidarTextoPrivilegios();
}}