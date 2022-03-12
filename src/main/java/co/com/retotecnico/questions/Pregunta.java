package co.com.retotecnico.questions;

import co.com.retotecnico.userinterface.PaginaFormulario;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Pregunta implements Question<Boolean> {

    private String validacion;

    public Pregunta(String validacion) {
        this.validacion = validacion;

    }

    public static Pregunta respuesta(String validacion) {
        return new Pregunta(validacion);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean respuesta;
        String textoPagina = Text.of(PaginaFormulario.TEXT_DATA).viewedBy(actor).asString();
        if (validacion.equals(textoPagina)){
            respuesta = true;
        }else {
            respuesta = false;
        }
        return respuesta;
    }
}
