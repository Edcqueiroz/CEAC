package ceacControlTests;

import PageObjects.PageSpAudit;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.*;


public class GerenciamentoSPAuditRM {

    WebDriver driver;

        protected static PageSpAudit gerenciamentoSp;

    @BeforeMethod
    public void start() {
        System.setProperty ("webdriver.chrome.driver", "C:\\Users\\eduardoqueiroz\\IdeaProjects\\drivers\\chrome\\84\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions ();
        options.setExperimentalOption ("useAutomationExtension", false);
        options.addArguments ("start-maximized");
        WebDriver driver = new ChromeDriver (options);
        WebDriverRunner.setWebDriver (driver);
        Configuration.browser = "chrome";
        baseUrl = "http://ceaccontrol.test.br.kworld.kpmg.com";
        open ("/SPAuditRM");
        gerenciamentoSp = new PageSpAudit ();
    }
    @Test
    public void CT056_addDependente(){

        gerenciamentoSp
                .addCeacCompleto ();

    }

    @Test
    public void CT057_clearDependencia(){
        gerenciamentoSp
                .preencheName ()
                .aplicaFiltro ()
                .existeDependenciaSim ()
                .removeCeac ()
                .confirmaRemocaoCeac ()
                .salveCeac ()
                .validaCeac ();

    }

    @Test
    public void CT058_cancelaDependencia() {
        gerenciamentoSp
                .preencheName ()
                .aplicaFiltro ()
                .existeDependenciaSim ()
                .pesquisaCeac ()
                .preencheCeacID ();
        sleep (2000);
        gerenciamentoSp
                .aplicaFiltroCeac ()
                .closePageCeac1 ()
                .closePageCeac2 ()
                .validaCeacNaoAdd ();
    }

    @Test
    public void CT059_60_61_62_add2Dependencia() {

        gerenciamentoSp
                .add2CeacCompleto ();
    }

    @Test
    public void CT063_pesquisaCeacVinculados() {
        gerenciamentoSp

                .preencheName ()
                .aplicaFiltro ()
                .existeDependenciaSim ()
                .pesquisaCeac ()
                .preencheCeacID ();
        sleep (2000);
        gerenciamentoSp
                .aplicaFiltroCeac ();
        sleep (1000);
        gerenciamentoSp
                .validaCeacJaCadastrado ();
    }

    @Test
    public void CT064_removerDependenciaIncluidasCeacsPrincipais() {
        gerenciamentoSp
                .waiting ();
        gerenciamentoSp
                .preencheName ()
                .aplicaFiltro ()
                .existeDependenciaSim ()
                .removeCeac ()
                .confirmaRemocaoCeac ()
                .removeCeac ()
                .confirmaRemocaoCeac ()
                .salveCeac ()
                .validaCeacNaoAdd ();

    }

    @Test
    public void CT065_visualizarInformacoesCadastroCeac() {
        gerenciamentoSp
                .selecionaCeac ()
                .clicaView ();
        gerenciamentoSp
                .validaView ();
    }

    @Test
    public void CT066_editarCadastroCeac() {
        gerenciamentoSp
                .selecionaCeac ()
                .clicaEdit ()
                .clicaData ()
                .selecionaData ()
                .clicaForaDaTela ()
                .salvarData ()
                .validaCeac ();
     }

    @Test
    public void CT067_enviaSolicitacoesParaGrupoDeRevisao() {
        gerenciamentoSp
                .preencheNameCompanhia ()
                .aplicaFiltro ()
                .clickCheckBox ()
                .clicaAlteraGrupoRevisor ()
                .enviaGrupoRevisor ()
                .validaCeac ();

    }

    @Test
    public void CT070_filtrarCeacsPorId() {
        gerenciamentoSp
                .preencheCeacIDHome ()
                .aplicaFiltro ()
                .validaPesquisaId ();
    }

    @Test
    public void CT071_filtrarCeacsPorType() {
        gerenciamentoSp

                .TypeEngagement ()
                .aplicaFiltro ()
                .validaPesquisaTypeEngagement ();
        gerenciamentoSp
                .TypeClient ()
                .aplicaFiltro ()
                .validaPesquisaTypeClient ();
    }

    @Test
    public void CT072_filtrarCeacsPorEvaluation(){

        gerenciamentoSp
                .EvaluationTypeAcceptance ()
                .aplicaFiltro ()
                .validaPesquisaEvaluationAcceptance ();
        gerenciamentoSp
                .EvaluationTypeContinuance ()
                .aplicaFiltro ()
                .validaPesquisaEvaluationContinuance ();
        gerenciamentoSp
                .EvaluationTypeContinuanceReEvaluation ()
                .aplicaFiltro ()
                .validaPesquisaEvaluationContinuanceReEvaluation ();
        gerenciamentoSp
                .EvaluationTypeReEvaluationn ()
                .aplicaFiltro ()
                .validaPesquisaEvaluationReEvaluation ();
    }

    @Test
    public void CT073_filtrarCeacsPorRiskGrade() {

        gerenciamentoSp
                .cliqueRiskGrade ()
                .riskGradLow ()
                .aplicaFiltro ()
                .validaRiskGradeLow ();

        gerenciamentoSp
                .cliqueRiskGrade ()
                .riskGradMedium ()
                .aplicaFiltro ()
                .validaRiskGradeMedium ();

        gerenciamentoSp
                .cliqueRiskGrade ()
                .riskGradHigh ()
                .aplicaFiltro ()
                .validaRiskGradeHigh ();
    }

    @Test
    public void CT074_filtrarCeacsPorName(){
        gerenciamentoSp

                .preencheName ()
                .aplicaFiltro ()
                .validaName ();
    }

    @Test
    public void CT075_filtrarCeacsPorOffice(){
        gerenciamentoSp
                .preencheOffice ()
                .aplicaFiltro ()
                .validaOffice ();
    }

    @Test
    public void CT076_filtrarCeacsPorPartner() {
        gerenciamentoSp
                .preenchePartner ()
                .aplicaFiltro ()
                .validaPartner ();
    }

    @Test
    public void CT077_filtrarCeacsPorManager() {
        gerenciamentoSp
                .preencheManager ()
                .aplicaFiltro ()
                .validaManager ();
    }

    @Test
    public void CT078_filtrarCeacsPorGrupoRevisor() {
        gerenciamentoSp
                .cliqueGrupoRevisor ()
                .Gr1GrupoRevisor ()
                .aplicaFiltro ()
                .validaGR1GrupoRevisor ();

        gerenciamentoSp
                .cliqueGrupoRevisor ()
                .InteriorGrupoRevisor ()
                .aplicaFiltro ()
                .validaInteriorGrupoRevisor ();

        gerenciamentoSp
                .cliqueGrupoRevisor ()
                .RIOGrupoRevisor ()
                .aplicaFiltro ()
                .validaRIOGrupoRevisor ();

        gerenciamentoSp
                .cliqueGrupoRevisor ()
                .SPAuditRMGrupoRevisor ()
                .aplicaFiltro ()
                .validaSPAuditRm ();
    }

    @Test
    public void CT079_filtrarCeacsPorProfissionalResponsavel () {
        gerenciamentoSp
                .cliqueProfissionalRevisor ()
                .aplicaFiltro ()
                .validaProfissionalRevisor ();

    }

    @Test
    public void CT081_filtrarCeacsPorStatus() {
        gerenciamentoSp
                .cliqueStatus ()
                .cliqueAprovador ()
                .aplicaFiltro ()
                .validaStatusAprovado ();

        gerenciamentoSp
                .cliqueStatus ()
                .cliqueCancelado ()
                .aplicaFiltro ()
                .validaStatusCancelado();

        gerenciamentoSp
                .cliqueStatus ()
                .cliqueReprovado ()
                .aplicaFiltro ()
                .validaStatusReprovado ();

    }

    @Test
    public void CT082_filtrarDiasEmProcesso() {
        gerenciamentoSp
                .preencheData()
                .aplicaFiltro ()
                .validaData();
    }

    @Test
    public void CT083_filtrarCeacsPorProjeto() {
        gerenciamentoSp
                .cliqueProjeto ()
                .Gr1 ()
                .aplicaFiltro ()
                .validaGR1 ();

        gerenciamentoSp
                .cliqueProjeto ()
                .Gr2 ()
                .aplicaFiltro ()
                .validaGR2 ();

        gerenciamentoSp
                .cliqueProjeto ()
                .Interior ()
                .aplicaFiltro ()
                .validaInterior ();

        gerenciamentoSp
                .cliqueProjeto ()
                .NEE ()
                .aplicaFiltro ()
                .validaNEE ();

        gerenciamentoSp
                .cliqueProjeto ()
                .RIO ()
                .aplicaFiltro ()
                .validaRIO ();

        gerenciamentoSp
                .cliqueProjeto ()
                .SUL ()
                .aplicaFiltro ()
                .validaSUL ();
    }

    @Test
    public void CT084_filtrarGrupoPreAprovador() {
        gerenciamentoSp
                .cliquePreAprovador ()
                .selecionaPreAprovador ()
                .aplicaFiltro ()
                .validaPreAprovador ();
    }

    @Test
    public void CT085_filtrarGrupoAprovador() {
        gerenciamentoSp
                .cliqueAprovador ()
                .selecionaAprovador ()
                .aplicaFiltro ()
                .validaAprovador ();
    }

    @Test
    public void CT086_filtrarCeacsPorExisteDependencia (){
        gerenciamentoSp
                .cliqueExisteDependencia()
                .DependenciaSim()
                .aplicaFiltro()
                .validaDependenteSim()
                .cliqueExisteDependencia()
                .existeDependenciaNao()
                .aplicaFiltro()
                .validaDependenteNao();
    }

    @Test
    public void CT087_filtrarCeacsPorOversight() {
        gerenciamentoSp
                .cliqueOversight ()
                .cliqueOversightNA ()
                .aplicaFiltro ()
                .validaOversightNA ();
        gerenciamentoSp
                .cliqueOversight ()
                .cliqueOversightNaoIniciado ()
                .aplicaFiltro ()
                .validaOversightNaoIniciado ();
        gerenciamentoSp
                .cliqueOversight ()
                .cliqueOversightEmProcesso ()
                .aplicaFiltro ()
                .validaOversightEmProcesso ();
        gerenciamentoSp
                .cliqueOversight ()
                .cliqueOversightFinalizado ()
                .aplicaFiltro ()
                .validaOversightEmProcesso ();
    }


    @AfterMethod
    public void End (){

        closeWindow ();

    }
}
