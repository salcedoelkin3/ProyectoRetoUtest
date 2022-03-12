package co.com.retotecnico.tasks;

import co.com.retotecnico.userinterface.PaginaFormulario;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Registro implements Task {
    private final String nombre;
    private final String apellido;
    private final String email;
    private final String mes;
    private final String dia;
    private final String ano;
    private final String lenguaje;
    private final String ciudad;
    private final String postal;
    private final String pais;
    private final String movil;
    private final String modelo;
    private final String so;
    private final String contrasena;
    private final String confirmacion;


    public Registro( String nombre, String apellido, String email, String mes, String dia, String ano, String lenguaje,
                    String ciudad, String postal, String pais, String movil, String modelo, String so, String contrasena, String confirmacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.mes = mes;
        this.dia = dia;
        this.ano = ano;
        this.lenguaje = lenguaje;
        this.ciudad = ciudad;
        this.postal = postal;
        this.pais = pais;
        this.movil = movil;
        this.modelo = modelo;
        this.so = so;
        this.contrasena = contrasena;
        this.confirmacion = confirmacion;


    }


    public static Registro usuario(String nombre , String apellido , String email , String mes , String dia, String ano,
                                   String lenguaje ,String ciudad, String postal, String pais, String movil, String modelo,
                                   String so , String contrasena, String confirmacion) {

        return Tasks.instrumented(Registro.class, nombre , apellido , email , mes , dia, ano, lenguaje, ciudad,
                postal, pais, movil, modelo, so , contrasena, confirmacion);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(PaginaFormulario.BUTTON_JOIN),
                Enter.theValue(nombre).into(PaginaFormulario.INPUT_NOMBRE),
                Enter.theValue(apellido).into(PaginaFormulario.INPUT_APELLIDO),
                Enter.theValue(email).into(PaginaFormulario.INPUT_CORREO),
                Click.on(PaginaFormulario.INPUT_MES),
                Click.on(PaginaFormulario.INPUT_DIA),
                Click.on(PaginaFormulario.INPUT_ANO),
                Enter.theValue(lenguaje).into(PaginaFormulario.INPUT_LENGUAJE),
                Click.on(PaginaFormulario.BUTTON_NEXT),

                Enter.theValue(ciudad).into(PaginaFormulario.BUTTON_CIUDAD),
                Enter.theValue(postal).into(PaginaFormulario.BUTTON_POSTAL),

                Click.on(PaginaFormulario.BUTTON_PAIS),
                Enter.theValue(pais).into(PaginaFormulario.CLICK_PAIS),

                Click.on(PaginaFormulario.BUTTON_NEXTDEVICE),
                Click.on(PaginaFormulario.INPUT_MOVIL),
                Click.on(PaginaFormulario.SELECT_MOVIL),
                Click.on(PaginaFormulario.INPUT_MODELO),
                Click.on(PaginaFormulario.SELECT_MODELO),
                Click.on(PaginaFormulario.INPUT_SO),
                Click.on(PaginaFormulario.SELECT_SO),
                Click.on(PaginaFormulario.BUTTON_NEXT1),
                Enter.theValue(contrasena).into(PaginaFormulario.INPUT_PASS),
                Enter.theValue(confirmacion).into(PaginaFormulario.INPUT_CONF),
                Click.on(PaginaFormulario.CHECK1),
                Click.on(PaginaFormulario.CHECK2),
                Click.on(PaginaFormulario.BUTTON_FINAL)

        );




    }
}
