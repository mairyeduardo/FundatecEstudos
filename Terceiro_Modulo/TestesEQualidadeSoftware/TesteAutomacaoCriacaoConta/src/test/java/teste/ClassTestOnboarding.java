package teste;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.CommonElementsPage;
import pages.DateAndGenderPage;
import pages.FirstAndLastNamePage;

import java.time.Duration;

public class ClassTestOnboarding {


    String fixedName = "teste";
    String fixedSobrenome = "automacao";
    String fixedDay = "31";
    String fixedYear = "2002";

    static WebDriver driver;
    static FirstAndLastNamePage firstAndLastNamePage;
    static DateAndGenderPage dateAndGenderPage;
    static CommonElementsPage commonElementsPage;

    @BeforeClass
    public static void setBeforeClass() throws Exception {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://accounts.google.com/signup/v2/createaccount?continue=https%3A%2F%2Faccounts.google.com%2F&biz=false&theme=glif&flowName=GlifWebSignIn&flowEntry=SignUp");

        firstAndLastNamePage = new FirstAndLastNamePage(driver);
        dateAndGenderPage = new DateAndGenderPage(driver);
        commonElementsPage = new CommonElementsPage(driver);
    }

    @Test
    public void preencherInfosDeNomeESobrenomeEClicarNoBotao() {
        firstAndLastNamePage.prencherCampoName(fixedName);
        firstAndLastNamePage.prencherCampoSobrenome(fixedSobrenome);
        commonElementsPage.clicarBotaoComTextoProximo();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }

    @Test
    public void preencherInformacoesDeNascimento() {
        dateAndGenderPage.preencherCampoDia(fixedDay);
        dateAndGenderPage.selecionarMesJaneiro();
        dateAndGenderPage.preencherCampoAno(fixedYear);
        dateAndGenderPage.selecionarGeneroMasculino();
        commonElementsPage.clicarBotaoComTextoProximo();
    }


//    @AfterClass
//    public static void quit() {
//        driver.quit();
//    }
}