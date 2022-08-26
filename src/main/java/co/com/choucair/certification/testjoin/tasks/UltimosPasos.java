package co.com.choucair.certification.testjoin.tasks;

import co.com.choucair.certification.testjoin.userinteraface.IngresarInfoPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class UltimosPasos implements Task {


    public static UltimosPasos onThePage() {
        return Tasks.instrumented(UltimosPasos.class);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Enter.theValue("@a1B2#123456bVcX#").into(IngresarInfoPage.SELECT_CAMPOPASSW));
        actor.attemptsTo(Enter.theValue("@a1B2#123456bVcX#").into(IngresarInfoPage.SELECT_CONFIRMARPASSW));
        actor.attemptsTo(Click.on(IngresarInfoPage.SELECT_STAYINFORMED));
        actor.attemptsTo(Click.on(IngresarInfoPage.SELECT_TERMOFUSE));
        actor.attemptsTo(Click.on(IngresarInfoPage.SELECT_POLICY));
        actor.wasAbleTo(Click.on(IngresarInfoPage.BUTTON_COMPLETE));


    }
}
