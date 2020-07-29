package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.util.regex.Pattern;

import static java.util.concurrent.TimeUnit.SECONDS;
import static org.junit.Assert.assertEquals;

public class PageGerenciamentoSPAuditRM extends PageObjects {
    String dependenteSim = "Sim";
    WebDriver driver;

    @FindBy(xpath = "/html/body/div[1]/div/div/h1")
    private WebElement pageName;

    @FindBy(id = "Upload")
    private WebElement btnRealizarUploadPlanilha;

    @FindBy(xpath = "//*[@class='modal-content']//div[3]//button")
    private WebElement btnErrosEncontradosPlanilha;

    @FindBy(xpath = "//*[@id='error-list']/li[1]/ul/li")
    private WebElement msgErroPlanilha;

    @FindBy(xpath = "/html/body/div[5]/div[2]/div/div/div/div/div/div/div/div[4]/button")
    private WebElement btnErrosPlanilhaOK;

    @FindBy(xpath = "//*[@class='bootstrap-dialog-footer-buttons']//button[2]")
    private WebElement btnFecharImportacaoPlanilha;

    @FindBy(id = "chk-ceac-item-all")
    private WebElement btnSelecionarTodos;

    @FindBy(xpath = "//*[@class='modalMessage alert-success']//strong")
    private WebElement msgUploadSucesso;

    @FindBy(xpath = "//*[@class='btn btn-primary btn-sm']")
    private WebElement btnSucessoOk;


    @FindBy(xpath = "//*[@class='bootstrap-dialog-footer']//button")
    private WebElement btnIncluirCEACsSelecionados;

    ////Filtros Gerenciamento SP Audit RM

    @FindBy(id = "CEAC_ID_FILTER")
    private WebElement filterCEACId;

    @FindBy(xpath = "//*[@id=\"tableAllFieldsCeacs_wrapper\"]/div[6]/div[1]/div[2]/div/div/button/span[1]")
    private WebElement filterCEACTypeClick;

    @FindBy(xpath = "//*[@id='tableAllFieldsCeacs_wrapper']/div[6]/div[1]/div[2]/div/div/div/ul/li[2]")
    private WebElement filterCeacTypeOptionsClient;

    @FindBy(id = "CLIENT_NAME_FILTER")
    private WebElement filterClientName;

    @FindBy(id = "OFFICE_FILTER")
    private WebElement filterOffice;

    @FindBy(id = "PARTNER_FILTER")
    private WebElement filterPartnerNGGC;

    @FindBy(id = "MANAGER_FILTER")
    private WebElement filterManagerNGGC;

    @FindBy(id = "AGING_START_FILTER")
    private WebElement filterDiasProcessoDe;

    @FindBy(id = "AGING_END_FILTER")
    private WebElement filterDiasProcessoAte;

    @FindBy(id = "URGENCY")
    private WebElement filterUrgente;

    @FindBy(id = "btnSearch")
    private WebElement btnAplicarFiltros;

    @FindBy(id = "btnClean")
    private WebElement btnLimparFiltros;

    @FindBy(xpath = "//*[@id=\"tableAllFieldsCeacs_wrapper\"]/div[6]/div[4]/div[2]/div/div/button/span[1]")
    private WebElement aprovadorOversight;

    @FindBy (xpath = "//*[@id=\"tableAllFieldsCeacs_wrapper\"]/div[6]/div[4]/div[3]/div/div/button/span[1]")
    private WebElement preAprovador;

    @FindBy(xpath = "//*[@id=\"tableAllFieldsCeacs_wrapper\"]/div[6]/div[2]/div[4]/div/div/button/span[1]")
    private WebElement projeto;


    //Tabela de Registros CEAC
    @FindBy(xpath = "//*[@id='bodyTableAllFieldsCeacs']/tr/td[6]")
    private WebElement ceacIDRow;

    @FindBy(xpath = "//*[@id='bodyTableAllFieldsCeacs']/tr/td[7]")
    private WebElement ceacTypeRow;

    @FindBy(xpath = "//*[@id='bodyTableAllFieldsCeacs']/tr/td[8]")
    private WebElement evaluationTypeRow;

    @FindBy(xpath = "//*[@id='bodyTableAllFieldsCeacs']/tr/td[9]")
    private WebElement clientNameRow;

    @FindBy(xpath = "//*[@id='bodyTableAllFieldsCeacs']/tr/td[10]")
    private WebElement riskGradeRow;

