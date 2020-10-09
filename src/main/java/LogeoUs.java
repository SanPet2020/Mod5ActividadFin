import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static utils.WebDriverSupliter.getChromeDriver;

public class LogeoUs {

    public static void IngresoUsuario(String email, String clave) {

        WebDriver driver = getChromeDriver();


        /*Se inicia sesión en la aplicación*/
        driver.findElement(By.id("email")).sendKeys(email);
        driver.findElement(By.id("passwd")).sendKeys(clave);
        driver.findElement(By.cssSelector("#SubmitLogin > span")).click();


    }



}
