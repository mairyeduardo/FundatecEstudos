package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class ElementosPessoaFisicaPage {

    static WebDriver driver;

    public ElementosPessoaFisicaPage(WebDriver driver) {
        this.driver = driver;
    }

    public void preencherCampoNome(String firstName) {
        WebElement nome = driver.findElement(By.id("name"));
        nome.sendKeys(firstName);
    }

    public void preencherCampoSobrenome(String lastName) {
        WebElement sobrenome = driver.findElement(By.id("lastname"));
        sobrenome.sendKeys(lastName);
    }

    public void preencherCampoDataNascimento(String date) {
        WebElement dataNascimento = driver.findElement(By.id("date"));
        dataNascimento.sendKeys(date);
    }

    public void preencherCampoCpf(String cpf){
        WebElement CPF = driver.findElement(By.id("document"));
        CPF.sendKeys(cpf);
    }

}
