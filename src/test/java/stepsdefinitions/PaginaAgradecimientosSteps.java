package stepsdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.ValidarProductosEnCarritoQuestion;
import questions.ValidarTituloQuestions;
import tasks.AgregarProductosTask;
import ui.AgradecimientosPage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.equalTo;
import static utils.Constantes.ACTOR_NAME;
import static utils.Constantes.PAGINA_AGRADECIMIENTOS;

public class PaginaAgradecimientosSteps {

    @Before
    public void setUp() {
        OnStage.setTheStage(new OnlineCast());
        theActorCalled(ACTOR_NAME);
    }

    @When("^el usuario selecciona el primer producto y regresa a la página agradecimientos$")
    public void el_usuario_selecciona_el_primer_producto_y_regresa() {
        theActorInTheSpotlight().attemptsTo(
                AgregarProductosTask.seleccionarPrimerProducto(),
                AgregarProductosTask.regresarAPaginaPrincipal(PAGINA_AGRADECIMIENTOS)
        );
    }

    @And("^el usuario selecciona el segundo producto$")
    public void el_usuario_selecciona_el_segundo_producto() {
        theActorInTheSpotlight().attemptsTo(AgregarProductosTask.seleccionarSegundoProducto()
        );
    }

    @And("^el usuario hace clic en el carrito$")
    public void el_usuario_hace_clic_en_el_carrito() {
        theActorInTheSpotlight().attemptsTo(Click.on(AgradecimientosPage.BTN_VER_CARRITO)
        );
    }

    @When("^el usuario regresa a la pagina de agradecimientos$")
    public void el_usuario_a_la_pagina_de_agradecimientos() {
        theActorInTheSpotlight().attemptsTo(
                AgregarProductosTask.regresarAPaginaPrincipal(PAGINA_AGRADECIMIENTOS)
        );
    }

    @Then("^el usuario visualiza los productos en el carrito y se valida que el titulo de la pagina sea (.*)$")
    public void el_usuario_visualiza_los_productos_en_el_carrito_y_se_valida_que_el_titulo_sea(String tituloEsperado) {
        theActorInTheSpotlight().should(seeThat(ValidarTituloQuestions.enTarget(AgradecimientosPage.LBL_TITULO_CARRITO), equalTo(tituloEsperado)));
    }

    @Then("^el usuario visualiza los productos que agregó$")
    public void el_usuario_visualiza_los_productos_en_el_carrito() {
        theActorInTheSpotlight().should(
                seeThat("Producto MDF_00020 en el carrito", ValidarProductosEnCarritoQuestion.productoEnCarritoMDF00020(), equalTo(true)),
                seeThat("Producto MDF_00015 en el carrito", ValidarProductosEnCarritoQuestion.productoEnCarritoMDF00015(), equalTo(true))
        );
    }


}
