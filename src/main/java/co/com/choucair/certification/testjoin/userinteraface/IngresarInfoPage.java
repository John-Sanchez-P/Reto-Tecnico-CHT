package co.com.choucair.certification.testjoin.userinteraface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class IngresarInfoPage extends PageObject {

    public static final Target SELECT_CAMPONAME = Target.the("Selecciona el campo Name, para iniciar").located(By.id("firstName"));
    public static final Target SELECT_CAMPOLASTNAME = Target.the("Selecciona el campo Last Name").located(By.id("lastName"));
    public static final Target SELECT_EMAIL = Target.the("Selecciona el campo Email").located(By.id("email"));
    public static final Target BUTTON_NEXTl= Target.the("Selecciona el boton Join Next despues de llenar los primeros datos").located(By.xpath("//span[.='Next: Location']"));


    //ADDRESS
    public static final Target SELECT_CAMPOCITY = Target.the("Selecciona el campo City").located(By.xpath("//input[@id='city']"));
    public static final Target SELECT_CAMPOCITY2 = Target.the("Selecciona el campo City y le pasa un valor, despues se le vuelve a pasar para que lo reconozca").located(By.xpath("//div[@class='pac-item']//span[contains(text(),'Oslo')]"));
    public static final Target SELECT_CAMPOPOSTALCODE = Target.the("Selecciona el campo Postal Code").located(By.xpath("//input[@id='zip']"));
    public static final Target SELECT_COUNTRY = Target.the("Selecciona el campo Pais").located(By.xpath("//span[@class='ui-select-match-text pull-left']"));
    public static final Target INSERT_COUNTRY = Target.the("Inserta el pais desde donde se encuentra").located(By.xpath("//div[contains(text(),'Germany')]"));
    public static final Target BUTTON_NEXTD = Target.the("Boton que nos permite continuar con el registro").located(By.xpath("//div[@class='pull-right next-step']//a[@class='btn btn-blue pull-right']"));

//Device
    //da el clic inicial, se necesitan 2
    public static final Target SELECT_COMPUTER = Target.the("Selecciona el campo  Your Computer").located(By.xpath("//span[@class='ui-select-match-text pull-left ui-select-allow-clear']"));
    public static final Target INSERT_COMPUTER = Target.the("Inserta el OS con el cual esta trabajando en la computadora").located(By.xpath("//div[contains(text(),'macOS')]"));
    public static final Target SELECT_VERSION = Target.the("Selecciona el campo version del OS").located(By.name("osVersionId"));
    public static final Target INSERT_VERSION = Target.the("Inserta la version del sistema operativo con el cual esta trabajando").located(By.xpath("//div[contains(text(),'OS X 10.11.4')]"));
    public static final Target SELECT_LANGUAJE= Target.the("Selecciona el campo para ingresar el Leguaje de su PC").located(By.name("osLanguageId"));
    public static final Target INSERT_LANGUAJE = Target.the("Inserta Leguaje de su PC").located(By.xpath("//div[contains(text(),'Czech')]"));
    public static final Target SELECT_MDEVICE= Target.the("Selecciona el campo tipo de dispositivo mobil").located(By.name("handsetMakerId"));
    public static final Target INSERT_MDEVICE = Target.the("Inserta el tipo de dispositivo mobil").located(By.xpath("//div[contains(text(),'Huawei')]"));
    public static final Target SELECT_MODEL= Target.the("Selecciona el campo  modelo de dispositivo mobil").located(By.name("handsetModelId"));
    public static final Target INSERT_MODEL = Target.the("Inserta el modelo del dispositivo mobil").located(By.xpath("//div[contains(text(),'Ideos X5')]"));
    public static final Target SELECT_OS= Target.the("Selecciona el campo OS del dispositivo mobil").located(By.name("handsetOSId"));
    public static final Target INSERT_OS = Target.the("Insertar el OS del dispositivo mobil").located(By.xpath("//div[contains(text(),'Android 3.1')]"));
    public static final Target BUTTON_NEXTLS = Target.the("Boton que nos permite continuar con el registro").located(By.xpath("//div[@class='pull-right next-step']//a[@class='btn btn-blue pull-right']"));

//Ultimos Pasos

    public static final Target SELECT_CAMPOPASSW = Target.the("Selecciona el campo Password para ingresar su nueva contraseña").located(By.id("password"));
    public static final Target SELECT_CONFIRMARPASSW = Target.the("Selecciona el campo Confirmar Password").located(By.id("confirmPassword"));
    public static final Target SELECT_STAYINFORMED = Target.the("Selecciona el campo Mantente Informado").located(By.xpath("//span[@class='checkmark signup-consent__checkbox signup-consent__checkbox--highlight']"));
    public static final Target SELECT_TERMOFUSE= Target.the("Selecciona el campo Terminos y condiciones").located(By.name("termOfUse"));
    public static final Target SELECT_POLICY= Target.the("Selecciona el campo aceptar Politicas").located(By.name("privacySetting"));
    public static final Target BUTTON_COMPLETE = Target.the("Boton que finaliza el proceso de registro").located(By.id("laddaBtn"));
}
