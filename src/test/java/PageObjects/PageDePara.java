package PageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

import static com.codeborne.selenide.Selenide.sleep;
import static org.junit.Assert.assertEquals;

public class PageDePara extends PageObjects {


    //De Para S�cios
    @FindBy(xpath = "//*[@id='navbar']/ul[1]/li[9]/ul/li[4]")
    private WebElement telaDePara;

    @FindBy(id = "New")
    private WebElement btnNovo;

    @FindBy(xpath = "//li[@class='actionBarEditLine']")
    private WebElement btnEditar;

    @FindBy(xpath = "//li[@class='actionBarEditLine'][2]")
    private WebElement btnExcluir;

    @FindBy(id = "ToolTables_tableUserFromTo_1")
    private WebElement btnImprimir;

    @FindBy(xpath = "/html/body/div[1]/div/div/h1")
    private WebElement nomeTela;

    //Cadastro De Para S�cios

    @FindBy(id = "SaveForm")
    private WebElement btnSalvarModal;

    @FindBy(id = "CloseModal")
    private WebElement btnVoltarModal;

    @FindBy(id = "NGGC_NAME")
    private WebElement campoNomeSistemaNGGC;

    @FindBy(id = "EMP_NO")
    private WebElement campoMatricula;

    @FindBy(id = "EMP_NAME")
    private WebElement campoNome;

    @FindBy(id = "POSITION_DESCRIPTION")
    private WebElement campoCargo;

    @FindBy(id = "OFFICE_NAME")
    private WebElement campoEscritorio;

    @FindBy(id = "BU_HUMANUS_DESCRIPTION")
    private WebElement campoDescricaoBU;

    @FindBy(id = "NGGC_NAME-error")
    private WebElement errorMessageNGGC;

    @FindBy(id = "EMP_NO-error")
    private WebElement errorMessageMatricula;

    //Modal Salvo com sucesso.
    @FindBy(xpath = "//div[@class='alert alert-success']//strong")
    private WebElement mensagemSucesso;

    @FindBy(xpath = "//div[@class='bootstrap-dialog-footer-buttons']//button")
    private WebElement btnOKSucesso;

    //Modal Atualizado com suesso.
    @FindBy(xpath = "//div[@class='modalMessage alert-success']//strong")
    private WebElement messageExcluido;

    @FindBy(xpath = "//div[@class='bootstrap-dialog-footer-buttons']//button")
    private WebElement btnOkExcluido;

    //Modal Exclu�do com sucesso.

    @FindBy(xpath = "//div[@class='bootstrap-dialog-message']")
    private WebElement mensagemConfirmacao;

    @FindBy(xpath = "//div[@class='bootstrap-dialog-footer-buttons']//button[1]")
    private WebElement btnSim;

    @FindBy(xpath = "//div[@class='alert alert-success']//strong")
    private WebElement messageAtualizado;

    @FindBy(xpath = "//div[@class='bootstrap-dialog-footer-buttons']//button[1]")
    private WebElement btnOkAtualizado;


    //Filtros Tela De Para
    @FindBy(id = "NGGC_NAME_FILTER")
    private WebElement filtroNomeNGGC;

    @FindBy(id = "EMP_NO_FILTER")
    private WebElement filtroMatricula;

    @FindBy(id = "NAME_FILTER")
    private WebElement filtroNome;

    @FindBy(id = "POSITION_FILTER")
    private WebElement filtroCargo;

    @FindBy(id = "OFFICE_FILTER")
    private WebElement filtroEscritorio;

    @FindBy(id = "BU_DESCRIPTION_FILTER")
    private WebElement filtroDescricao;

    @FindBy(id = "btnSearch")
    private WebElement btnAplicarFiltros;

    @FindBy(id = "btnClean")
    private WebElement btnLimparFiltros;

    //Registro da tabela de resultados
    @FindBy(xpath = "//*[@id=\"530\"]/td[1]")
    private WebElement registroNomeNGGC;

    @FindBy(xpath = "//*[@id=\"530\"]/td[2]")
    private WebElement registroMatricula;

    @FindBy(xpath = "//*[@id=\"530\"]/td[3]")
    private WebElement registroNome;

    @FindBy(xpath = "//*[@id=\"530\"]/td[4]")
    private WebElement registroCargo;

    @FindBy(xpath = "//*[@id=\"530\"]/td[5]")
    private WebElement registroEscritorio;

    @FindBy(xpath = "//*[@id=\"530\"]/td[6]")
    private WebElement registroDescriao;

    @FindBy(xpath = "//tbody[@id='bodyTableUserFromTo']")
    private WebElement registroTabela;

    //SUPERDRIVER
    public PageDePara(WebDriver driver) {
        super (driver);
        // TODO Auto-generated constructor stub
    }

    public void ClicarNovoCadastro() {
        this.btnNovo.click ();
    }

    public void ClicarEditar() {
        this.btnEditar.click ();
    }

    public void ClicarExcluir() {
        this.btnExcluir.click ();
    }

    public void ClicarImprimir() {
        this.btnImprimir.click ();
    }

    //Novo Cadastro De Para
    public void ClicarSalvar() {
        this.btnSalvarModal.click ();
    }

    public void ClicarVoltar() {
        this.btnVoltarModal.click ();
    }

