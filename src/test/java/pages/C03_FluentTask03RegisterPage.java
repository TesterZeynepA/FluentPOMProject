package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class C03_FluentTask03RegisterPage {

    private WebDriver ldriver; //local Driver

    public C03_FluentTask03RegisterPage(WebDriver driver) {
        ldriver = driver;
    }

    By firstname = By.name("firstname");
    By lastname = By.name("lastname");
    By email = By.name("email");
    By telephone = By.name("telephone");
    By password = By.name("password");
    By passwordConfirm = By.name("confirm");
    By continueButton = By.xpath("//input[@type='submit']");

    public C03_FluentTask03RegisterPage enterFirstName(String firstName) {
        ldriver.findElement(firstname).sendKeys(firstName);
        return this;
    }

    public C03_FluentTask03RegisterPage enterLastName(String lastName) {
        ldriver.findElement(lastname).sendKeys(lastName);
        return this;
    }

    public C03_FluentTask03RegisterPage enterEmail(String email) {
        ldriver.findElement(this.email).sendKeys(email);
        //this kullanmamizin sebebi isim cakismasidir, this keywordu kullanarak bunu handle ettik
        return this;
    }

    public C03_FluentTask03RegisterPage enterTelephone(String lastName) {
        ldriver.findElement(telephone).sendKeys(lastName);
        return this;
    }
    public C03_FluentTask03RegisterPage enterPassword(String password){
        ldriver.findElement(this.password).sendKeys(password);
        return this;
    }
    public C03_FluentTask03RegisterPage enterPasswordConfirm(String password){
        ldriver.findElement(this.passwordConfirm).sendKeys(password);
        return this;
    }
    public void clickcontinueButton(){
        ldriver.findElement(continueButton).click();
    }
}
