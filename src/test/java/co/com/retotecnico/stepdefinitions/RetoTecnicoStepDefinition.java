package co.com.retotecnico.stepdefinitions;

import co.com.retotecnico.model.RegistroUsuario;
import co.com.retotecnico.questions.Pregunta;
import co.com.retotecnico.tasks.Abrir;
import co.com.retotecnico.tasks.Registro;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;


public class RetoTecnicoStepDefinition {
    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^que Elkin quiere registrar un usuario$")
    public void queElkinQuiereRegistrarUnUsuario()  {
        OnStage.theActorCalled("Elkin").wasAbleTo(Abrir.pagina());}

    @Cuando("^el hace el registro del formulario en la pagina utest$")
    public void elHaceElRegistroDelFormularioEnLaPaginaUtest(List<RegistroUsuario> registroUsuario)  {
        OnStage.theActorInTheSpotlight().attemptsTo(Registro.usuario(
                registroUsuario.get(0).getNombre(),
                registroUsuario.get(0).getApellido(),
                registroUsuario.get(0).getEmail(),
                registroUsuario.get(0).getMes(),
                registroUsuario.get(0).getDia(),
                registroUsuario.get(0).getAno(),
                registroUsuario.get(0).getLenguaje(),
                registroUsuario.get(0).getCiudad(),
                registroUsuario.get(0).getPostal(),
                registroUsuario.get(0).getPais(),
                registroUsuario.get(0).getMovil(),
                registroUsuario.get(0).getModelo(),
                registroUsuario.get(0).getSo(),
                registroUsuario.get(0).getContrasena(),
                registroUsuario.get(0).getConfirmacion() ));
        }

    @Entonces("^verifica que se presente en pantalla el mensaje Welcome to the world's largest community of freelance software testers!$")
    public void verificaQueSePresenteEnPantallaElMensajeWelcomeToTheWorldSLargestCommunityOfFreelanceSoftwareTesters(List<RegistroUsuario> registroUsuario){
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Pregunta.respuesta(registroUsuario.get(0).getValidacion())));

    }



}
