package testing.movistar.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class HomeMovistar {
    public static final Target BTN_INICIO = Target.the("boton inicio sesion")
            .locatedBy("//android.widget.Button[contains(@text,'Iniciar sesión')]");
    public static final Target BTN_USUARIO = Target.the("boton usuario")
            .locatedBy("//android.widget.Button[contains(@text,'Con usuario y contraseña')]");
    public static final Target TXT_USUARIO = Target.the("usuario")

            .locatedBy("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.widget.EditText");


    public static final Target TXT_CONTRASENA = Target.the("contrasena")
            .locatedBy("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[1]/android.view.View[1]/android.view.View[2]/android.widget.EditText");

    public static final Target CHECK_CAPTCHA = Target.the("checkbox captcha")
            .locatedBy("//android.view.View[1]/android.view.View[1]/android.view.View/android.widget.CheckBox");

    public static final Target BTN_INICIARSESION = Target.the("iniciar la sesion")
            .locatedBy("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[1]/android.view.View[1]/android.widget.Button");


    public static final Target LBL_VALIDACION = Target.the("validar el texto")
            .locatedBy("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[1]/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.TextView");

}
