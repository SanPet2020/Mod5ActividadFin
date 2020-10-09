import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static utils.WebDriverSupliter.getChromeDriver;

public class CambioClave {


    public static void Datousuario(String name1, String apellido1, String passvieja, String passnueva, String passconfirma) {

        WebDriver driver = getChromeDriver();



        /*Se accede a la vista 'My personal information' realizando clic en la tarjeta*/
        driver.findElement(By.cssSelector("li:nth-child(4) span:nth-child(2)")).click();

        /*Se actualizan los datos personales del usuario*/
        driver.findElement(By.id("firstname")).sendKeys(name1);
        driver.findElement(By.id("lastname")).sendKeys(apellido1);
        driver.findElement(By.id("old_passwd")).sendKeys(passvieja);
        driver.findElement(By.id("passwd")).sendKeys(passnueva);
        driver.findElement(By.id("confirmation")).sendKeys(passconfirma);
        driver.findElement(By.id("newsletter")).click();

        /*Se actualizan los datos personales del usuario*/
        driver.findElement(By.cssSelector(".button-medium:nth-child(1) > span")).click();
        driver.findElement(By.cssSelector(".columns-container")).click();


    }
}
