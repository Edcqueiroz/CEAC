package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class PageProfissionalGrupoFuncao extends PageObjects {

    private static final String Keys = null;


    //Tela Profissionais por Grupo/Fun��o
    @FindBy(xpath = "/html/body/div[1]/div/div/h1")
    private WebElement pageName;


    @FindBy(id = "New")
    private WebElement btnNovo;

    @FindBy(id = "Edit")
    private WebElement btnEditar;


    @FindBy(id = "ToolTables_tableUserGroups_1")
    private WebElement btnImprimir;

    @FindBy(xpath = "//*[@id='tableUserGroups_filter']//input")
    private WebElement fieldBusca;


    //****************************************
    //Tela Novo Profissional por Grupo e Fun��o
    @FindBy(id = "EMP_NO")
    private WebElement filterMatricula;

    @FindBy(xpath = "/html/body/div[4]/div/div/div[2]/div/div/div/form/div[2]/div[3]/div/div/button/span[1]")
    private WebElement filterGrupoClicable;

    @FindBy(xpath = "/html/body/div[4]/div/div/div[2]/div/div/div/form/div[2]/div[3]/div/div/div/ul/li[2]/a/span[1]")
    private WebElement filterGrupoSelectable;

    @FindBy(xpath = "//*[@id='formUserGroups']/div[2]/div[2]/div/div/div")
    private WebElement listGroup;


    @FindBy(name = "//*[@id='formUserGroups']/div[2]/div[3]/div/div/button")
    private WebElement filterFuncaoClicable;

    @FindBy(id = "EMP_NAME")
    private WebElement fieldNome;

    @FindBy(id = "POSITION_DESCRIPTION")
    private WebElement fieldCargo;

    @FindBy(id = "OFFICE_NAME")
    private WebElement fieldEscritorio;

    @FindBy(id = "BU_HUMANUS_DESCRIPTION")
    private WebElement fieldBU;

    @FindBy(id = "SaveForm")
    private WebElement btnSalvarCadastro;

    @FindBy(id = "CloseModal")
    private WebElement btnVoltar;

    @FindBy(xpath = "//*[@class='bootstrap-dialog-body']//strong")
    private WebElement msgCadastroSucesso;

    @FindBy(xpath = "//*[@class='bootstrap-dialog-footer']//button")
    private WebElement btnMsgSalvoSucesso;

    @FindBy(xpath = "//*[@id='formUserGroups']//strong")
    private WebElement msgProfDuplicado;


    //****************************************
    //Tabela de Registros

    @FindBy(xpath = "//*[@id='bodyTableUserGroups']//tr//td")
    private WebElement selecionaRegistro;


    //****************************************
    //Registro Atualizado com sucesso.
    @FindBy(xpath = "//*[@class='modal-body']//strong")
    private WebElement msgAtualizadoSucesso;


    //****************************************
    //Excluir Registro

    @FindBy(id = "Delete")
    private WebElement btnExcluir;

    @FindBy(xpath = "//*[@class='bootstrap-dialog-body']//div")
    private WebElement msgConfirmaExclusao;

    @FindBy(xpath = "//*[@class='bootstrap-dialog-footer']//button")
    private WebElement btnOkExcluir;


    @FindBy(xpath = "//*[@class='modal-body']//strong")
    private WebElement msgExcluidoSucesso;

    @FindBy(xpath = "//*[@class='bootstrap-dialog-footer-buttons']//button")
    private WebElement btnOkExcluidoSucesso;

    //****************************************

    public PageProfissionalGrupoFuncao(WebDriver driver) {
        super (driver);
        // TODO Auto-generated constructor stub
    }

    public void Wait() {

        this.driver.manage ().timeouts ().implicitlyWait (3, TimeUnit.SECONDS);
    }


    public void ValidaAcessoPagina() {
        String expectedResult = "Profissional Por Grupo e Função";
        String result = this.pageName.getText ();

        assertEquals (expectedResult, result);
    }

    public void ClicarBotaoNovo() {
        driver.manage ().timeouts ().implicitlyWait (3, TimeUnit.SECONDS);
        this.btnNovo.click ();
    }

    public void SelecionarFiltroMatricula() {

        String matricula = "18193";

        driver.manage ().timeouts ().implicitlyWait (3, TimeUnit.SECONDS);
        this.filterMatricula.clear ();
        driver.manage ().timeouts ().implicitlyWait (5, TimeUnit.SECONDS);
        this.filterMatricula.sendKeys (org.openqa.selenium.Keys.chord (matricula));
        driver.manage ().timeouts ().implicitlyWait (5, TimeUnit.SECONDS);
        this.filterMatricula.sendKeys (org.openqa.selenium.Keys.TAB);
    }


    public void SelecionarFiltroGrupo() {
        this.filterGrupoClicable.click ();
        driver.manage ().timeouts ().implicitlyWait (3, TimeUnit.SECONDS);
        this.filterGrupoSelectable.click ();
        //Select dropdownFiltroGrupo = new Select(filterGrupoSelectable);
        //dropdownFiltroGrupo.deselectByVisibleText("GR2");

    }

    public void SelecionarFiltroFuncao() {
        this.filterFuncaoClicable.click ();
        driver.manage ().timeouts ().implicitlyWait (3, TimeUnit.SECONDS);
        Select dropdownFiltroFuncao = new Select (filterFuncaoClicable);
        dropdownFiltroFuncao.deselectByVisibleText ("Gerente Revisor");
    }

    public void ClicarSalvar() {
        driver.manage ().timeouts ().implicitlyWait (3, TimeUnit.SECONDS);
        this.btnSalvarCadastro.click ();
    }

    public void ValidaCadastroSucesso() {
        driver.manage ().timeouts ().implicitlyWait (3, TimeUnit.SECONDS);
        String expectedResult = "Salvo com sucesso!";
        String result = this.msgCadastroSucesso.getText ();

        assertEquals (expectedResult, result);
    }

    public void ClicarBtnOK() {
        driver.manage ().timeouts ().implicitlyWait (3, TimeUnit.SECONDS);
        this.btnMsgSalvoSucesso.click ();
    }

    public void ValidaCadastroDuplicado() {
        driver.manage ().timeouts ().implicitlyWait (3, TimeUnit.SECONDS);
        String expectedResult = "Profissional/Grupo/Função já está cadastrado!";
        String result = this.msgProfDuplicado.getText ();

        assertEquals (expectedResult, result);
    }

    public void ClicarVoltar() {
        driver.manage ().timeouts ().implicitlyWait (3, TimeUnit.SECONDS);
        this.btnVoltar.click ();
    }


    //Buscar Registro
    public void BuscarRegistro() {
        driver.manage ().timeouts ().implicitlyWait (3, TimeUnit.SECONDS);
        this.fieldBusca.sendKeys ("Willians");
    }

    public void SelecionarRegistro() {
        driver.manage ().timeouts ().implicitlyWait (3, TimeUnit.SECONDS);
        this.selecionaRegistro.click ();
    }

    //Editar Registro
    public void ClicarEditar() {
        driver.manage ().timeouts ().implicitlyWait (3, TimeUnit.SECONDS);
        this.btnEditar.click ();
    }

    public void EditarRegistroCampoGrupo() {
        driver.manage ().timeouts ().implicitlyWait (5, TimeUnit.SECONDS);
        this.filterGrupoClicable.click ();
        driver.manage ().timeouts ().implicitlyWait (5, TimeUnit.SECONDS);
        this.filterGrupoSelectable.click ();
//		Select dropdownFiltroGrupo = new Select(filterGrupoSelectable);
//		dropdownFiltroGrupo.deselectByVisibleText("GR2");
    }

    public void EditarRegistroCampoFuncao() {
        driver.manage ().timeouts ().implicitlyWait (3, TimeUnit.SECONDS);
        this.filterFuncaoClicable.click ();
        driver.manage ().timeouts ().implicitlyWait (3, TimeUnit.SECONDS);
        Select dropdownFiltroFuncao = new Select (filterFuncaoClicable);
        dropdownFiltroFuncao.selectByVisibleText ("Revisor");
    }

    public void ValidaAtualizadoSucesso() {
        driver.manage ().timeouts ().implicitlyWait (3, TimeUnit.SECONDS);
        String result = this.msgAtualizadoSucesso.getText ();
        String expectedResult = "Atualizado com sucesso!";

        assertEquals (result, expectedResult);
    }

    //Excluir Registro
    public void ClicarExcluir() {
        driver.manage ().timeouts ().implicitlyWait (3, TimeUnit.SECONDS);
        this.btnExcluir.click ();
    }

    public void ValidarMsgConfirmacaoExclusao() {
        driver.manage ().timeouts ().implicitlyWait (3, TimeUnit.SECONDS);
        String expectedResult = "Deseja realmente excluir este usuário?";
        String result = this.msgConfirmaExclusao.getText ();

        assertEquals (expectedResult, result);
    }

    public void ClicarOKExclusao() {
        driver.manage ().timeouts ().implicitlyWait (3, TimeUnit.SECONDS);
        this.btnOkExcluir.click ();
    }

    public void ValidaMsgExcluidoSucesso() {
        driver.manage ().timeouts ().implicitlyWait (3, TimeUnit.SECONDS);
        String reuslt = this.msgExcluidoSucesso.getText ();
        String expectedResult = "Funcionário excluído com sucesso!";

        assertEquals (reuslt, expectedResult);
    }

    public void ClicarOKExcluidoSucesso() {
        driver.manage ().timeouts ().implicitlyWait (3, TimeUnit.SECONDS);
        this.btnOkExcluidoSucesso.click ();
    }

}