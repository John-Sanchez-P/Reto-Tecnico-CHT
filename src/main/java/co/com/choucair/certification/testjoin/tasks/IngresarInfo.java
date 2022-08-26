package co.com.choucair.certification.testjoin.tasks;

import co.com.choucair.certification.testjoin.userinteraface.IngresarInfoPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import org.openqa.selenium.By;

public class IngresarInfo implements Task {

    public static String ENTER_BUTTON;

    public static IngresarInfo onThePage() {
        return Tasks.instrumented(IngresarInfo.class);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue("John").into(IngresarInfoPage.SELECT_CAMPONAME));
        actor.attemptsTo(Enter.theValue("Sanchez").into((IngresarInfoPage.SELECT_CAMPOLASTNAME)));
        actor.attemptsTo(Enter.theValue("ejemplo2022@hotmail.com").into(IngresarInfoPage.SELECT_EMAIL));
        actor.attemptsTo(SelectFromOptions.byVisibleText("December").from(By.cssSelector("select#birthMonth")));
        actor.attemptsTo(SelectFromOptions.byVisibleText("5").from(By.cssSelector("select#birthDay")));
        actor.attemptsTo(SelectFromOptions.byVisibleText("1984").from(By.cssSelector("select#birthYear")));
        actor.wasAbleTo(Click.on(IngresarInfoPage.BUTTON_NEXTl));
    }
}
