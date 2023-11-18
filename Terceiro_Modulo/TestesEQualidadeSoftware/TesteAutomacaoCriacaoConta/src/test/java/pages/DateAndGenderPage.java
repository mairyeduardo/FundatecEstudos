package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DateAndGenderPage {

    static WebDriver driver;

    public DateAndGenderPage(WebDriver driver) {
        this.driver = driver;
    }

    public void preencherCampoDia(String day){
        WebElement dia = driver.findElement(By.id("day"));
        dia.sendKeys(day);
    }

    public void selecionarMesJaneiro() {
        Select mes = new Select( driver.findElement(By.id("month")));
        mes.selectByVisibleText("Janeiro");
    }

    public void preencherCampoAno(String year){
        WebElement ano = driver.findElement(By.id("year"));
        ano.sendKeys(year);
    }

    public void selecionarGeneroMasculino() {
        Select genero = new Select( driver.findElement(By.id("gender")));
        genero.selectByVisibleText("Masculino");
    }

}
