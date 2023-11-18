package homeworks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pages.C02_FluentFaceBookRegisterPage;
import pages.C03_FluentTask03RegisterPage;

import java.time.Duration;

public class Task01 {
     /*
   go to url : https://ecommerce-playground.lambdatest.io/index.php?route=account/register
   register account test with fluent page object aproach

*/

    @Test
    public void test(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://ecommerce-playground.lambdatest.io/index.php?route=account/register");

       C03_FluentTask03RegisterPage rP = new C03_FluentTask03RegisterPage(driver);

        rP.enterFirstName("Azra").
                enterLastName("Esra").
                enterEmail("azes@example.com").
                enterTelephone("1234567").
                enterPassword("1234azes").
                enterPasswordConfirm("1234azes").
                clickcontinueButton();

    }
}
