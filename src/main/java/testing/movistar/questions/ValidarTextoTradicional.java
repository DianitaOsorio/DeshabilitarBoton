package testing.movistar.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import testing.movistar.userinterfaces.HomeMovistar;

public class ValidarTextoTradicional implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return HomeMovistar.LBL_VALIDACION.resolveFor(actor).getText();
    }
    public static Question<String> value() {
        return new ValidarTextoTradicional();
    }
}

