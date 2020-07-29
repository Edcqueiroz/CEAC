package PageObjects;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;
import static org.junit.Assert.assertEquals;

public class PageSpAudit {

    //Objetos - Gerenciamento SP Audit RM//

    public PageSpAudit confirmaCeacAtualizadoComSucesso() {
        $ (By.xpath ("/html/body/div[4]/div/div/div[3]/div/div/button")).click ();
        return this;
    }

    public PageSpAudit selecionaCeac() {
        sleep (2000);
        $ (By.xpath ("/html/body/div[1]/div/div/div[6]/div/table/tbody/tr[1]/td[19]")).click ();
        return this;
    }

    public PageSpAudit aplicaFiltroCeac() {
        $ ("#btnSearchDependency").click ();
        sleep (1500);
        return this;
    }

    public PageSpAudit addCeac() {
        $ (By.xpath ("/html/body/div[6]/div/div/div[2]/div/div/div/div[5]/div/table/tbody/tr/td[5]/a/i")).click ();
        return this;
    }

    public PageSpAudit removeCeac() {
        $ (By.xpath ("/html/body/div[4]/div/div/div[2]/div/div/div/div[3]/div[2]/table/tbody/tr/td[5]/a/i")).click ();
        return this;
    }

    public PageSpAudit confirmaRemocaoCeac() {
        sleep(1000);
        $ (By.xpath ("/html/body/div[6]/div/div/div[3]/div/div/button[1]")).click ();
        return this;
    }

    public PageSpAudit TypeEngagement () {
        sleep(1000);
        $(By.xpath ("//*[@id=\"tableAllFieldsCeacs_wrapper\"]/div[6]/div[1]/div[2]/div/div/button/span[1]")).click ();
        sleep (1000);
        $ (By.xpath ("//*[@id=\"tableAllFieldsCeacs_wrapper\"]/div[6]/div[1]/div[2]/div/div/div/ul/li[3]/a/span[1]")).click ();
        return this;
    }

    public PageSpAudit TypeClient () {
        sleep(1000);
        $(By.xpath ("//*[@id=\"tableAllFieldsCeacs_wrapper\"]/div[6]/div[1]/div[2]/div/div/button/span[1]")).click ();
        sleep (1000);
        $ (By.xpath ("//*[@id=\"tableAllFieldsCeacs_wrapper\"]/div[6]/div[1]/div[2]/div/div/div/ul/li[2]/a/span[1]")).click ();
        return this;
    }

    public PageSpAudit EvaluationTypeAcceptance () {
        sleep(1000);
        $(By.xpath ("//*[@id=\"tableAllFieldsCeacs_wrapper\"]/div[6]/div[1]/div[3]/div/div/button")).click ();
        $ (By.xpath ("//*[@id=\"tableAllFieldsCeacs_wrapper\"]/div[6]/div[1]/div[3]/div/div/div/ul/li[2]/a/span[1]")).click ();
        return this;
    }

    public PageSpAudit cliqueRiskGrade () {
        sleep(2000);
        $(By.xpath ("//*[@id=\"tableAllFieldsCeacs_wrapper\"]/div[6]/div[1]/div[4]/div/div/button/span[1]")).click ();
        return this;
    }

    public PageSpAudit cliqueProjeto () {
        sleep(1000);
        $(By.xpath ("//*[@id=\"tableAllFieldsCeacs_wrapper\"]/div[6]/div[2]/div[4]/div/div/button/span[1]")).click ();
        return this;
    }

    public PageSpAudit cliqueGrupoRevisor () {
        sleep(1000);
        $(By.xpath ("//*[@id=\"tableAllFieldsCeacs_wrapper\"]/div[6]/div[3]/div[5]/div/div/button/span[1]")).click ();
        return this;
    }

    public PageSpAudit cliqueProfissionalRevisor () {
        sleep(1000);
        $(By.xpath ("//*[@id=\"tableAllFieldsCeacs_wrapper\"]/div[6]/div[4]/div[1]/div/div/button/span[1]")).click ();
        $(By.xpath ("//*[@id=\"tableAllFieldsCeacs_wrapper\"]/div[6]/div[4]/div[1]/div/div/div/ul/li[8]/a/span[1]")).click ();
        return this;
    }