    public void PreencheNomeNGGC() {
        this.campoNomeSistemaNGGC.clear ();
        this.campoNomeSistemaNGGC.sendKeys ("Fernandes Nicola, Rafael");
    }

    public void PreencheNomeNGGCEditar() {
        this.campoNomeSistemaNGGC.clear ();
        this.campoNomeSistemaNGGC.sendKeys ("Fernandes Nicola, Rafaels");
    }

    public void PreencherMatricula() {
        this.campoMatricula.clear ();
        this.campoMatricula.sendKeys ("25601");
        this.Wait ();
        this.campoMatricula.sendKeys (Keys.TAB);
    }


    public void ValidaNome() {
        String nome = this.campoNome.getText ();
        String cargo = this.campoCargo.getText ();
        String escritorio = this.campoEscritorio.getText ();
        String descricaoBU = this.campoDescricaoBU.getText ();

        String expectedNome = "Rafael Fernandes Nicola";
        String expectedEscritorio = "BRASIL";
        String expectedCargo = "Analista de Sistemas Sr";
        String expectedDescricao = "BRA IT";

        assertEquals (nome, expectedNome);
        assertEquals (cargo, expectedCargo);
        assertEquals (escritorio, expectedEscritorio);
        assertEquals (descricaoBU, expectedDescricao);
    }

    public void ValidaCampoObrigatorio() {
        String errorNGGC = this.errorMessageNGGC.getText ();
        String errorMatricula = this.errorMessageMatricula.getText ();

        assertEquals (errorNGGC, "� necess�rio fornecer o nome do profissional da mesma forma que est� no sistema NGGC!");
        assertEquals (errorMatricula, "� necess�rio fornecer a matr�cula do profissional!");
    }

    public void GotToPage() {
        this.telaDePara.click ();
    }

    public void ValidaNomeTela() {
        String nomeTela = this.nomeTela.getText ();
        String expectedResult = "De / Para Sócios e Gerentes";

        assertEquals (nomeTela, expectedResult);
    }

    public void CadastroSalvoComSuesso() {
        String sucesso = this.mensagemSucesso.getText ();
        assertEquals (sucesso, "Salvo com sucesso!");
        this.btnOKSucesso.click ();
    }

    public void CadastroAtualizadoComSuesso() {
        String sucesso = this.messageAtualizado.getText ();
        assertEquals (sucesso, "Atualizado com sucesso!");
        this.btnOkAtualizado.click ();
    }

    public void AlertaExluir() {
        this.btnSim.click ();
    }

    public void ConfirmaExclusao() {
        this.btnSim.click ();
    }

    public void CadastroExcluidoComSucesso() {
        String sucesso = this.messageExcluido.getText ();
        assertEquals (sucesso, "Usuário excluído com sucesso!");
        this.btnOkExcluido.click ();
    }

    public void FiltroNomeNGGC() {
        this.filtroNomeNGGC.clear ();
        this.filtroNomeNGGC.sendKeys ("Fernandes Nicola, Rafael");
        ;
    }

    public void FiltroMatricula() {
        this.filtroMatricula.clear ();
        this.filtroMatricula.sendKeys ("25601");
    }

    public void FiltroCargo() {
        this.filtroCargo.clear ();
        this.filtroCargo.sendKeys ("Analista de Sistemas Sr");
    }

    public void FiltroEscritorio() {
        this.filtroEscritorio.clear ();
        this.filtroEscritorio.sendKeys ("BRASIL");
    }

    public void FiltroDescricaoBU() {
        this.filtroDescricao.clear ();
        this.filtroDescricao.sendKeys ("BRA IT");
    }

    public void ClicarAplicarFiltros() {
        this.btnAplicarFiltros.click ();
    }

    public void ClicarLimparFiltros() {
        this.btnLimparFiltros.click ();
    }

    //Validar preenchimento de todos os filtros e validar o registro encontrdao da busca.

    public void BuscarRegistro() {
        this.filtroNomeNGGC.clear ();
        this.filtroNomeNGGC.sendKeys ("");
        this.filtroMatricula.clear ();
        this.filtroMatricula.sendKeys ("25601");
        this.filtroCargo.clear ();
        this.filtroCargo.sendKeys ("");
        this.filtroEscritorio.clear ();
        this.filtroEscritorio.sendKeys ("");
        this.filtroNome.clear ();
        this.filtroNome.sendKeys ("");
        this.filtroDescricao.clear ();
        this.filtroDescricao.sendKeys ("");
    }

    public void validaRegistro() {
        sleep(1000);
        String nomeNGGC = this.registroNomeNGGC.getText ();
        String matricula = this.registroMatricula.getText ();
        String cargo = this.registroCargo.getText ();
        String escritorio = this.registroEscritorio.getText ();
        String descricao = this.registroDescriao.getText ();

        assertEquals (nomeNGGC, "Fernandes Nicola, Rafael");
        assertEquals (matricula, "25601");
        assertEquals (cargo, "Analista de Sistemas Sr");
        assertEquals (escritorio, "BRASIL");
        assertEquals (descricao, "BRA IT");

    }

    public void AcessarTelaDePara() {
        this.telaDePara.click ();
    }

    public void Wait() {

        this.driver.manage ().timeouts ().implicitlyWait (3, TimeUnit.SECONDS);
    }

    public void SelecionarRegitro() {
        this.registroTabela.click ();
    }

}
