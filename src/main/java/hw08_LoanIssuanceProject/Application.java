package hw08_LoanIssuanceProject;

public interface Application {

    public void setLastName(String value);
    public void setFirstName(String value);
    public void setPatronymic(String value);
    public void setIncomeLevel(float value);
    public void setCitizenship(String value);
    public void setSnils(boolean value);
    public void setInn(boolean value);
    public void setDesiredAmount(float value);
    public String getLastName();
    public String getFirstName();
    public String getPatronymic();
    public float getIncomeLevel();
    public String getCitizenship();
    public boolean getSnils();
    public boolean getInn();
    public float getDesiredAmount();
    public boolean getDecision();
    public void setDecision(boolean value);
    public void setAge(int value);
    public int getAge();



}
