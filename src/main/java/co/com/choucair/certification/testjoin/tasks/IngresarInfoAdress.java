package co.com.choucair.certification.testjoin.tasks;

import co.com.choucair.certification.testjoin.userinteraface.IngresarInfoPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;


public class IngresarInfoAdress implements Task {

    public static IngresarInfoAdress onThePage() {
        return Tasks.instrumented(IngresarInfoAdress.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {


        actor.attemptsTo(Enter.theValue(" ").into(IngresarInfoPage.SELECT_CAMPOCITY));
        actor.attemptsTo(Enter.theValue("Oslo").into(IngresarInfoPage.SELECT_CAMPOCITY));
        actor.attemptsTo(Click.on(IngresarInfoPage.SELECT_CAMPOCITY2));
        actor.attemptsTo(Enter.theValue("000000").into((IngresarInfoPage.SELECT_CAMPOPOSTALCODE)));
        actor.attemptsTo(Click.on(IngresarInfoPage.SELECT_COUNTRY));
        actor.attemptsTo(Click.on(IngresarInfoPage.INSERT_COUNTRY));
        actor.wasAbleTo(Click.on(IngresarInfoPage.BUTTON_NEXTD));

    }
}
