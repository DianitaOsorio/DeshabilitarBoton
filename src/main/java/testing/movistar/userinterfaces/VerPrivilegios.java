package testing.movistar.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class VerPrivilegios {
    public static final Target LST_LINEAS = Target.the("lista desplegable con las lineas a usar")
            .locatedBy("//android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.TextView");
    public static final Target BTN_LINEA_SEL = Target.the("linea a seleccionar")
            .locatedBy("//android.view.View[7]/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.TextView[2]");
    public static final Target BTN_MOVISTARP = Target.the("click en boton MovistarP ")
            .locatedBy("//android.widget.Image[contains(@text,'movistar-preferential')]");
    public static final Target BTN_VER_MIS_PRIVILEGIOS = Target.the("click en boton ver mis privilegios")
            .locatedBy("//android.widget.Button[contains(@text,'VER MIS PRIVILEGIOS')]");
    public static final Target LBL_VALIDAR_TEXTO = Target.the("validar texto")
            .locatedBy("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.TextView[3]");

}
