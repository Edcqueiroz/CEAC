package ceacControlTests;

import PageObjects.PageGruposRevisao;
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
public class ceacControl2GruposRevisao {

    //Função de apoio - Printscreen
    static String pastaPrint = new SimpleDateFormat ("yyyy-MM-dd HH-mm").format (Calendar.getInstance ().getTime ());
    String url;
    WebDriver driver;
    //Páginas Objetos
    PageGruposRevisao gruporevisao;

    public void Print(String nomePrint) throws IOException {

        File foto = ((TakesScreenshot) driver).getScreenshotAs (OutputType.FILE);
        FileUtils.copyFile (foto, new File ("C:\\Users\\eduardoqueiroz\\IdeaProjects\\ceac\\target\\prints\\" + pastaPrint + ".png"));
    }

    @Before
    public void SetUp() {

        url = "http://ceaccontrol.test.br.kworld.kpmg.com/Group";
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
    public void CT041_ValidarAcessoGrupoRevisao() {
        gruporevisao = new PageGruposRevisao (driver);

        gruporevisao.ValidaPagina ();
    }

    @Test
    public void CT042_CadatrarGrupoRevisao() {
        gruporevisao = new PageGruposRevisao (driver);

        gruporevisao.Wait ();
        gruporevisao.ClicarNovo ();
        gruporevisao.Wait ();
        gruporevisao.PreencherDescricao ();
        gruporevisao.Wait ();
        gruporevisao.SalvarNovoCadastro ();
        gruporevisao.Wait ();
        gruporevisao.ValidaCadastro ();
        gruporevisao.Wait ();
        gruporevisao.ClicarOKSalvoSucesso ();
    }

    @Test
    public void CT043_CadastrarGrupoRevisaoDuplicado() {
        gruporevisao = new PageGruposRevisao (driver);

        gruporevisao.Wait ();
        gruporevisao.ClicarNovo ();
        gruporevisao.Wait ();
        gruporevisao.PreencherDescricao ();
        gruporevisao.Wait ();
        gruporevisao.SalvarNovoCadastro ();
        gruporevisao.Wait ();
        gruporevisao.ValidarCadastroDuplicado ();
    }

    @Test
    public void CT044_EditarCadastroGrupoRevisao() {
        gruporevisao = new PageGruposRevisao (driver);

        gruporevisao.BuscarRegistro ();
        gruporevisao.Wait ();
        gruporevisao.SelecionarRegistro ();
        gruporevisao.Wait ();
        gruporevisao.ClicarEditar ();
        gruporevisao.Wait ();
        gruporevisao.PreencherDescricaoEditar ();
        gruporevisao.SalvarNovoCadastro ();
        gruporevisao.ValidarAtualizacao ();
        gruporevisao.ClicarOKAtualizacao ();
    }

    @Test
    public void CT045_ExcluirCadastroComUsuariosVinculados() {
        gruporevisao = new PageGruposRevisao (driver);

        gruporevisao.BuscarGrupoExclusao ();
        gruporevisao.Wait ();
        gruporevisao.SelecionarRegistro ();
        gruporevisao.ClicarExcluir ();
        gruporevisao.Wait ();
        gruporevisao.ExcluirDecisao ();
        gruporevisao.Wait ();
        gruporevisao.ClicarExcluirSim ();
        gruporevisao.Wait ();
        gruporevisao.ValidaAlertaExcluir ();
        gruporevisao.ValidarAlertaExcluirOK ();
    }

    @Test
    public void CT046_ExcluirGrupoRevisao() {
        gruporevisao = new PageGruposRevisao (driver);

        gruporevisao.BuscaRegistroExcluir ();
        gruporevisao.Wait ();
        gruporevisao.SelecionarRegistro ();
        gruporevisao.Wait ();
        gruporevisao.ClicarExcluir ();
        gruporevisao.Wait ();
        gruporevisao.ExcluirDecisao ();
        gruporevisao.ClicarExcluirSim ();
        gruporevisao.ExcluidoSucesso ();
    }


}
