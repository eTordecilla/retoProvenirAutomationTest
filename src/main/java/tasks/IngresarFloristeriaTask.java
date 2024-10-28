package tasks;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;
import utils.Constantes;


public class IngresarFloristeriaTask implements Task {

    // Sobrescritura del método
    @Override
    @Step("{0} ingresa a la pagina principal de la floristeria")
    public <T extends Actor> void performAs(T actor) {
            // Abre la página de Wikipedia utilizando la URL definida en las constantes.
            actor.attemptsTo(
                    Open.url(Constantes.PAGINA_FLORISTERIA)
            );
    }

    // Método estático para crear una instancia de la tarea
    public static Performable enLaPaginaPrincipal() {
        return Instrumented.instanceOf(IngresarFloristeriaTask.class)
                .newInstance();
    }
}
