package hw08_LoanIssuanceProject;

public class Applicationimpl implements  Application {
    private String lastName;
    private String firstName;
    private String patronymic = "";
    private float incomeLevel;
    private String citizenship;
    private boolean snils;
    private boolean inn;
    private float desiredAmount;
    private boolean decision;
    private int age;


    private Applicationimpl() {
    }

    ;

    public Applicationimpl(String lastName, String firstName, String patronymic,
                           float incomeLevel, String citizenship, boolean snils,
                           boolean inn, float desiredAmount, int age) {

        this.lastName = lastName;
        this.firstName = firstName;
        this.patronymic = patronymic;
        this.incomeLevel = incomeLevel;
        this.citizenship = citizenship;
        this.snils = snils;
        this.inn = inn;
        this.desiredAmount = desiredAmount;
        this.age = age;

    }

    @Override
    public void setLastName(String value) {
        this.lastName = value;
    }

    @Override
    public void setFirstName(String value) {
        this.firstName = value;
    }

    @Override
    public void setPatronymic(String value) {
        this.patronymic = value;
    }

    @Override
    public void setIncomeLevel(float value) {
        this.incomeLevel = value;
    }

    @Override
    public void setCitizenship(String value) {
        this.citizenship = value;
    }

    @Override
    public void setSnils(boolean value) {
        this.snils = value;
    }

    @Override
    public void setInn(boolean value) {
        this.inn = value;
    }

    @Override
    public void setDesiredAmount(float value) {
        this.desiredAmount = value;

    }

    @Override
    public String getLastName() {
        return this.lastName;
    }

    @Override
    public String getFirstName() {
        return this.firstName;
    }

    @Override
    public String getPatronymic() {
        return this.patronymic;
    }

    @Override
    public float getIncomeLevel() {
        return this.incomeLevel;
    }

    @Override
    public String getCitizenship() {
        return this.citizenship;
    }

    @Override
    public boolean getSnils() {
        return this.snils;
    }

    @Override
    public boolean getInn() {
        return this.inn;
    }

    @Override
    public float getDesiredAmount() {
        return this.desiredAmount;

    }

    @Override
    public boolean getDecision() {
        return this.decision;

    }

    @Override
    public void setDecision(boolean value) {
        this.decision = value;

    }

    @Override
    public void setAge(int value) {

        this.age = value;
    }

    @Override
    public int getAge() {

        return this.age;
    }
}