    public PageSpAudit cliqueStatus () {
        sleep(1000);
        $(By.xpath ("//*[@id=\"tableAllFieldsCeacs_wrapper\"]/div[6]/div[3]/div[1]/div/div/button/span[1]")).click ();
        return this;
    }

    public PageSpAudit cliquePreAprovador () {
        sleep(1000);
        $(By.xpath ("//*[@id=\"tableAllFieldsCeacs_wrapper\"]/div[6]/div[4]/div[3]/div/div/button/span[1]")).click ();
        return this;
    }

    public PageSpAudit cliqueAprovador () {
        sleep(1000);
        $(By.xpath ("//*[@id=\"tableAllFieldsCeacs_wrapper\"]/div[6]/div[4]/div[2]/div/div/button/span[1]")).click ();
        return this;
    }


    public PageSpAudit selecionaPreAprovador () {
        sleep(1000);
        $(By.xpath ("//*[@id=\"tableAllFieldsCeacs_wrapper\"]/div[6]/div[4]/div[3]/div/div/div/ul/li[6]/a/span[1]")).click ();
        return this;
    }

    public PageSpAudit selecionaAprovador () {
        sleep(1000);
        $(By.xpath ("//*[@id=\"tableAllFieldsCeacs_wrapper\"]/div[6]/div[4]/div[2]/div/div/div/ul/li[4]/a/span[1]")).click ();
        return this;
    }

    public PageSpAudit cliqueCancelado () {
        sleep(1000);
        $(By.xpath ("//*[@id=\"tableAllFieldsCeacs_wrapper\"]/div[6]/div[3]/div[1]/div/div/div/ul/li[3]/a/span[1]")).click ();
        return this;
    }

    public PageSpAudit cliqueReprovado () {
        sleep(1000);
        $(By.xpath ("//*[@id=\"tableAllFieldsCeacs_wrapper\"]/div[6]/div[3]/div[1]/div/div/div/ul/li[17]/a/span[1]")).click ();
        return this;
    }

    public PageSpAudit riskGradLow () {
        $(By.xpath ("//*[@id=\"tableAllFieldsCeacs_wrapper\"]/div[6]/div[1]/div[4]/div/div/div/ul/li[2]/a/span[1]")).click ();
        return this;
    }

    public PageSpAudit cliqueOversight () {
        $(By.xpath ("//*[@id=\"tableAllFieldsCeacs_wrapper\"]/div[6]/div[3]/div[4]/div/div/button/span[1]")).click ();
        return this;
    }

    public PageSpAudit cliqueOversightNA () {
        sleep (1500);
        $(By.xpath ("//*[@id=\"tableAllFieldsCeacs_wrapper\"]/div[6]/div[3]/div[4]/div/div/div/ul/li[2]/a")).click ();
        return this;
    }

    public PageSpAudit cliqueOversightNaoIniciado () {
        sleep (1500);
        $(By.xpath ("//*[@id=\"tableAllFieldsCeacs_wrapper\"]/div[6]/div[3]/div[4]/div/div/div/ul/li[3]/a/span[1]")).click ();
        return this;
    }

    public PageSpAudit cliqueOversightEmProcesso () {
        sleep (1500);
        $(By.xpath ("//*[@id=\"tableAllFieldsCeacs_wrapper\"]/div[6]/div[3]/div[4]/div/div/div/ul/li[4]/a/span[1]")).click ();
        return this;
    }

    public PageSpAudit cliqueOversightFinalizado () {
        sleep (1500);
        $(By.xpath ("//*[@id=\"tableAllFieldsCeacs_wrapper\"]/div[6]/div[3]/div[4]/div/div/div/ul/li[5]/a/span[1]")).click ();
        return this;
    }

    public PageSpAudit Gr1 () {
        sleep (1000);
        $(By.xpath ("//*[@id=\"tableAllFieldsCeacs_wrapper\"]/div[6]/div[2]/div[4]/div/div/div/ul/li[2]/a/span[1]")).click ();
        return this;
    }

    public PageSpAudit Gr1GrupoRevisor () {
        sleep (1000);
        $(By.xpath ("//*[@id=\"tableAllFieldsCeacs_wrapper\"]/div[6]/div[3]/div[5]/div/div/div/ul/li[2]/a/span[1]")).click ();
        return this;
    }

