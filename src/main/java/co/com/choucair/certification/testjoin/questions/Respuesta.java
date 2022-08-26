package co.com.choucair.certification.testjoin.questions;

import co.com.choucair.certification.testjoin.tasks.IngresarInfo;
import co.com.choucair.certification.testjoin.userinteraface.IngresarInfoPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Respuesta  implements Question<Boolean> {
    private String pregunta;

    public Respuesta (String pregunta){
        this.pregunta = pregunta;
    }
    public static Respuesta toThe(String pregunta) {
        return new Respuesta(pregunta);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean resultado;
        String emailLogueado = Text.of(IngresarInfoPage.SELECT_EMAIL).viewedBy(actor).asString();
        if(pregunta.equals(emailLogueado)){
            resultado = true;
        }else {
            resultado = false;
        }
        return resultado;
    }

}
