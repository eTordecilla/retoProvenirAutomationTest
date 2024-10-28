package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;
import ui.FloristeriaPrincipalPage;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class IrAAgradecimientosTask implements Task {

    @Override
    @Step("[{0} selecciona la categoria agradecimientos")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(FloristeriaPrincipalPage.BTN_AGRADECIMIENTOS, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(FloristeriaPrincipalPage.BTN_AGRADECIMIENTOS)
        );
    }

    public static IrAAgradecimientosTask verAgradecimientos() {
        return instrumented(IrAAgradecimientosTask.class);
    }
}
