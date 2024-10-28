package stepsdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.ValidarTituloQuestions;
import tasks.IngresarFloristeriaTask;
import tasks.IrAAgradecimientosTask;
import ui.AgradecimientosPage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.equalTo;
import static utils.Constantes.ACTOR_NAME;

public class PaginaInicioFloristeriaSteps {

    @Before
    public void setUp() {
        // Configuración previa al escenario de prueba
        OnStage.setTheStage(new OnlineCast());
        theActorCalled(ACTOR_NAME);
    }

    @Given("^el usuario ingresa a la pagina principal de la floristeria$")
    public void el_usuario_ingresa_a_la_pagina_principal_de_la_floristeria() {
        theActorInTheSpotlight().attemptsTo(IngresarFloristeriaTask.enLaPaginaPrincipal());
    }

    @When("^el usuario selecciona la categoria agradecimientos$")
    public void el_usuasrio_selecciona_la_categoria_agradecimientos() {
        theActorInTheSpotlight().attemptsTo(IrAAgradecimientosTask.verAgradecimientos());
    }

    @Then("^visualiza todos los productos de la categoria agradecimientos y se valida que el titulo sea (.*)$")
    public void visualiza_todos_los_productos_de_la_categoria_agradecimientos_y_se_valida_que_el_titulo_sea(String tituloEsperado) {
        theActorInTheSpotlight().should(seeThat(ValidarTituloQuestions.enTarget(AgradecimientosPage.LBL_TITULO_AGRADECIMIENTOS), equalTo(tituloEsperado)));
    }

}
