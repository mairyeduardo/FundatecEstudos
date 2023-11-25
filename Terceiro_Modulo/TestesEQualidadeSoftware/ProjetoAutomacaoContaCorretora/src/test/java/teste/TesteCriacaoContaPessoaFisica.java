package teste;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.ElementosComunsPage;
import pages.ElementosPessoaFisicaPage;

public class TesteCriacaoContaPessoaFisica {

    static WebDriver driver;
    static ElementosComunsPage elementosComunsPage;
    static ElementosPessoaFisicaPage elementosPessoaFisicaPage;

    @BeforeClass
    public static void setBeforeClass() throws Exception {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://cliente.advancedcorretora.com.br/signup");
        driver.manage().window().maximize();
        elementosComunsPage = new ElementosComunsPage(driver);
        elementosComunsPage.aceitarCookies();
        elementosPessoaFisicaPage = new ElementosPessoaFisicaPage(driver);


    }

    @Test
    public void preencherInformacoesCorretasDoFormularioECriarContaComSucesso(){
        elementosPessoaFisicaPage.preencherCampoNome("NomeTeste");
        elementosPessoaFisicaPage.preencherCampoSobrenome("SobrenomeTeste");
        elementosPessoaFisicaPage.preencherCampoDataNascimento("23/11/2000");
        elementosPessoaFisicaPage.preencherCampoCpf("88826596311");
    }

}
