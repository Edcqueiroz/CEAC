package ceacControlTests;

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
import java.util.concurrent.TimeUnit;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ceacControl1GerenciamentoSPAuditRM {

    //Função de apoio - Printscreen
    static String pastaPrint = new SimpleDateFormat ("yyyy-MM-dd HH-mm").format (Calendar.getInstance ().getTime ());
    String url;
    WebDriver driver;
    //PáginasObjetos
    PageGerenciamentoSPAuditRM gerenciamentoSPAuditRM;
    private Object element;

    public void Print(String nomePrint) throws IOException {

        File foto = ((TakesScreenshot) driver).getScreenshotAs (OutputType.FILE);
        FileUtils.copyFile (foto, new File ("C:\\Users\\eduardoqueiroz\\IdeaProjects\\ceac\\target\\prints\\" + pastaPrint + ".png"));
    }


    @Before
    public void SetUp() {

        url = "http://ceaccontrol.test.br.kworld.kpmg.com/SPAuditRM";
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

    //@Test
    public void CT001_ValidaAcessoGerenciamentoSPAuditRM() {
        gerenciamentoSPAuditRM = new PageGerenciamentoSPAuditRM (driver);
        gerenciamentoSPAuditRM.ValidaPaginaGerenciamento ();
    }

    @Test
    public void CT003_UploadPlanilhaEmBranco() throws IOException {
        gerenciamentoSPAuditRM = new PageGerenciamentoSPAuditRM (driver);

        gerenciamentoSPAuditRM.ClicarRealizarUploadPlanilha ();
        gerenciamentoSPAuditRM.BlankFileUpload ();
    }

    @Test
    public void CT006_UploadPlanilhaDadosDuplicados() throws IOException {
        gerenciamentoSPAuditRM = new PageGerenciamentoSPAuditRM (driver);

        gerenciamentoSPAuditRM.ClicarRealizarUploadPlanilha ();
        gerenciamentoSPAuditRM.DoubleDatafileUpload ();
        gerenciamentoSPAuditRM.ClicarErrosEncontradosPlanilha ();
        gerenciamentoSPAuditRM.ValidarMsgErroPlanilha ();
        gerenciamentoSPAuditRM.ClicarOkMsgErroPlanilha ();
        gerenciamentoSPAuditRM.ClicarFecharImportacaoPlanilha ();

    }

    @Test
    public void CT008_UploadPlanilhaCEACs() throws IOException {
        gerenciamentoSPAuditRM = new PageGerenciamentoSPAuditRM (driver);

        gerenciamentoSPAuditRM.ClicarRealizarUploadPlanilha ();
        gerenciamentoSPAuditRM.FullFileUpload ();
        gerenciamentoSPAuditRM.SelecionarTodosCEACs ();
        gerenciamentoSPAuditRM.ClicarIncluirCEACs ();
        gerenciamentoSPAuditRM.ValidarMensagemUploadSucesso ();
        gerenciamentoSPAuditRM.ClicarMsgSucessoOK ();
        gerenciamentoSPAuditRM.ClicarFecharImportacaoPlanilha ();

    }

    @Test
    public void CT052_PesquisarPorCEACID() {
        gerenciamentoSPAuditRM = new PageGerenciamentoSPAuditRM (driver);
        gerenciamentoSPAuditRM.PreencherFiltroCEAC ();
        gerenciamentoSPAuditRM.ClicarAplicarFiltros ();
        gerenciamentoSPAuditRM.ValidarPesquisaPorID ();

    }


    @Test
    public void CT053_PesquisarPorCEACType() {
        gerenciamentoSPAuditRM = new PageGerenciamentoSPAuditRM (driver);
        gerenciamentoSPAuditRM.PreencherFiltroCeacType ();
        gerenciamentoSPAuditRM.ClicarAplicarFiltros ();
        gerenciamentoSPAuditRM.ValidarResultadoCeac ();
    }

    @Test
    public void CT054_PesquisarPorCEACClientName() {
        gerenciamentoSPAuditRM = new PageGerenciamentoSPAuditRM (driver);
        gerenciamentoSPAuditRM.PreencherFiltroClientName ();
        gerenciamentoSPAuditRM.ClicarAplicarFiltros ();
        gerenciamentoSPAuditRM.ValidarPesquisaClientName ();
    }

    @Test
    public void CT055_LimparFiltros() {
        gerenciamentoSPAuditRM = new PageGerenciamentoSPAuditRM (driver);
        gerenciamentoSPAuditRM.PreencherFiltroCEAC ();
        gerenciamentoSPAuditRM.PreencherFiltroCeacType ();
        gerenciamentoSPAuditRM.PreencherFiltroClientName ();
        gerenciamentoSPAuditRM.ClicarLimparFiltros ();
        gerenciamentoSPAuditRM.ValidarClearCampos ();
    }


    @Test
    public void CT058_CancelarInclusaoDeDependencia() {
        driver.manage ().timeouts ().implicitlyWait (5, TimeUnit.SECONDS);
        gerenciamentoSPAuditRM = new PageGerenciamentoSPAuditRM (driver);
        gerenciamentoSPAuditRM.PreencherFiltroClientName ();
        gerenciamentoSPAuditRM.ClicarAplicarFiltros ();

    }

    @Test
    public void CT011_EditarCEAC() {
        gerenciamentoSPAuditRM = new PageGerenciamentoSPAuditRM (driver);
        gerenciamentoSPAuditRM.PreencherFiltroCEAC ();
        gerenciamentoSPAuditRM.ClicarAplicarFiltros ();
        gerenciamentoSPAuditRM.SelecionarRegistroCEAC ();
        gerenciamentoSPAuditRM.ClicarEditar ();
        gerenciamentoSPAuditRM.EditarCeac ();
        gerenciamentoSPAuditRM.ValidarAtualizacao ();

    }

}
