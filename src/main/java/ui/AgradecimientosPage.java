package ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AgradecimientosPage {
    public static Target LBL_TITULO_AGRADECIMIENTOS = Target.the("Título de la página agradecimientos").located(By.xpath("//h1[contains(text(),'Agradecimientos')]"));
    public static Target LBL_TITULO_CARRITO = Target.the("Título de la página agradecimientos").located(By.xpath("//h1[contains(text(),'Carrito')]"));
    public static Target BTN_AGREGAR_CARRITO_MDF_00020 = Target.the("Título de la página agradecimientos").located(By.xpath("//body/div[@id='wrapper-container']/div[@id='tbay-main-content']/section[@id='main-container']/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/figure[1]/div[1]/div[1]/a[1]"));
    public static Target BTN_AGREGAR_CARRITO_MDF_00031 = Target.the("Título de la página agradecimientos").located(By.xpath("//body/div[@id='wrapper-container']/div[@id='tbay-main-content']/section[@id='main-container']/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[4]/div[1]/div[1]/figure[1]/div[1]/div[1]/a[1]"));
    public static Target BTN_SEGUIR_COMPRANDO = Target.the("Título de la página agradecimientos").located(By.xpath("//a[contains(text(),'Seguir comprando')]"));
    public static Target BTN_VER_CARRITO = Target.the("Botón ver carrito").located(By.xpath("//header/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]/span[2]/span[1]"));
    public static Target PRODUCTO_EN_CARRITO_MDF_00020 = Target.the("Producto MDF_00020 en el carrito").located(By.xpath("//header/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/div[1]/a[2]"));
    public static Target PRODUCTO_EN_CARRITO_MDF_00015 = Target.the("Producto MDF_00015 en el carrito").located(By.xpath("//header/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/div[1]/a[2]"));



}