    public PageSpAudit Gr2 () {
        sleep (1000);
        $(By.xpath ("//*[@id=\"tableAllFieldsCeacs_wrapper\"]/div[6]/div[2]/div[4]/div/div/div/ul/li[3]/a/span[1]")).click ();
        return this;
    }

    public PageSpAudit Gr2GrupoRevisor () {
        sleep (1000);
        $(By.xpath ("//*[@id=\"tableAllFieldsCeacs_wrapper\"]/div[6]/div[3]/div[5]/div/div/div/ul/li[3]/a/span[1]")).click ();
        return this;
    }

    public PageSpAudit NEE () {
        sleep (1000);
        $(By.xpath ("//*[@id=\"tableAllFieldsCeacs_wrapper\"]/div[6]/div[2]/div[4]/div/div/div/ul/li[5]/a/span[1]")).click ();
        return this;
    }

    public  PageSpAudit NEEGrupoRevisor (){
        sleep (1000);
        $(By.xpath ("//*[@id=\"tableAllFieldsCeacs_wrapper\"]/div[6]/div[3]/div[5]/div/div/div/ul/li[5]/a/span[1]")).click ();
        return this;
    }

    public PageSpAudit RIO () {
        sleep (1000);
        $(By.xpath ("//*[@id=\"tableAllFieldsCeacs_wrapper\"]/div[6]/div[2]/div[4]/div/div/div/ul/li[6]/a/span[1]")).click ();
        return this;
    }

    public PageSpAudit RIOGrupoRevisor (){
        sleep (1000);
        $(By.xpath ("//*[@id=\"tableAllFieldsCeacs_wrapper\"]/div[6]/div[3]/div[5]/div/div/div/ul/li[6]/a/span[1]")).click ();
        return this;
    }

    public PageSpAudit Interior () {
        sleep (1000);
        $(By.xpath ("//*[@id=\"tableAllFieldsCeacs_wrapper\"]/div[6]/div[2]/div[4]/div/div/div/ul/li[4]/a/span[1]")).click ();
        return this;
    }

    public PageSpAudit InteriorGrupoRevisor () {
        sleep (1000);
        $(By.xpath ("//*[@id=\"tableAllFieldsCeacs_wrapper\"]/div[6]/div[3]/div[5]/div/div/div/ul/li[4]/a/span[1]")).click ();
        return this;
    }

    public PageSpAudit SUL () {
        sleep (1000);
        $(By.xpath ("//*[@id=\"tableAllFieldsCeacs_wrapper\"]/div[6]/div[2]/div[4]/div/div/div/ul/li[8]/a/span[1]")).click ();
        return this;
    }

    public PageSpAudit SULGrupoRevisor (){
        sleep (1000);
        $(By.xpath ("//*[@id=\"tableAllFieldsCeacs_wrapper\"]/div[6]/div[3]/div[5]/div/div/div/ul/li[8]/a/span[1]")).click ();
        return this;
    }

    public PageSpAudit SPAuditRMGrupoRevisor () {
        sleep (1000);
        $(By.xpath ("//*[@id=\"tableAllFieldsCeacs_wrapper\"]/div[6]/div[3]/div[5]/div/div/div/ul/li[7]/a/span[1]")).click ();
        return this;
    }

    public PageSpAudit riskGradMedium () {
        sleep (1000);
        $(By.xpath ("//*[@id=\"tableAllFieldsCeacs_wrapper\"]/div[6]/div[1]/div[4]/div/div/div/ul/li[3]/a/span[1]")).click ();
        return this;
    }

    public PageSpAudit riskGradHigh () {
        $(By.xpath ("//*[@id=\"tableAllFieldsCeacs_wrapper\"]/div[6]/div[1]/div[4]/div/div/div/ul/li[4]/a/span[1]")).click ();
        return this;
    }

    public PageSpAudit EvaluationTypeContinuance () {
        sleep(1000);
        $(By.xpath ("//*[@id=\"tableAllFieldsCeacs_wrapper\"]/div[6]/div[1]/div[3]/div/div/button")).click ();
        $ (By.xpath ("//*[@id=\"tableAllFieldsCeacs_wrapper\"]/div[6]/div[1]/div[3]/div/div/div/ul/li[3]/a/span[1]")).click ();
        return this;
    }

