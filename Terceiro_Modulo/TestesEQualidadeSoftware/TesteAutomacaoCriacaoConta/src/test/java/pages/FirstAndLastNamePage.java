package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FirstAndLastNamePage {

    static WebDriver driver;

    public FirstAndLastNamePage(WebDriver driver){
        this.driver = driver;
    }

    public void prencherCampoName(String name) {
        WebElement nome = driver.findElement(new By.ByName("firstName"));
        nome.sendKeys(name);
    }

    public void prencherCampoSobrenome(String lastName) {
        WebElement sobrenome = driver.findElement(new By.ByName("lastName"));
        sobrenome.sendKeys(lastName);
    }

}
