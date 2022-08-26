package co.com.choucair.certification.testjoin.tasks;

import co.com.choucair.certification.testjoin.userinteraface.IngresarInfoPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;


public class IngresarInfoDevices implements Task {


    public static IngresarInfoDevices onThePage() {
        return Tasks.instrumented(IngresarInfoDevices.class);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(IngresarInfoPage.SELECT_COMPUTER));
        actor.attemptsTo(Click.on(IngresarInfoPage.INSERT_COMPUTER));
        actor.attemptsTo(Click.on(IngresarInfoPage.SELECT_VERSION));
        actor.attemptsTo(Click.on(IngresarInfoPage.INSERT_VERSION));
        actor.attemptsTo(Click.on(IngresarInfoPage.SELECT_LANGUAJE));
        actor.attemptsTo(Click.on(IngresarInfoPage.INSERT_LANGUAJE));
        actor.attemptsTo(Click.on(IngresarInfoPage.SELECT_MDEVICE));
        actor.attemptsTo(Click.on(IngresarInfoPage.INSERT_MDEVICE));
        actor.attemptsTo(Click.on(IngresarInfoPage.SELECT_MODEL));
        actor.attemptsTo(Click.on(IngresarInfoPage.INSERT_MODEL));
        actor.attemptsTo(Click.on(IngresarInfoPage.SELECT_OS));
        actor.attemptsTo(Click.on(IngresarInfoPage.INSERT_OS));
        actor.wasAbleTo(Click.on(IngresarInfoPage.BUTTON_NEXTLS));

    }
}