    public PageSpAudit EvaluationTypeContinuanceReEvaluation () {
        sleep(1000);
        $(By.xpath ("//*[@id=\"tableAllFieldsCeacs_wrapper\"]/div[6]/div[1]/div[3]/div/div/button")).click ();
        $ (By.xpath ("//*[@id=\"tableAllFieldsCeacs_wrapper\"]/div[6]/div[1]/div[3]/div/div/div/ul/li[4]/a/span[1]")).click ();
        return this;
    }

    public PageSpAudit EvaluationTypeReEvaluationn () {
        sleep(1000);
        $(By.xpath ("//*[@id=\"tableAllFieldsCeacs_wrapper\"]/div[6]/div[1]/div[3]/div/div/button")).click ();
        $ (By.xpath ("//*[@id=\"tableAllFieldsCeacs_wrapper\"]/div[6]/div[1]/div[3]/div/div/div/ul/li[5]/a/span[1]")).click ();
        return this;
    }

    public PageSpAudit closePageCeac1() {

        $ (By.xpath ("/html/body/div[6]/div/div/div[2]/div/div/div/nav/div/div/ul/li/a")).click ();
        return this;
    }

    public PageSpAudit closePageCeac2() {

        $ (By.xpath ("/html/body/div[4]/div/div/div[2]/div/div/div/nav/div/div/ul/li[3]/a")).click ();
        return this;
    }

    public void waiting() {
        sleep (5000);
    }

    public PageSpAudit salveCeac() {
        $ ("#btnSaveDependency").click ();
        return this;
    }

    public PageSpAudit clicaView() {
        $ (By.cssSelector (".actionBarEditLine a")).click ();
        return this;
    }

    public PageSpAudit clicaEdit() {
        $ (By.xpath ("/html/body/div[1]/div/div/nav/div/div/ul/li[4]/a")).click ();
        return this;
    }

    public PageSpAudit clickCheckBox() {
        $ (By.xpath ("/html/body/div[1]/div/div/div[6]/div/div[4]/div/table/tbody/tr/td[1]/input")).click ();
        return this;
    }

    public PageSpAudit clicaData() {
        sleep(1000);
        $ (By.xpath ("/html/body/div[4]/div/div/div[2]/div/div/div/form/div[4]/div[3]/div[3]/div/div/input")).click ();
        return this;
    }

    public PageSpAudit selecionaData() {
        sleep (2000);
        $ (By.xpath ("/html/body/div[5]/div[1]/table/tbody/tr[3]/td[5]")).click ();
        return this;
    }

    public PageSpAudit clicaForaDaTela() {
        $ (By.xpath ("/html/body/div[4]/div/div/div[2]/div/div/div/form/div[5]/div[3]/div[2]/div/input")).click ();
        return this;
    }

    public PageSpAudit salvarData() {
        $ (By.xpath ("/html/body/div[4]/div/div/div[3]/div/div/button[1]")).click ();
        return this;
    }

    public PageSpAudit clicaAlteraGrupoRevisor() {
        $ (By.xpath ("/html/body/div[4]/div/div/div[2]/div/div/div/form/div[5]/div[1]/div/div/button/span[1]")).click ();
        $ (By.xpath ("/html/body/div[1]/div/div/nav/div/div/ul/li[8]/a")).click ();
        return this;
    }

    public PageSpAudit enviaGrupoRevisor() {
        $ (By.xpath ("/html/body/div[4]/div/div/div[2]/div/div/div/form/div[5]/div[1]/div/div/div/ul/li[2]/a")).click ();
        return this;
    }

    public PageSpAudit existeDependenciaSim() {
        sleep (1000);
        $ (By.xpath ("/html/body/div[1]/div/div/div[6]/div/div[4]/div/table/tbody/tr[2]/td[20]/a/span")).click ();
        return this;
    }

    public PageSpAudit existeDependenciaNao() {
        $ (By.xpath ("//*[@id=\"tableAllFieldsCeacs_wrapper\"]/div[6]/div[3]/div[3]/div/div/div/ul/li[3]/a/span[1]")).click ();
        return this;
    }

