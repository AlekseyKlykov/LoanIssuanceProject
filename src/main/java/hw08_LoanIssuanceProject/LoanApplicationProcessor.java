package hw08_LoanIssuanceProject;

public class LoanApplicationProcessor {
    private Application application;

    private LoanApplicationProcessor(){};
    public LoanApplicationProcessor(Application application){
        this.application = application;
        run();

    }
    public void run(){

        ageVerification();

    }
    private void ageVerification(){

        if (application.getAge() >=18)
            citizenshipVerification();
        else {application.setDecision(false);
        this.application = null;
        }

    }

    private void citizenshipVerification(){
        if (application.getCitizenship() == "Rus")
        incomeLevelVerification();
        else {application.setDecision(false);
        this.application = null;
    }
    }
    private void incomeLevelVerification(){
        if(application.getIncomeLevel() >= application.getDesiredAmount())
            innVerification();
        else {application.setDecision(false);
        this.application = null;
    }

    }
    private void innVerification(){
        if(application.getInn())
            snilsVerification();
        else {application.setDecision(false);
        this.application = null;
    }

    }
    private void snilsVerification(){
        if(application.getSnils())
            application.setDecision(true);
        else {
            application.setDecision(false);
            this.application = null;
        }

        }
    public void setApplication(Application value){

        this.application = value;

    }


    }


