package ceacControlTests;

import PageObjects.PageProfissionalGrupoFuncao;
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
public class ceacControl3ProfissionalGrupoFuncao {

    //Fun��o de apoio - Printscreen
    static String pastaPrint = new SimpleDateFormat ("yyyy-MM-dd HH-mm").format (Calendar.getInstance ().getTime ());
    String url;
    WebDriver driver;
    //P�ginasObjetos
    PageProfissionalGrupoFuncao profgrupofuncao;

    public void Print(String nomePrint) throws IOException {

        File foto = ((TakesScreenshot) driver).getScreenshotAs (OutputType.FILE);
        FileUtils.copyFile (foto, new File ("C:\\Users\\eduardoqueiroz\\IdeaProjects\\ceac\\target\\prints\\" + pastaPrint + ".png"));
    }

    @Before
    public void SetUp() {

        url = "http://ceaccontrol.test.br.kworld.kpmg.com/UserGroups";
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
    public void CT046_ValidarAcessoGrupoFuncao() {
        profgrupofuncao = new PageProfissionalGrupoFuncao (driver);

        profgrupofuncao.ValidaAcessoPagina ();
    }

    @Test
    public void CT047_AssociarProfissionalAoGrupo() {
        profgrupofuncao = new PageProfissionalGrupoFuncao (driver);

        profgrupofuncao.ClicarBotaoNovo ();
        profgrupofuncao.Wait ();
        profgrupofuncao.SelecionarFiltroMatricula ();
        profgrupofuncao.Wait ();
        profgrupofuncao.ClicarSalvar ();
        profgrupofuncao.ValidaCadastroSucesso ();
        profgrupofuncao.ClicarBtnOK ();
    }

    @Test
    public void CT048_AssociarMesmoUsuarioAoGrupo() {
        profgrupofuncao = new PageProfissionalGrupoFuncao (driver);

        profgrupofuncao.ClicarBotaoNovo ();
        profgrupofuncao.Wait ();
        profgrupofuncao.SelecionarFiltroMatricula ();
        profgrupofuncao.ClicarSalvar ();
        profgrupofuncao.ValidaCadastroDuplicado ();
        profgrupofuncao.ClicarVoltar ();
    }

    @Test
    public void CT049_EditarCadastroProfFuncao() {
        profgrupofuncao = new PageProfissionalGrupoFuncao (driver);

        profgrupofuncao.BuscarRegistro ();
        profgrupofuncao.SelecionarRegistro ();
        profgrupofuncao.ClicarEditar ();
        profgrupofuncao.EditarRegistroCampoGrupo ();
        profgrupofuncao.ClicarSalvar ();
        profgrupofuncao.ValidaAtualizadoSucesso ();
        profgrupofuncao.ClicarBtnOK ();

    }

    @Test
    public void CT050_ExcluirCadastroProfGrupoFunc() {
        profgrupofuncao = new PageProfissionalGrupoFuncao (driver);

        profgrupofuncao.BuscarRegistro ();
        profgrupofuncao.SelecionarRegistro ();
        profgrupofuncao.ClicarExcluir ();
        profgrupofuncao.ValidarMsgConfirmacaoExclusao ();
        profgrupofuncao.ClicarOKExclusao ();
        profgrupofuncao.ValidaMsgExcluidoSucesso ();
        profgrupofuncao.ClicarOKExcluidoSucesso ();
    }

    @Test
    public void CT053_PesquisarCeacsPorId() {
        profgrupofuncao = new PageProfissionalGrupoFuncao (driver);
        profgrupofuncao.BuscarRegistro ();

    }

}
