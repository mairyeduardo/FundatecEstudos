package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CommonElementsPage {

    static WebDriver driver;

    public CommonElementsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clicarBotaoComTextoProximo() {
        WebElement botao = driver.findElement(By.xpath("//span[contains(text(), 'Próxima')]"));
        botao.click();
    }

}