    public PageSpAudit aplicaFiltro() {
        $ ("#btnSearch").click ();
        sleep (1500);
        return this;
    }

    public PageSpAudit pesquisaCeac() {
        $ (By.xpath ("/html/body/div[4]/div/div/div[2]/div/div/div/nav/div/div/ul/li[1]/a")).click ();
        return this;
    }

    public PageSpAudit cliqueExisteDependencia() {
        $ (By.xpath ("//*[@id=\"tableAllFieldsCeacs_wrapper\"]/div[6]/div[3]/div[3]/div/div/button/span[1]")).click ();
        return this;
    }

    public PageSpAudit DependenciaSim() {
        $ (By.xpath ("//*[@id=\"tableAllFieldsCeacs_wrapper\"]/div[6]/div[3]/div[3]/div/div/div/ul/li[2]/a/span[1]")).click ();
        return this;
    }

    //Preenche Campos//

    public PageSpAudit preencheCeacID() {
        $ (By.xpath ("/html/body/div[6]/div/div/div[2]/div/div/div/div[1]/div[1]/div[1]/div/input")).setValue ("8924234");
        sleep (2000);
        return this;
    }

    public PageSpAudit preencheName() {
        $ ("#CLIENT_NAME_FILTER").setValue ("minas");
        sleep (2000);
        return this;
    }

    public PageSpAudit preencheData () {
        $ ("#AGING_START_FILTER").setValue ("06/12");
        sleep (2000);
        return this;
    }

    public PageSpAudit preencheOffice() {
        $ ("#OFFICE_FILTER").setValue ("Curitiba");
        sleep (2000);
        return this;
    }

    public PageSpAudit preenchePartner() {
        $ ("#PARTNER_FILTER").setValue ("Eduardo Bertoncelo, Almir");
        sleep (2000);
        return this;
    }

    public PageSpAudit preencheManager() {
        $ ("#MANAGER_FILTER").setValue ("Luiz Dourado, Rogerio");
        sleep (2000);
        return this;
    }

    public PageSpAudit preencheNameCompanhia() {
        $ ("#CLIENT_NAME_FILTER").setValue ("companhia");
        return this;
    }

    public PageSpAudit preencheCeacIDHome() {

        $ (By.name ("CEAC_ID_FILTER")).setValue ("8924234");
        sleep (2000);
        return this;
    }

    public PageSpAudit preencheCeacID2() {
        $ ("#CEAC_ID_DEPENDENCY_FILTER").setValue ("9016434");
        return this;
    }

    //Métodos Completos//

    public PageSpAudit addCeacCompleto() {
        this.preencheName ();
        this.aplicaFiltro ();
        this.existeDependenciaSim ();
        sleep (1000);
        this.pesquisaCeac ();
        sleep (2000);
        this.preencheCeacID ();
        sleep (3000);
        this.aplicaFiltroCeac ();
        this.addCeac ();
        this.closePageCeac1 ();
        this.salveCeac ();
        this.validaCeac ();
        return this;
    }

    public PageSpAudit add2CeacCompleto() {
        this.preencheName ();
        this.aplicaFiltro ();
        this.existeDependenciaSim ();
        sleep (1000);
        this.pesquisaCeac ();
        sleep (1000);
        this.preencheCeacID ();
        sleep (1000);
        this.aplicaFiltroCeac ();
        this.addCeac ();
        sleep (1000);
        this.preencheCeacID2 ();
        sleep (1000);
        this.aplicaFiltroCeac ();
        this.addCeac ();
        this.closePageCeac1 ();
        this.salveCeac ();
        this.validaCeac ();
        return this;
    }

    //Validações da página - Gerenciamento SP Audit RM//

    public void validaCeac() {
        sleep (1000);
        $(By.xpath ("/html/body/div[4]/div/div/div[2]/div/div/div/div/strong")).shouldHave (Condition.text ("CEAC atualizado com sucesso!"));
    }

    public void validaCeacJaCadastrado() {
       $ (By.xpath ("/html/body/div[6]/div/div/div[2]/div/div/div/div[3]/p/strong")).shouldHave (Condition.text ("Não foram encontrados os CEACs com os filtros informados:"));
    }

