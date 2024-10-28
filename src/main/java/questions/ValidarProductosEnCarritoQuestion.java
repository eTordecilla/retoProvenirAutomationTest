package questions;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;
import ui.AgradecimientosPage;

public class ValidarProductosEnCarritoQuestion {
    public static Question<Boolean> productoEnCarritoMDF00020() {
        return actor -> Visibility.of(AgradecimientosPage.PRODUCTO_EN_CARRITO_MDF_00020).viewedBy(actor).asBoolean();
    }

    public static Question<Boolean> productoEnCarritoMDF00015() {
        return actor -> Visibility.of(AgradecimientosPage.PRODUCTO_EN_CARRITO_MDF_00015).viewedBy(actor).asBoolean();
    }
}
