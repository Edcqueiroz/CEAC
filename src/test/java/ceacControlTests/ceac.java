package ceacControlTests;

public class ceac {

        private int ceacId;
        private String ceacType;
        private String evaluationType;
        private String clientName;
        private String riskGrade;
        private String office;
        private String partner;
        private String manager;
        private String dateInitiallySubmittedForApproval;
        private String evaluationTypeLastYear;
        private String riskGradeLastYear;
        private String projeto;
        private String regulada;
        private String aprovadorNoCeac;

        public ceac() { }

        public ceac (int ceacId, String ceacType, String evaluationType, String clientName, String riskGrade, String office, String partner, String manager, String dateInitiallySubmittedForApproval, String evaluationTypeLastYear,
                String riskGradeLastYear, String projeto, String regulada, String aprovadorNoCeac) {
            super();
            this.ceacId = ceacId;
            this.ceacType = ceacType;
            this.evaluationType = evaluationType;
            this.clientName = clientName;
            this.riskGrade = riskGrade;
            this.office = office;
            this.partner = partner;
            this.manager = manager;
            this.dateInitiallySubmittedForApproval = dateInitiallySubmittedForApproval;
            this.evaluationTypeLastYear = evaluationTypeLastYear;
            this.riskGradeLastYear = riskGradeLastYear;
            this.projeto = projeto;
            this.regulada = regulada;
            this.aprovadorNoCeac = aprovadorNoCeac;
        }

        public int getCeacId() {
            return ceacId ;
        }
        public void setCeacId(int ceacId) {
            this.ceacId = ceacId;
        }
        public String getCeacType() {
            return ceacType;
        }
        public void setCeacType(String ceacType) {
            this.ceacType = ceacType;
        }
        public String getEvaluationType() {
            return evaluationType;
        }
        public void setEvaluationType(String evaluationType) {
            this.evaluationType = evaluationType;
        }
        public String getClientName(){
            return getClientName ();
        }
        public void setGetClientName(String clientName){
            this.clientName = clientName;
        }
        public String getRiskGrade(){
            return getRiskGrade ();
        }

        public void setRiskGrade(String riskGrade){
            this.riskGrade = riskGrade;
        }
        public String getOffice(){
            return getOffice ();
        }

        public void setOffice(String office){
            this.office = office;
        }
         public String getPartner(){
            return getPartner ();
        }

        public void setPartner(String partner){
            this.partner = partner;
        }
        public String getPManager(){
            return getPManager ();
        }

        public void setManager(String manager){
            this.manager = manager;
        }

        public String getDateInitiallySubmittedForApproval(){
            return getDateInitiallySubmittedForApproval ();
        }
        public void setDateInitiallySubmittedForApproval(String dateInitiallySubmittedForApproval){
            this.dateInitiallySubmittedForApproval = dateInitiallySubmittedForApproval;
        }

        public String getEvaluationTypeLastYear(){
            return getEvaluationTypeLastYear ();
        }
        public void setEvaluationTypeLastYear(String evaluationTypeLastYear){
            this.evaluationTypeLastYear = evaluationTypeLastYear;
        }

        public String getRiskGradeLastYear (){
            return getRiskGradeLastYear ();
        }

        public void setRiskGradeLastYear(String riskGradeLastYear){
            this.riskGradeLastYear = riskGradeLastYear;
        }

        public String getProjeto(){
            return getProjeto ();
        }
        public void setProjeto(){
            this.projeto = projeto;
        }

        public String getRegulada(){
            return getRegulada ();
        }
        public void setRegulada(String regulada){
            this.regulada = regulada;
        }

        public String getAprovadorNoCeac (){
            return getAprovadorNoCeac ();
        }
        public void setAprovadorNoCeac(String aprovadorNoCeac){
            this.aprovadorNoCeac = aprovadorNoCeac;
        }

}