    public void validaCeacNaoAdd() {
        String validaMsg = $ (By.xpath ("/html/body/div[1]/div/div/div[6]/div/div[4]/div/table/tbody/tr[1]/td[20]/a")).getText ();
        String MsgEsperada = "Não";
        assertEquals (validaMsg, MsgEsperada);
    }

    public void validaCeacSimAdd() {
        sleep (1000);
        String validaMsg = $ (By.xpath ("//*[@id=\"81\"]/td[20]/a/span")).getText ();
        String MsgEsperada = "Sim";
        assertEquals (MsgEsperada, validaMsg);
    }

    public void validaPesquisaId() {
        sleep (1000);
        String IdCapturado = $ (By.xpath ("/html/body/div[1]/div/div/div[6]/div/div[4]/div/table/tbody/tr/td[6]")).getText ();
        String IdDigitado = "8924234";
        assertEquals (IdCapturado , IdDigitado );
    }

    public void validaPesquisaTypeEngagement() {
        sleep (4000);
        String TypeCapturado = $ (By.xpath ("//*[@id=\"1\"]/td[7]")).getText ();
        String TypeDigitado = "Engagement";
        assertEquals (TypeCapturado , TypeDigitado );
    }

    public void validaPesquisaTypeClient() {
        sleep (4000);
        String TypeCapturado = $ (By.xpath ("//*[@id=\"2\"]/td[7]")).getText ();
        String TypeDigitado = "Client";
        assertEquals (TypeCapturado , TypeDigitado );
    }

    public void validaPesquisaEvaluationAcceptance() {
        sleep (2000);
        String EvaluationCapturado = $ (By.xpath ("//*[@id=\"2\"]/td[8]")).getText ();
        String EvaluationDigitado = "Acceptance";
        assertEquals (EvaluationCapturado , EvaluationDigitado );
    }

    public void validaPesquisaEvaluationContinuance() {
        sleep (2000);
        String EvaluationCapturado = $ (By.xpath ("//*[@id=\"1\"]/td[8]")).getText ();
        String EvaluationDigitado = "Continuance";
        assertEquals (EvaluationCapturado , EvaluationDigitado );
    }

    public void validaPesquisaEvaluationContinuanceReEvaluation() {
        sleep (2000);
        String EvaluationCapturado = $ (By.xpath ("//*[@id=\"71\"]/td[8]")).getText ();
        String EvaluationDigitado = "Continuance-ReEvaluation";
        assertEquals (EvaluationCapturado , EvaluationDigitado );
    }

    public void validaPesquisaEvaluationReEvaluation() {
        sleep (2000);
        String EvaluationCapturado = $ (By.xpath ("//*[@id=\"8\"]/td[8]")).getText ();
        String EvaluationDigitado = "Re-Evaluation";
        assertEquals (EvaluationCapturado , EvaluationDigitado );
    }

    public void validaRiskGradeLow() {
        sleep (5000);
        String riskLowCapturado = $ (By.xpath ("//*[@id=\"2\"]/td[10]")).getText ();
        String riskLowDigitado = "Low";
        assertEquals (riskLowCapturado , riskLowDigitado );
    }

    public void validaRiskGradeMedium() {
        sleep (4000);
        String riskMediumCapturado = $ (By.xpath ("//*[@id=\"1\"]/td[10]")).getText ();
        String riskMediumDigitado = "Medium";
        assertEquals (riskMediumCapturado , riskMediumDigitado );
    }

    public void validaRiskGradeHigh() {
        sleep (3000);
        String riskHighCapturado = $ (By.xpath ("//*[@id=\"71\"]/td[10]")).getText ();
        String riskHighDigitado = "High";
        assertEquals (riskHighCapturado , riskHighDigitado );
    }

    public void validaName () {
        sleep (2000);
        String capturaName = $ (By.xpath ("//*[@id=\"80\"]/td[9]")).getText ();
        String nameDigitado = "MINAS TENIS CLUBE";
        assertEquals (capturaName , nameDigitado );
    }

    public void validaOffice () {
        sleep (2000);
        String capturaOffice = $ (By.xpath ("//*[@id=\"1\"]/td[11]")).getText ();
        String OfficeDigitado = "Curitiba";
        assertEquals (capturaOffice , OfficeDigitado);
    }

