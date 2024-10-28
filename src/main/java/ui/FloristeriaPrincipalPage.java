package ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FloristeriaPrincipalPage extends PageObject {
    public static Target BTN_AGRADECIMIENTOS = Target.the("Botón agradecimientos").located(By.xpath("//body/div[@id='wrapper-container']/div[@id='tbay-main-content']/section[@id='main-container']/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]"));
}
