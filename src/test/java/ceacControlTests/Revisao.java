package ceacControlTests;

import PageObjects.PageRevisao;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.closeWindow;
import static com.codeborne.selenide.Selenide.open;

public class Revisao {


    protected static PageRevisao revisaoCeacs;

    @BeforeMethod
    public void start() {

        ChromeOptions options = new ChromeOptions ();
        options.setExperimentalOption ("useAutomationExtension", false);
        WebDriver driver = new ChromeDriver (options);
        driver.manage ().window ().maximize ();
        WebDriverRunner.setWebDriver (driver);
        Configuration.browser = "chrome";
        baseUrl = "http://ceaccontrol.test.br.kworld.kpmg.com";
        open ("/Review");
        revisaoCeacs = new PageRevisao ();
    }

    @Test
    public void CT087_acessaTelaRevisaoDeCeacs (){
        revisaoCeacs
                .validaOpenRevisao ();

    }



    @AfterMethod
    public void End (){

        closeWindow ();

    }
}
