package co.com.choucair.certification.testjoin.userinteraface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class TestLoginPage extends PageObject {

    public static final Target BUTTON_LOGIN= Target.the("Selecciona el boton Join Today").located(By.className("unauthenticated-nav-bar__sign-up"));


}
