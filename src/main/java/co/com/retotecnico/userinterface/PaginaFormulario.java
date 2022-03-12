package co.com.retotecnico.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaFormulario extends PageObject {
    public static final Target BUTTON_JOIN = Target.the("boton de ingreso al registro")
            .located(By.xpath("//a[@class='unauthenticated-nav-bar__sign-up']"));
    public static final Target INPUT_NOMBRE = Target.the("ingresa nombre de usuario")
            .located(By.id("firstName"));
    public static final Target INPUT_APELLIDO = Target.the("ingresa el apellido de usuario")
            .located(By.id("lastName"));
    public static final Target INPUT_CORREO = Target.the("ingresa correo de usuario")
            .located(By.id("email"));
    public static final Target INPUT_MES = Target.the("ingresa mes de nacimiento")
            .located(By.xpath("//option[contains(@label,'April')]"));
    public static final Target INPUT_DIA = Target.the("ingresa dia de nacimiento")
            .located(By.xpath("//option[@value='number:19']"));
    public static final Target INPUT_ANO = Target.the("ingresa ano de nacimiento")
            .located(By.xpath("//option[@value='number:2000']"));
    public static final Target INPUT_LENGUAJE = Target.the("selecciona el lenguaje")
            .located(By.xpath("//input[@type = 'search']"));
    public static final Target BUTTON_NEXT = Target.the("da clic para continuar")
            .located(By.xpath("//span[contains(text(), 'Next: Location')]"));

    public static final Target BUTTON_CIUDAD =Target.the("agrega la ciudad")
            .located(By.xpath("//input[@ng-if='isGoogleMapsAvailable()']"));


    public static final Target BUTTON_POSTAL =Target.the("agrega la postal de la ciudad")
            .located(By.xpath("//input[@id='zip']"));

    public static final Target BUTTON_PAIS =Target.the("Busca pais")
            .located(By.xpath("//div[contains(@name,'countryId')]"));
    public static final Target CLICK_PAIS = Target.the("selecciona pais")
            .located(By.xpath("//div/input[contains(@aria-owns,'ui-select-choices-2')]"));

    public static final Target BUTTON_NEXTDEVICE = Target.the("da clic para continuar")
            .located(By.xpath("//span[contains(text(), 'Next: Devices')]"));


    public static final Target INPUT_MOVIL = Target.the("ingresa el movil")
            .located(By.xpath("//div[@name='handsetMakerId']"));
    public static final Target SELECT_MOVIL = Target.the("selecciona el movil")
            .located(By.xpath("//span[contains(@class,'ui-select-choices-row-inner')]/div[contains(text(),'Alcatel')]"));



    public static final Target INPUT_MODELO =Target.the("ingresa modelo del movil")
            .located(By.xpath("//div[@name='handsetModelId']"));
    public static final Target SELECT_MODELO =Target.the("selecciona modelo del movil")
            .located(By.xpath("//span[contains(@class,'ui-select-choices-row-inner')]/div[contains(text(),'MD01')]"));



    public static final Target INPUT_SO = Target.the("ingresa sistema operativo del movil")
            .located(By.xpath("//div[@name='handsetOSId']"));
    public static final Target SELECT_SO = Target.the("ingresa sistema operativo del movil")
            .located(By.xpath("//span[contains(@class,'ui-select-choices-row-inner')]/div[contains(text(),'Android 2.0')]"));

    public static final Target BUTTON_NEXT1 = Target.the("da clic para continuar")
            .located(By.xpath("//span[contains(text(), 'Next: Last Step')]"));
    public static final Target INPUT_PASS = Target.the("ingresa la contraseña de usuario")
            .located(By.id("password"));
    public static final Target INPUT_CONF = Target.the("ingresa la contraseña de usuario para confirmar")
            .located(By.id("confirmPassword"));
    public static final Target CHECK1 = Target.the("check para la segunda opcion")
            .located(By.id("termOfUse"));
    public static final Target CHECK2 = Target.the("check para la tercera opcion")
            .located(By.id("privacySetting"));
    public static final Target BUTTON_FINAL = Target.the("clic en boton para cargar formulario")
            .located(By.id("laddaBtn"));
    public static final Target TEXT_DATA = Target.the("verifica el texto final")
        .located(By.xpath("//div[contains(@class,'image-box-header')]/h1[text()]"));
}


