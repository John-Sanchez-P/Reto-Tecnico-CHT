package co.com.choucair.certification.testjoin.stepdefinitions;

import co.com.choucair.certification.testjoin.questions.Respuesta;
import co.com.choucair.certification.testjoin.tasks.*;
import co.com.choucair.certification.testjoin.userinteraface.IngresarInfoPage;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.openqa.selenium.By;

public class TestJoinStepDefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());//Prepara en escenario para nuestro actor
    }

    @Dado("^que queremos acceder a la pagina$")
    public void queQueremosAccederALaPagina() {
        OnStage.theActorCalled("John").wasAbleTo(OpenUp.thePage(), (Login.onThePage()));


    }


    @Cuando("^presionamos el boton registrar$")
    public void presionamosElBotonRegistrar() {
        OnStage.theActorCalled("John").attemptsTo(IngresarInfo.onThePage());
        OnStage.theActorCalled("John").attemptsTo(IngresarInfoAdress.onThePage());
        OnStage.theActorCalled("John").attemptsTo(IngresarInfoDevices.onThePage());
        OnStage.theActorCalled("John").attemptsTo(UltimosPasos.onThePage());

    }

    @Entonces("^quedamos logueados correctamente y con una (.*)$")
    public void quedamosLogeadosCorrectamenteYConUnaCuentaCreada(String pregunta) {
        //OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Respuesta.toThe(pregunta)));
    }

}