    @FindBy(xpath = "//*[@id='bodyTableAllFieldsCeacs']/tr/td[11]")
    private WebElement officeRow;

    @FindBy(xpath = "//*[@id='bodyTableAllFieldsCeacs']/tr/td[12]")
    private WebElement matriculaRow;

    @FindBy(xpath = "//*[@id='bodyTableAllFieldsCeacs']/tr/td[13]")
    private WebElement managerRow;

    @FindBy(xpath = "//*[@id='bodyTableAllFieldsCeacs']/tr/td[14]")
    private WebElement dateInitiallyRow;

    @FindBy(xpath = "//*[@id='bodyTableAllFieldsCeacs']/tr/td[15]")
    private WebElement projetoRow;

    @FindBy(xpath = "//*[@id='bodyTableAllFieldsCeacs']/tr/td[16]")
    private WebElement regualdaRow;

    @FindBy(xpath = "//*[@id='bodyTableAllFieldsCeacs']/tr/td[16]")
    private WebElement aprovadorCeacRow;

    @FindBy(xpath = "//*[@id='bodyTableAllFieldsCeacs']/tr/td[17]")
    private WebElement dependenciaRow;

    @FindBy(xpath = "//*[@id='bodyTableAllFieldsCeacs']/tr/td[18]")
    private WebElement diasProcessoRow;

    @FindBy(xpath = "//*[@id='bodyTableAllFieldsCeacs']/tr/td[19]")
    private WebElement statusRow;

    @FindBy(xpath = "//*[@id='bodyTableAllFieldsCeacs']/tr/td[20]")
    private WebElement grupoRevisorRow;

    @FindBy(xpath = "//*[@id='bodyTableAllFieldsCeacs']/tr/td[21]")
    private WebElement profissionalRevisorRow;

    @FindBy(xpath = "//*[@id='bodyTableAllFieldsCeacs']/tr/td[22]")
    private WebElement situacaoOversightRow;

    @FindBy(xpath = "//*[@id='bodyTableAllFieldsCeacs']/tr/td[23]")
    private WebElement profissionalRevisorOversightRow;

    @FindBy(xpath = "//*[@id='bodyTableAllFieldsCeacs']/tr/td[24]")
    private WebElement posicaoAprovacaoRow;

    @FindBy(xpath = "//*[@id='bodyTableAllFieldsCeacs']/tr/td[25]")
    private WebElement aprovadorAtualrow;

    @FindBy(xpath = "//*[@id='bodyTableAllFieldsCeacs']/tr/td[26]")
    private WebElement aprovadorExternoRow;

    @FindBy(xpath = "//*[@id='bodyTableAllFieldsCeacs']/tr/td[27]")
    private WebElement dataUploadRow;

    @FindBy(xpath = "//*[@id='bodyTableAllFieldsCeacs']/tr/td[28]")
    private WebElement dataInicioTrabalhoRow;

    @FindBy(xpath = "//*[@id='bodyTableAllFieldsCeacs']/tr/td[29]")
    private WebElement dataSANRow;

    @FindBy(xpath = "//*[@id=\"tableAllFieldsCeacs_wrapper\"]/div[6]/div[1]/div[2]/div/div/button/span[1]")
    private WebElement Type;

    @FindBy(xpath = "/html/body/div[1]/div/div/div[6]/div/div[4]/div/table/tbody/tr[1]/td[20]/a/span")
    private WebElement addDependente;

    @FindBy (xpath = "/html/body/div[4]/div/div/div[2]/div/div/div/nav/div/div/ul/li[1]/a")
    private WebElement pesquisaDependenteCeac;


    //Detalhes do CEAC
    @FindBy(id = "View")
    private WebElement btnVisualizar;

    //Editar CEAC
    @FindBy(id = "Edit")
    private WebElement btnEditar;

    @FindBy(id = "CEAC_TYPE_FILTER")
    private WebElement fieldCeacType; //Select Type

    @FindBy(name = "EVALUATION_TYPE_ID")
    private WebElement fieldEvaluationType; //Select Type

    @FindBy(name = "RISK_GRADE_ID")
    private WebElement fieldRiskGrade;

    @FindBy(name = "PROJECT_ID")
    private WebElement fieldProjectID;

    @FindBy(name = "CLIENT_NAME")
    private WebElement fieldClientName;

