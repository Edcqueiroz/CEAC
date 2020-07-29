package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

import static com.codeborne.selenide.Selenide.sleep;
import static org.junit.Assert.assertEquals;

public class PageGruposRevisao extends PageObjects {

    //Tela Grupos de Revis�o
    @FindBy(xpath = "/html/body/div[1]/div/div/h1")
    private WebElement pageName;

    @FindBy(id = "New")
    private WebElement btnNovo;

    @FindBy(id = "ToolTables_tableGroup_1")
    private WebElement btnImprimir;

    @FindBy(xpath = "//*[@id='bodyTableGroup']//tr//td")
    private WebElement registroTabela;

    @FindBy(xpath = "//*[@id='tableGroup_filter']//label//input")
    private WebElement buscaGrupoRevisao;

    @FindBy(id = "Delete")
    private WebElement btnExcluir;

    //TelaExcluir
    @FindBy(xpath = "/html/body/div[4]/div/div/div[2]/div/div")
    private WebElement deleteMessage;

    @FindBy(xpath = "//*[@class='modal-footer']//button")
    private WebElement btnExcluirSim;

    @FindBy(xpath = "//*[@class='bootstrap-dialog-message']//div")
    private WebElement validaUserGrupoMessage;

    @FindBy(xpath = "//*[@class='modal-footer']//button")
    private WebElement btnValidaUserGrupoMessageOK;

    //Tela de Cadastro de Grupo de Revis�o
    @FindBy(id = "SaveForm")
    private WebElement btnSalvarCadastro;

    @FindBy(id = "CloseModal")
    private WebElement btnVoltar;

    @FindBy(id = "DESCRIPTION")
    private WebElement campoDescricao;

    @FindBy(xpath = "//*[@class='alert alert-success']//strong")
    private WebElement salvoComSucesso;

    @FindBy(xpath = "//*[@class='bootstrap-dialog-footer']//div//button")
    private WebElement btnOKCadastroSucesso;

    @FindBy(xpath = "/html/body/div[4]/div/div/div[2]/div/div/div/div/strong")
    private WebElement excluidoComSucessoMessage;

    @FindBy(xpath = "//*[@id=\"e4ecb0bb-9295-492b-ab89-d21d16fc07ea\"]")
    private WebElement btnExcluidoSucessoOK;

    @FindBy(id = "Edit")
    private WebElement btnEditar;

    //Modal Autalizado com sucesso.
    @FindBy(xpath = "//*[@class='alert alert-success']//strong")
    private WebElement atualizadoComSucesso;

    @FindBy(xpath = "//*[@class='modal-footer']//button")
    private WebElement btnOkAtualizadoSucesso;

    //Validar Grupo Revisao Repetido
    @FindBy(xpath = "//*[@id='ErrorDiv']//strong")
    private WebElement cadastroDuplicadoMessage;


    public PageGruposRevisao(WebDriver driver) {
        super (driver);
        // TODO Auto-generated constructor stub
    }

    public void ClicarNovo() {
        this.btnNovo.click ();
    }

    public void PreencherDescricao() {
        this.campoDescricao.clear ();
        this.campoDescricao.sendKeys ("T1");
    }

    public void PreencherDescricaoEditar() {
        this.campoDescricao.clear ();
        this.campoDescricao.sendKeys ("T2");
    }

    public void SalvarNovoCadastro() {
        this.btnSalvarCadastro.click ();
    }

    public void CancelarCadastro() {
        this.btnVoltar.click ();
    }

    public void BuscarRegistro() {
        this.buscaGrupoRevisao.clear ();
        this.buscaGrupoRevisao.sendKeys ("T1");
    }


    //Asserts
    public void ValidaPagina() {
        String pageName = this.pageName.getText ();
        String expectedResult = "Grupos de Revis�o";

        assertEquals (pageName, expectedResult);
    }

    public void ValidaCadastro() {

        String salvoSucesso = this.salvoComSucesso.getText ();
        String expectedResult = "Salvo com sucesso!";

        assertEquals (salvoSucesso, expectedResult);
    }

    public void ClicarOKSalvoSucesso() {
        this.btnOKCadastroSucesso.click ();
    }

    public void BuscarGrupo() {
        this.buscaGrupoRevisao.clear ();
        this.buscaGrupoRevisao.sendKeys ("T1");
        ;
    }

    public void BuscarGrupoExcluir() {
        this.buscaGrupoRevisao.clear ();
        this.buscaGrupoRevisao.sendKeys ("T2");
    }

    public void SelecionarRegistro() {
        this.registroTabela.click ();
    }

    public void ClicarEditar() {
        this.btnEditar.click ();
    }

    public void ValidarAtualizacao() {
        String expectedResult = "Atualizado com sucesso!";
        String result = atualizadoComSucesso.getText ();

        assertEquals (expectedResult, result);
    }

    public void ClicarOKAtualizacao() {
        this.btnOkAtualizadoSucesso.click ();
    }


    //**************Excluir Grupos**************

    public void BuscarGrupoExclusao() {
        this.buscaGrupoRevisao.sendKeys ("GR1");
    }


    public void ClicarExcluir() {
        this.btnExcluir.click ();
    }

    public void ExcluirDecisao() {
        String expectedResult = "Deseja realmente excluir este grupo?";
        String result = this.deleteMessage.getText ();

        assertEquals (expectedResult, result);
    }

    public void ClicarExcluirSim() {
        this.btnExcluirSim.click ();
    }

    public void ValidaAlertaExcluir() {
        String primeiraLinha ="O grupo de revisão \"GR1\" contém profissionais vinculados.";
        String segundaLinha = "Remova os profissionais vinculados ao grupo e tente fazer a exclusão novamente.";
        String expectedResult = primeiraLinha + "\n" + segundaLinha;
        String result = this.validaUserGrupoMessage.getText ();

        assertEquals (expectedResult, result);

    }

    public void ValidarAlertaExcluirOK() {
        this.btnValidaUserGrupoMessageOK.click ();
    }

    public void ExcluidoSucesso() {
        String expectedResult = "Grupo excluído com sucesso!";
        String result = this.excluidoComSucessoMessage.getText ();

        assertEquals (expectedResult, result);

        this.btnExcluidoSucessoOK.click ();
    }

    public void Wait() {

        this.driver.manage ().timeouts ().implicitlyWait (3, TimeUnit.SECONDS);
    }

    public void ValidarCadastroDuplicado() {
        String expecteResult = "Grupo já está cadastrado!";
        String result = this.cadastroDuplicadoMessage.getText ();

        assertEquals (expecteResult, result);
    }

    public void BuscaRegistroExcluir() {
        this.buscaGrupoRevisao.sendKeys ("T2");
    }

}
