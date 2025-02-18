package hw08_LoanIssuanceProject;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Application  application = new Applicationimpl("Deryakin",
                "Sergey","Romanovich",90000,"Rus",
                true,true,60000,20);

        Application  application2 = new Applicationimpl("Konstantinov",
                "Petr","Leonidovich",0,"Rus",
                true,true,60000,17);
        LoanApplicationProcessor loanApplicationProcessor = new LoanApplicationProcessor(application);
        System.out.println(application.getDecision());
        loanApplicationProcessor.setApplication(application2);
        loanApplicationProcessor.run();
        System.out.println(application2.getDecision());
    }

}