    @FindBy(name = "OFFICE")
    private WebElement fieldOffice;

    @FindBy(name = "DATE_INIT_SUBMIT_APPROVAL")
    private WebElement fieldDateInitiallySubmittedforApproval;

    @FindBy(name = "REGULATED")
    private WebElement fieldRegulada;

    @FindBy(name = "APPROVER_ON_CEAC")
    private WebElement fieldAprovadorCEAC;

    @FindBy(name = "PARTNER_EMP_NO")
    private WebElement fieldMatriculaPartner;

    @FindBy(id = "MANAGER_EMP_NO")
    private WebElement fieldMatriculaManager;

    @FindBy(name = "DATE_START_WORK")
    private WebElement fieldDataInicioTrabalho;

    @FindBy(name = "SAN_FIRST_SUBMIT")
    private WebElement fieldSubmissaoSan;

    @FindBy(name = "//*[@class='modal-footer']//button")
    private WebElement btnSalvar;

    @FindBy(xpath = "//*[@class='bootstrap-dialog-body']//strong")
    private WebElement msgAtualizadoSucesso;

    @FindBy(xpath = "//*[@class='modal-footer']//button")
    private WebElement btnOKAtualizacao;

    @FindBy(css = "input[aria-controls=tableCeacsDependency]")
    private WebElement buscaDependentes;

    @FindBy (xpath = "/html/body/div[6]/div/div/div[2]/div/div/div/div[5]/div/table/tbody/tr/td[5]/a/i")
    private WebElement addDependenteCeac;

    @FindBy (id = "CloseModal")
    private WebElement closeAddDependenteCeac;

    //Oversight
    @FindBy(id = "SetAsOversight")
    private WebElement btnMarcarOversight;
    @FindBy(id = "VENDOR_CREATED_BY")
    private WebElement solicitante;

    public PageGerenciamentoSPAuditRM(WebDriver driver) {
        super (driver);
        // TODO Auto-generated constructor stub
    }

    public void ValidaPaginaGerenciamento() {
        driver.manage ().timeouts ().implicitlyWait (4, SECONDS);

        String result = "Gerenciamento SP Audit RM";
        String expectedResult = this.pageName.getText ();

        assertEquals (result, expectedResult);
    }

    public void ClicarRealizarUploadPlanilha() {
        driver.manage ().timeouts ().implicitlyWait (4, SECONDS);
        btnRealizarUploadPlanilha.click ();

    }

    public void BlankFileUpload() throws IOException {

        driver.manage ().timeouts ().implicitlyWait (6, SECONDS);

        Runtime.getRuntime ().exec ("C:\\Users\\rafaelnicola\\ceac-control-workspace\\ceacControl\\support\\BlankFileUpload.exe");

//		driver.switchTo().activeElement();
//
//		//Copiando o arquivo para o "Clipoard"
//		StringSelection blankFile = new StringSelection("C:\\Users\\rafaelnicola\\ceac-control-workspace\\ceacControl\\fileUploads\\UploadDeCEACs-Branco.xlsx");
//		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(blankFile, null);
//
//		Robot robot = new Robot();
//
//		robot.keyPress(KeyEvent.VK_CONTROL);
//		robot.keyPress(KeyEvent.VK_V);
//		robot.keyRelease(KeyEvent.VK_V);
//		robot.keyRelease(KeyEvent.VK_CONTROL);
//		robot.keyPress(KeyEvent.VK_ENTER);
//		robot.keyRelease(KeyEvent.VK_ENTER);


    }

    public void DoubleDatafileUpload() throws IOException {

        driver.manage ().timeouts ().implicitlyWait (6, SECONDS);

        Runtime.getRuntime ().exec ("C:\\Users\\rafaelnicola\\ceac-control-workspace\\ceacControl\\support\\DoubleDataFileUpload.exe");
    }

    public void ClicarErrosEncontradosPlanilha() {
        this.btnErrosEncontradosPlanilha.click ();
    }

    public void ValidarMsgErroPlanilha() {
        driver.manage ().timeouts ().implicitlyWait (4, SECONDS);
        //CEAC ID: 1000020 j� cadastrado
        String expectedResult = "CEAC ID: " + Pattern.matches ("[a-zA-Z0-9]{7})", "") + " j� cadastrado";
        String result = this.msgErroPlanilha.getText ();

        assertEquals (expectedResult, result);
    }