    public void validaPartner () {
        sleep (2000);
        String capturaPartner = $ (By.xpath ("//*[@id=\"115\"]/td[13]")).getText ();
        String PartnerDigitado = "Eduardo Bertoncelo, Almir";
        assertEquals (capturaPartner , PartnerDigitado);
    }

    public void validaManager () {
        sleep (2000);
        String capturaManager = $ (By.xpath ("//*[@id=\"1\"]/td[15]")).getText ();
        String ManagerDigitado = "Luiz Dourado, Rogerio";
        assertEquals (capturaManager , ManagerDigitado);
    }

    public void validaGR1 () {
        sleep (2000);
        String capturaProjeto = $ (By.xpath ("//*[@id=\"2\"]/td[17]")).getText ();
        String ProjetoSelecionado = "GR1";
        assertEquals (capturaProjeto , ProjetoSelecionado);
    }

    public void validaGR1GrupoRevisor () {
        sleep (2000);
        String capturaGrupoRevisor = $ (By.xpath ("//*[@id=\"1\"]/td[23]")).getText ();
        String grupoRevisorSelecionado = "GR1";
        assertEquals (capturaGrupoRevisor , grupoRevisorSelecionado);
    }

    public void validaGR2 () {
        sleep (2000);
        String capturaProjeto = $ (By.xpath ("//*[@id=\"8\"]/td[17]")).getText ();
        String ProjetoSelecionado = "GR2";
        assertEquals (capturaProjeto , ProjetoSelecionado);
    }

    public void validaInteriorGrupoRevisor () {
        sleep (2000);
        String capturaGrupoRevisor = $ (By.xpath ("//*[@id=\"85\"]/td[23]")).getText ();
        String grupoRevisorSelecionado = "Interior SP / MG / GO";
        assertEquals (capturaGrupoRevisor , grupoRevisorSelecionado);
    }

    public void validaSPAuditRm (){
        sleep (1000);
        String capturaGrupoRevisor = $ (By.xpath ("//*[@id=\"4\"]/td[23]")).getText ();
        String grupoRevisorSelecionado = "SP Audit RM";
        assertEquals (capturaGrupoRevisor , grupoRevisorSelecionado);
    }

    public void validaProfissionalRevisor (){
        sleep (1000);
        String capturaGrupoRevisor = $ (By.xpath ("//*[@id=\"8\"]/td[24]")).getText ();
        String grupoRevisorSelecionado = "Debora Alves";
        assertEquals (capturaGrupoRevisor , grupoRevisorSelecionado);
    }

    public void validaInterior () {
        sleep (2000);
        String capturaProjeto = $ (By.xpath ("//*[@id=\"4\"]/td[17]")).getText ();
        String ProjetoSelecionado = "Interior SP / MG / GO";
        assertEquals (capturaProjeto , ProjetoSelecionado);
    }

    public void validaNEE () {
        sleep (2000);
        String capturaProjeto = $ (By.xpath ("//*[@id=\"99\"]/td[17]")).getText ();
        String ProjetoSelecionado = "NNE";
        assertEquals (capturaProjeto , ProjetoSelecionado);
    }

    public void validaRIO () {
        sleep (2000);
        String capturaProjeto = $ (By.xpath ("//*[@id=\"73\"]/td[17]")).getText ();
        String ProjetoSelecionado = "RIO";
        assertEquals (capturaProjeto , ProjetoSelecionado);
    }

    public void validaRIOGrupoRevisor () {
        sleep (2000);
        String capturaGrupoRevisor = $ (By.xpath ("//*[@id=\"73\"]/td[23]")).getText ();
        String grupoRevisorSelecionado = "RIO";
        assertEquals (capturaGrupoRevisor , grupoRevisorSelecionado);
    }

    public void validaSUL () {
        sleep (2000);
        String capturaProjeto = $ (By.xpath ("//*[@id=\"1\"]/td[17]")).getText ();
        String ProjetoSelecionado = "SUL";
        assertEquals (capturaProjeto , ProjetoSelecionado);
    }

