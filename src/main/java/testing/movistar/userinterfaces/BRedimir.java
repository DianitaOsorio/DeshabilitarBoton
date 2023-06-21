package testing.movistar.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class BRedimir {
    public static final Target LST_LINEAS = Target.the("lista desplegable con las lineas a usar")
            .locatedBy("//android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.TextView");
    public static final Target BTN_LINEA_SEL = Target.the("linea a seleccionar")
            .locatedBy("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View[7]/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.TextView[2]");
    public static final Target BTN_MOVISTARP = Target.the("click en boton MovistarP ")
            .locatedBy("//android.widget.Image[contains(@text,'movistar-preferential')]");
    public static final Target BTN_BLACK= Target.the("click en boton prepago")
            .locatedBy("//android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[5]");
    public static final Target BTN_MARCAS_ALIADAS= Target.the("click en boton marcas aliadas")
            .locatedBy("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[10]");

    public static final Target LBL_TIQUETE_IBERIA= Target.the("click en tiquete iberia")
            .locatedBy("//android.view.View/android.view.View[4]/android.view.View/android.view.View[1]/android.widget.TextView");

    public static final Target BTN_ACEPTAR_TERMINOS= Target.the("click en tiquete iberia")
            .locatedBy("//android.widget.Button[contains(@text,'Aceptar términos y redimir')]");

}