    public void ClicarOkMsgErroPlanilha() {
        driver.manage ().timeouts ().implicitlyWait (4, SECONDS);
        this.btnErrosPlanilhaOK.click ();
    }

    public void ClicarFecharImportacaoPlanilha() {
        driver.manage ().timeouts ().implicitlyWait (4, SECONDS);
        this.btnFecharImportacaoPlanilha.click ();
    }

    public void FullFileUpload() throws IOException {
        driver.manage ().timeouts ().implicitlyWait (6, SECONDS);

        Runtime.getRuntime ().exec ("C:\\Users\\rafaelnicola\\ceac-control-workspace\\ceacControl\\support\\FileUpload.exe");

    }

    public void SelecionarTodosCEACs() {
        driver.manage ().timeouts ().implicitlyWait (6, SECONDS);
        this.btnSelecionarTodos.click ();
    }

    public void ClicarIncluirCEACs() {
        driver.manage ().timeouts ().implicitlyWait (6, SECONDS);
        this.btnIncluirCEACsSelecionados.click ();
    }

    public void ValidarMensagemUploadSucesso() {
        driver.manage ().timeouts ().implicitlyWait (6, SECONDS);

        String result = this.msgUploadSucesso.getText ();
        String expectedResult = "CEACs salvos com sucesso";

        assertEquals (result, expectedResult);
    }

    public void ClicarMsgSucessoOK() {


        WebDriverWait wait = new WebDriverWait (driver, 20);
        wait.until (ExpectedConditions.invisibilityOfElementLocated (By.xpath ("//*[@class='btn btn-primary btn-sm']")));
        this.btnSucessoOk.click ();
    }

    public void PreencherFiltroCEAC() {
        driver.manage ().timeouts ().implicitlyWait (4, SECONDS);

        String ceacID = "9089132";
        this.filterCEACId.clear ();
        this.filterCEACId.sendKeys (ceacID);
    }

    public void PreencherFiltroClientName() {
        driver.manage ().timeouts ().implicitlyWait (4, SECONDS);
        String clientName = "MINAS TENIS CLUBE";
        this.filterClientName.clear ();
        this.filterClientName.sendKeys (clientName);
    }

    public void PreencherFiltroOffice() {
        driver.manage ().timeouts ().implicitlyWait (4, SECONDS);
        String office = "São Paulo";

        this.filterOffice.clear ();
        this.filterOffice.sendKeys (office);
    }

    public void PreencherFiltroPartnerNGGC() {
        driver.manage ().timeouts ().implicitlyWait (4, SECONDS);
        String partnerNGGC = "Spilborghs Neto, Alberto";

        this.filterPartnerNGGC.clear ();
        this.filterPartnerNGGC.sendKeys (partnerNGGC);
    }

    public void PreencherFiltroManagerNGGC() {
        driver.manage ().timeouts ().implicitlyWait (4, SECONDS);
        String managerNGGC = "Alves Ferreira, Caroline";

        this.filterManagerNGGC.clear ();
        this.filterManagerNGGC.sendKeys (managerNGGC);
    }

    public void PreencherFiltroDiasProcesso() {
        driver.manage ().timeouts ().implicitlyWait (4, SECONDS);
        String diasProcessoDe = "02";
        String diasProcessoAte = "10";

        this.filterDiasProcessoAte.clear ();
        this.filterDiasProcessoDe.clear ();

        this.filterDiasProcessoDe.sendKeys (diasProcessoDe);
        this.filterDiasProcessoAte.sendKeys (diasProcessoAte);
    }

    public void ClicarAplicarFiltros() {
        driver.manage ().timeouts ().implicitlyWait (4, SECONDS);
        this.btnAplicarFiltros.click ();
    }

    public void ClicarLimparFiltros() {
        driver.manage ().timeouts ().implicitlyWait (4, SECONDS);
        this.btnLimparFiltros.click ();
    }

    public void ValidarPesquisaPorID() {

        String result = this.driver.findElement (By.xpath ("/html/body/div[1]/div/div/div[6]/div/div[4]/div/table/tbody/tr/td[6]")).getText ();
        String expectedResult = "9089132";

        assertEquals (result, expectedResult);

    }

    public void ValidarPesquisaClientName() {
        String result = driver.findElement (By.xpath ("//*[@id=\"80\"]/td[9]")).getText ();
        String expectedResult = "MINAS TENIS CLUBE";

        assertEquals (expectedResult, result);

    }

