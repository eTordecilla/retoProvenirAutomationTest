package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.actions.OpenUrl;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;
import ui.AgradecimientosPage;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class AgregarProductosTask {

    // Método para seleccionar el primer producto
    public static Task seleccionarPrimerProducto() {
        return Task.where("{0} selecciona el primer producto",
                MoveMouse.to(AgradecimientosPage.BTN_AGREGAR_CARRITO_MDF_00020),
                WaitUntil.the(AgradecimientosPage.BTN_AGREGAR_CARRITO_MDF_00020, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(AgradecimientosPage.BTN_AGREGAR_CARRITO_MDF_00020)
        );
    }

    // Método para regresar a la página principal
    public static Task regresarAPaginaPrincipal(String url) {
        return Task.where("{0} regresa a la página principal",
                Click.on(AgradecimientosPage.BTN_SEGUIR_COMPRANDO)
        );
    }

    // Método para seleccionar el segundo producto
    public static Task seleccionarSegundoProducto() {
        return Task.where("{0} selecciona el segundo producto",
                MoveMouse.to(AgradecimientosPage.BTN_AGREGAR_CARRITO_MDF_00031),
                WaitUntil.the(AgradecimientosPage.BTN_AGREGAR_CARRITO_MDF_00031, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(AgradecimientosPage.BTN_AGREGAR_CARRITO_MDF_00031)
        );
    }
}
