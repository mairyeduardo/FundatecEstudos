package teste;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ClassTestOpenNavegator {

    static WebDriver driver;

    @BeforeClass
    public static void setBeforeClass() throws Exception {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://accounts.google.com/signup/v2/createaccount?continue=https%3A%2F%2Faccounts.google.com%2F&biz=false&theme=glif&flowName=GlifWebSignIn&flowEntry=SignUp");
    }

    @Test
    public void preencherInfosDeNomeESobrenomeEClicarNoBotao() {
        driver.findElement(new By.ByName("firstName")).sendKeys("mairyteste");
        driver.findElement(new By.ByName("lastName")).sendKeys("automatizado");
        driver.findElement(By.xpath("//span[@class=\"VfPpkd-vQzf8d\"]")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
    }

    @Test
    public void preencherInformacoesDeNascimento() {
        driver.findElement(By.id("day")).sendKeys("20");
    }


//    @AfterClass
//    public static void quit() {
//        driver.quit();
//    }
}