    public void validaSULGrupoRevisor () {
        sleep (2000);
        String capturaProjeto = $ (By.xpath ("//*[@id=\"tableAllFieldsCeacs_wrapper\"]/div[6]/div[3]/div[5]/div/div/div/ul/li[8]/a/span[1]")).getText ();
        String ProjetoSelecionado = "SUL";
        assertEquals (capturaProjeto , ProjetoSelecionado);
    }

    public void validaStatusAprovado () {
        sleep (2000);
        String capturaProjeto = $ (By.xpath ("//*[@id=\"4\"]/td[22]")).getText ();
        String ProjetoSelecionado = "Aprovado";
        assertEquals (capturaProjeto , ProjetoSelecionado);
    }

    public void validaStatusCancelado () {
        sleep (2000);
        String capturaProjeto = $ (By.xpath ("//*[@id=\"2\"]/td[22]")).getText ();
        String ProjetoSelecionado = "Cancelado";
        assertEquals (capturaProjeto , ProjetoSelecionado);
    }

    public void validaStatusReprovado () {
        sleep (2000);
        String capturaProjeto = $ (By.xpath ("//*[@id=\"bodyTableAllFieldsCeacs\"]/tr/td")).getText ();
        String ProjetoSelecionado = "Nada encontrado";
        assertEquals (capturaProjeto , ProjetoSelecionado);
    }

    public void validaData () {
        sleep (5000);
        String capturaData = $ (By.xpath ("//*[@id=\"1\"]/td[16]")).getText ();
        String DataSelecionada = "06/12/2019";
        assertEquals (capturaData, DataSelecionada);
    }

    public void validaPreAprovador () {
        sleep (5000);
        String capturaPreAprovador = $ (By.xpath ("//*[@id=\"159\"]/td[28]")).getText ();
        String preAprovadorSelecionado = "Alexandre Toledo";
        assertEquals (capturaPreAprovador, preAprovadorSelecionado);
    }

    public void validaAprovador () {
        sleep (5000);
        String capturaPreAprovador = $ (By.xpath ("//*[@id=\"305\"]/td[28]")).getText ();
        String preAprovadorSelecionado = "Carlos Eduardo Munhoz";
        assertEquals (capturaPreAprovador, preAprovadorSelecionado);
    }

    public PageSpAudit validaView () {
        sleep (1500);
        String validaViewMsg = $ (By.xpath ("/html/body/div[4]/div/div/div[2]/div/div/div/form/div[4]/h4")).getText ();
        String MsgEsperadaView = "Informações";
        assertEquals (MsgEsperadaView, validaViewMsg);
        return this;
    }

    public PageSpAudit validaDependenteSim () {
        sleep (1500);
        String validaViewMsg = $ (By.xpath ("//*[@id=\"83\"]/td[20]/a/span")).getText ();
        String MsgEsperadaView = "Sim";
        assertEquals (MsgEsperadaView, validaViewMsg);
        return this;
    }

    public PageSpAudit validaDependenteNao () {
        sleep (1500);
        String validaViewMsg = $ (By.xpath ("//*[@id=\"1\"]/td[20]/a/span")).getText ();
        String MsgEsperadaView = "Não";
        assertEquals (MsgEsperadaView, validaViewMsg);
        return this;
    }

    public PageSpAudit validaOversightNA () {
        sleep (1500);
        String validaViewMsg = $ (By.xpath ("//*[@id=\"2\"]/td[25]")).getText ();
        String MsgEsperadaView = "N/A";
        assertEquals (MsgEsperadaView, validaViewMsg);
        return this;
    }

    public PageSpAudit validaOversightNaoIniciado () {
        sleep (1500);
        String validaViewMsg = $ (By.xpath ("//*[@id=\"1\"]/td[25]")).getText ();
        String MsgEsperadaView = "Não iniciado";
        assertEquals (MsgEsperadaView, validaViewMsg);
        return this;
    }

    public PageSpAudit validaOversightEmProcesso () {
        sleep (1500);
        String validaViewMsg = $ (By.xpath ("//*[@id=\"bodyTableAllFieldsCeacs\"]/tr/td")).getText ();
        String MsgEsperadaView = "Nada encontrado";
        assertEquals (MsgEsperadaView, validaViewMsg);
        return this;
    }
}