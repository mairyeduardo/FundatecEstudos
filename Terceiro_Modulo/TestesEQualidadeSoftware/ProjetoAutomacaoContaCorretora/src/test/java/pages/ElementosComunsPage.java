package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ElementosComunsPage {

    static WebDriver driver;

    public ElementosComunsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void aceitarCookies(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
        WebElement button = driver.findElement(By.id("onetrust-accept-btn-handler"));
        button.click();
    }

}
