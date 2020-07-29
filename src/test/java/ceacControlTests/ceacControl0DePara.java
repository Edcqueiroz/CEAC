package ceacControlTests;

import PageObjects.PageDePara;
import PageObjects.PageGerenciamentoSPAuditRM;
import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ceacControl0DePara {

    //Função de apoio - Printscreen
    static String pastaPrint = new SimpleDateFormat ("yyyy-MM-dd HH-mm").format (Calendar.getInstance ().getTime ());
    String url;
    WebDriver driver;
    //PáginasObjetos
    PageGerenciamentoSPAuditRM gerenciamentoSP;
    PageDePara depara;

    public void Print(String nomePrint) throws IOException {

        File foto = ((TakesScreenshot) driver).getScreenshotAs (OutputType.FILE);
        FileUtils.copyFile (foto, new File ("C:\\Users\\eduardoqueiroz\\IdeaProjects\\ceac\\target\\prints" + pastaPrint + ".png"));
    }

    @Before
    public void SetUp() {

        url = "http://ceaccontrol.test.br.kworld.kpmg.com/UserFromTo";
        System.setProperty ("webdriver.chrome.driver", "C:\\Users\\eduardoqueiroz\\IdeaProjects\\drivers\\chrome\\80\\chromedriver.exe");

        ChromeOptions options = new ChromeOptions ();
        options.setExperimentalOption ("useAutomationExtension", false);
        options.addArguments ("start-maximized");

        driver = new ChromeDriver (options);
        driver.get (url);

        WebDriverWait wait = new WebDriverWait (this.driver, 10);
        wait.until (ExpectedConditions.presenceOfElementLocated (By.xpath ("/html/body/header/div/div/h1")));
    }

    @After
    public void TearDown() {
        driver.quit ();
    }

    @Test
    public void CT10_ValidarAcessoADePara() throws Throwable {
        depara = new PageDePara (driver);

        driver.getTitle ();
        depara.ValidaNomeTela ();
        Print ("CT10");
    }

    @Test
    public void CT11_CadastarDeParaSocios() throws Throwable {
        depara = new PageDePara (driver);

        depara.Wait ();
        depara.ClicarNovoCadastro ();
        depara.PreencheNomeNGGC ();
        depara.PreencherMatricula ();
        depara.Wait ();
        //depara.ValidaNome();
        depara.ClicarSalvar ();
        depara.Wait ();
        depara.CadastroSalvoComSuesso ();
        Print ("CT11");
    }

    @Test
    public void CT12_ValidarResultadoBusca() {
        depara = new PageDePara (driver);

        depara.Wait ();
        depara.BuscarRegistro ();
        depara.ClicarAplicarFiltros ();
        depara.Wait ();
        depara.validaRegistro ();
    }

    @Test
    public void CT20_EditarCadastroDePara() {
        depara = new PageDePara (driver);

        depara.Wait ();
        depara.BuscarRegistro ();
        depara.ClicarAplicarFiltros ();
        depara.Wait ();
        depara.SelecionarRegitro ();
        depara.ClicarEditar ();
        depara.PreencheNomeNGGCEditar ();
        depara.PreencherMatricula ();
        depara.Wait ();
        depara.ClicarSalvar ();
        depara.CadastroAtualizadoComSuesso ();
    }

    @Test
    public void CT21_ExcluirCadastroDePara() {
        depara = new PageDePara (driver);

        depara.Wait ();
        depara.BuscarRegistro ();
        depara.ClicarAplicarFiltros ();
        depara.Wait ();
        depara.SelecionarRegitro ();
        depara.ClicarExcluir ();
        depara.ConfirmaExclusao ();
        depara.CadastroExcluidoComSucesso ();
    }

}
