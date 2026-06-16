package entities;

public class OutsourcedEmploye extends Employe{
    private double additionalCharge;

    public OutsourcedEmploye(){
        super();
    }

    public OutsourcedEmploye(String name, Integer number, Double valuePerHour, Double additionalCharge){
        super(name, number, valuePerHour);
        this.additionalCharge = additionalCharge;
    }
    public Double getAdditionalCharge(){
        return  additionalCharge;
    }
    public void setAdditionalCharge(Double additionalCharge){
        this.additionalCharge = additionalCharge;
    }
    @Override
    public double payment(){
        return  super.payment() + additionalCharge * 1.1;
    }
}
