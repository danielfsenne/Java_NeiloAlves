package entities;

public class Employe {
    private String name;
    private Integer number;
    private Double valuePerHour;

    public Employe() {

    }

    public Employe(String name, Integer number, Double valuePerHour) {
        this.name = name;
        this.number = number;
        this.valuePerHour = valuePerHour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Double getValuePerHour() {
        return valuePerHour;
    }

    public void setValuePerHour(Double valuePerHour) {
        this.valuePerHour = valuePerHour;
    }

    public double payment(){
        return number  * valuePerHour;
    }
}