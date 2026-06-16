package entities;

public class SavesAccount extends  Acount {
    private Double interestRate;

    public SavesAccount(){
        super();
    }

    public SavesAccount(Integer number, String holder, Double balance, Double interestRate){
        super(number, holder, balance);
        this.interestRate = interestRate;
    }

    public Double getInterestRate(){
        return interestRate;
    }
    public void setInterestRate(){
        this.interestRate = interestRate;
    }
    public void updateBalance(){
        balance += balance * interestRate;
    }

}