    public void ValidarPesquisaOffice() {
        String result = this.driver.findElement (By.xpath ("//*[@id='1']/td[9]")).getText ();
        String expectedResult = "S�o Paulo";

        assertEquals (result, expectedResult);

    }

    public void ValidarResultadoCeac() {

        String result = this.ceacIDRow.getText ();
        String expectedResult = "9086146";

        assertEquals (result, expectedResult);
    }

    public void SelecionarRegistroCEAC() {
        this.driver.manage ().timeouts ().implicitlyWait (6, SECONDS);
        this.ceacIDRow.click ();

    }

    public void ClicarDetalhes() {
        this.btnVisualizar.click ();
    }

    public void ValidarDetalhesCEAC() {

        WebDriverWait wait = new WebDriverWait (this.driver, 10);
        wait.until (ExpectedConditions.visibilityOfElementLocated (By.xpath ("//*[@class='bootstrap-dialog-header']//h4")));

        String resultScreen = this.driver.findElement (By.xpath ("//*[@class='bootstrap-dialog-header']//h4")).getText ();
        String expectedResultScreen = "Detalhes do CEAC";
        assertEquals (expectedResultScreen, resultScreen);

        String expectedResultCEAC = "CEAC ID: 1000001";
        String resultCEACID = driver.findElement (By.xpath ("//*[@class='form-title']")).getText ();

    }

    public void ClicarEditar() {
        this.btnEditar.click ();
    }

    public void EditarCeac() {

        Select ceacType = new Select (fieldCeacType);
        Select evaluationTypeSelect = new Select (fieldEvaluationType);
        Select riskGrade = new Select (fieldRiskGrade);
        Select projeto = new Select (fieldProjectID);

        ceacType.selectByVisibleText ("Engagement");
        evaluationTypeSelect.deselectByVisibleText ("Continuance");
        riskGrade.selectByVisibleText ("High");
        projeto.selectByVisibleText ("Rio");

        this.fieldClientName.clear ();
        this.fieldClientName.sendKeys (Keys.chord ("Cliente 0001 - Teste Edi��o CEAC Control"));
        this.fieldOffice.clear ();
        this.fieldOffice.sendKeys (Keys.chord ("Rio de Janeiro"));
        this.fieldDateInitiallySubmittedforApproval.clear ();
        this.fieldDateInitiallySubmittedforApproval.sendKeys (Keys.chord ("05/12/2019"));
        this.fieldRegulada.clear ();
        this.fieldRegulada.sendKeys (Keys.chord ("Sim"));
        this.fieldAprovadorCEAC.clear ();
        this.fieldAprovadorCEAC.sendKeys (Keys.chord ("RMP"));
        this.fieldDataInicioTrabalho.sendKeys (Keys.chord ("01/01/2019"));
        this.fieldSubmissaoSan.sendKeys (Keys.chord ("01/01/2019"));
        this.btnSalvar.click ();

    }

    public void ValidarAtualizacao() {

        String vResult = this.msgAtualizadoSucesso.getText ();
        String vExpectedResult = "CEAC atualizado com sucesso!";

        assertEquals (vResult, vExpectedResult);
    }

    public void PreencherFiltroCeacType() {

        this.filterCEACTypeClick.click ();
        driver.manage ().timeouts ().implicitlyWait (4, SECONDS);
        this.filterCeacTypeOptionsClient.click ();
    }

    public void ValidarClearCampos(){
    this.ClicarLimparFiltros ();
    driver.manage ().timeouts ().implicitlyWait (4, SECONDS);

    String FiltroCeac = this.filterCEACId.getText ();
    String TypeCeac = this.filterCEACTypeClick.getText ();
    String clientName = this.filterClientName.getText ();
    String resultadoCampoZerado = "";
    String resultadoNadaSelecionado = "Nada selecionado";
    assertEquals (FiltroCeac, resultadoCampoZerado);
    assertEquals (TypeCeac, resultadoNadaSelecionado);
    assertEquals (clientName, resultadoCampoZerado);

    }

