package testing.movistar.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class BPrepago {
    public static final Target LST_LINEAS = Target.the("lista desplegable con las lineas a usar")
            .locatedBy("//android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.TextView");
    public static final Target BTN_LINEA_SEL = Target.the("linea a seleccionar")
            .locatedBy("//android.view.View[6]/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.TextView[2]");
    public static final Target BTN_MOVISTARP = Target.the("click en boton MovistarP ")
            .locatedBy("//android.widget.Image[contains(@text,'movistar-preferential')]");
    public static final Target BTN_PREPAGO= Target.the("click en boton prepago")
            .locatedBy("//android.view.View[contains(@text,'Prepago')]");


}
