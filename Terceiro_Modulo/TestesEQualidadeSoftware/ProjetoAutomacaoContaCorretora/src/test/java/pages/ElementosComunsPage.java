package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementosComunsPage {


    static WebDriver driver;

    public ElementosComunsPage(WebDriver driver) {
        this.driver = driver;
    }

    public static void abrirNavegadorNoSiteCorretora() {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://cliente.advancedcorretora.com.br/signup");
    }


}