    public void adicionarDependente (){
        driver.manage ().timeouts ().implicitlyWait (5, SECONDS);
        driver.findElement (By.cssSelector ("#\\38 0 > td:nth-child(20) > a > span")).click ();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace ();
        }
        driver.findElement (By.xpath ("/html/body/div[4]/div/div/div[2]/div/div/div/nav/div/div/ul/li[1]/a")).click ();
        driver.findElement (By.cssSelector (".col-md-2 .form-group #CEAC_ID_DEPENDENCY_FILTER")).sendKeys ("9087080");
        driver.findElement (By.cssSelector (".actionBarEditLine #btnSaveDependency")).click ();
        driver.findElement (By.cssSelector (".bootstrap-dialog-footer-buttons #54b92c3e-7867-497c-90c0-e66d20d097b1")).click ();

    }

    public void removerDependente (){
        driver.manage ().timeouts ().implicitlyWait (5, SECONDS);
        driver.findElement (By.cssSelector ("#\\38 0 > td:nth-child(20) > a > span")).click ();
        WebDriverWait wait2 = new WebDriverWait (driver, 5);
        WebDriverWait wait3 = new WebDriverWait (driver, 5);
        wait2.until (ExpectedConditions.elementToBeClickable (By.cssSelector (".text-center .btn-ceac-remove i")));
        wait3.until (ExpectedConditions.elementToBeClickable (By.cssSelector (".bootstrap-dialog-footer .bootstrap-dialog-footer-buttons #c29a5366-ab0d-47da-a7a4-36fc8841c042")));
        //driver.findElement (By.cssSelector ("#\\31 b87d148-c799-4970-a081-6668cdf6be01")).click ();
        //driver.findElement (By.cssSelector (".actionBarEditLine #btnSaveDependency")).click ();
        //driver.findElement (By.cssSelector (".bootstrap-dialog-footer-buttons #54b92c3e-7867-497c-90c0-e66d20d097b1")).click ();

    }


    public void clickCheckBox() {
        driver.findElement (By.xpath ("/html/body/div[1]/div/div/div[6]/div/div[4]/div/table/tbody/tr/td[1]/input")).click ();
    }

    public void clicaAlteraGrupoRevisor() {
        driver.findElement (By.xpath ("/html/body/div[4]/div/div/div[2]/div/div/div/form/div[5]/div[1]/div/div/button/span[1]")).click ();
        driver.findElement (By.xpath ("/html/body/div[1]/div/div/nav/div/div/ul/li[8]/a")).click ();

    }

    public void AlteraGrupoRevisor() {
        driver.findElement (By.xpath ("/html/body/div[4]/div/div/div[2]/div/div/div/form/div[5]/div[1]/div/div/div/ul/li[2]/a")).click ();

    }

    public void enviaGrupoRevisor() {
        driver.findElement (By.xpath ("/html/body/div[4]/div/div/div[2]/div/div/div/form/div[5]/div[1]/div/div/div/ul/li[2]/a")).click ();

    }

    public void existeDependencia() {

        driver.findElement (By.xpath ("/html/body/div[1]/div/div/div[6]/div/div[4]/div/table/tbody/tr[2]/td[20]/a/span")).click ();
    }

    public void selecionaCeac() {
        driver.findElement (By.xpath ("/html/body/div[1]/div/div/div[6]/div/table/tbody/tr[1]/td[19]")).click ();

    }

    public void clicaView() {
        driver.findElement (By.cssSelector (".actionBarEditLine a")).click ();

    }

    public void clicaEdit() {
        driver.findElement (By.xpath ("/html/body/div[1]/div/div/nav/div/div/ul/li[4]/a")).click ();

    }

    public void clicaData() {

        driver.findElement (By.xpath ("/html/body/div[4]/div/div/div[2]/div/div/div/form/div[4]/div[3]/div[3]/div/div/input")).click ();

}

    public void selecionaData() {
        driver.findElement (By.xpath ("/html/body/div[5]/div[1]/table/tbody/tr[3]/td[5]")).click ();

    }
    public void clicaForaDaTela() {
        driver.findElement (By.xpath ("/html/body/div[4]/div/div/div[2]/div/div/div/form/div[5]/div[3]/div[2]/div/input")).click ();

    }

    public void salvarData() {
        driver.findElement (By.xpath ("/html/body/div[4]/div/div/div[3]/div/div/button[1]")).click ();

    }
    public void preencheName() {
        driver.findElement (By.id ("CLIENT_NAME_FILTER")).sendKeys ("minas");

    }

    public void aplicaFiltro() {
        driver.findElement (By.id ("btnSearch")).click ();

    }

    public void pesquisaCeac() {
        driver.findElement (By.xpath ("/html/body/div[4]/div/div/div[2]/div/div/div/nav/div/div/ul/li[1]/a")).click ();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace ();
        }

    }

    public void preencheCeacID() {
        driver.findElement (By.xpath ("/html/body/div[1]/div/div/div[6]/div/div[6]/div[1]/div[1]/div/input")).sendKeys ("8924234");

    }

    public void preencheCeacID2() {
        driver.findElement (By.id ("CEAC_ID_DEPENDENCY_FILTER")).sendKeys ("9016434");

    }

    public void confirmaCeacAtualizadoComSucesso() {
        driver.findElement (By.xpath ("/html/body/div[4]/div/div/div[3]/div/div/button")).click ();

    }


    public void addCeacCompleto() {

        this.preencheName ();
        this.aplicaFiltro ();
        this.existeDependencia ();
        this.pesquisaCeac ();
        this.preencheCeacID ();
        this.aplicaFiltroCeac ();
        this.addCeac ();
        this.closePageCeac ();
        this.salveCeac ();
        this.validaCeac ();
        this.confirmaCeacAtualizadoComSucesso ();

    }

    public void add2CeacCompleto() {

        this.preencheName ();
        this.aplicaFiltro ();
        this.existeDependencia ();
        this.pesquisaCeac ();
        this.preencheCeacID ();
        this.aplicaFiltroCeac ();
        this.addCeac ();
        this.preencheCeacID2 ();
        this.aplicaFiltroCeac ();
        this.addCeac ();
        this.closePageCeac ();
        this.salveCeac ();
        this.confirmaCeacAtualizadoComSucesso ();
        this.preencheName ();
        this.aplicaFiltro ();
        this.validaCeacSimAdd ();

    }

    public void aplicaFiltroCeac() {
        driver.findElement (By.id ("btnSearchDependency")).click ();

    }

    public void addCeac() {
        driver.findElement (By.xpath ("/html/body/div[6]/div/div/div[2]/div/div/div/div[5]/div/table/tbody/tr/td[5]/a/i")).click ();

    }

    public void removeCeac() {
        driver.findElement (By.xpath ("/html/body/div[4]/div/div/div[2]/div/div/div/div[3]/div[2]/table/tbody/tr/td[5]/a/i")).click ();

    }

    public void confirmaRemocaoCeac() {
        driver.findElement (By.xpath ("/html/body/div[6]/div/div/div[3]/div/div/button[1]")).click ();

    }

    public void closePageCeac() {
        driver.findElement (By.xpath ("/html/body/div[6]/div/div/div[2]/div/div/div/nav/div/div/ul/li/a")).click ();
        ;
    }

    public void closePage() {
        driver.findElement (By.xpath ("/html/body/div[4]/div/div/div[2]/div/div/div/nav/div/div/ul/li[3]/a")).click ();

    }

    public void salveCeac() {
        driver.findElement (By.id ("btnSaveDependency")).click ();

    }

    public void validaCeac() {
        String validaMsg = driver.findElement (By.xpath ("/html/body/div[4]/div/div/div[2]/div/div/div/div/strong")).getText ();
        String Msgesperada = "CEAC atualizado com sucesso!";
        assertEquals (validaMsg, Msgesperada);
    }


    public void validaCeacJaCadastrado() {
        String validaMsg = driver.findElement (By.cssSelector ("#WarningMessage strong")).getText ();
        String Msgesperada = "Não foram encontrados os CEACs com os filtros informados:";
        assertEquals (validaMsg, Msgesperada);
    }

    public void validaCeacNaoAdd() {
        String validaMsg = driver.findElement (By.xpath ("/html/body/div[1]/div/div/div[6]/div/div[4]/div/table/tbody/tr[1]/td[20]/a")).getText ();
        String MsgApresentada = "Não";
        assertEquals (validaMsg, MsgApresentada);
    }

    public void validaCeacSimAdd() {
        String validaMsg = driver.findElement (By.xpath ("//*[@id=\"81\"]/td[20]/a/span")).getText ();
        String MsgEsperada = "Sim";
        assertEquals (MsgEsperada, validaMsg);

    }

    public void validaView (){
        String validaViewMsg = driver.findElement (By.xpath ("/html/body/div[4]/div/div/div[2]/div/div/div/form/div[4]/h4")).getText ();
        String MsgEsperadaView = "Informações";
        assertEquals (MsgEsperadaView, validaViewMsg);
    }
    
}
