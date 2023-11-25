package teste;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.ElementosComunsPage;

public class TesteCriacaoContaPessoaFisica {

    static WebDriver driver;
    private static ElementosComunsPage elementosComunsPage;

    @BeforeClass
    public static void setBeforeClass() throws Exception {
        ElementosComunsPage.abrirNavegadorNoSiteCorretora();
    }

    @Test
    public void preencherInformacoesFormulario(){

    }

}
