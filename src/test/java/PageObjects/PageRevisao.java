package PageObjects;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class PageRevisao {



    //Validações

    public PageRevisao validaOpenRevisao () {
        sleep (1000);
        String validaTelaRevisao = $ (By.xpath ("/html/body/div[1]/div/div/h1")).getText ();
        String msgTelaRevisao = "Revisão";
        return this;
    }

}
