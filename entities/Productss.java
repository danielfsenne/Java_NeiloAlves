package entities;

import java.util.Objects;

public class Productss {

    private String name;
    private Double price;

    public Productss(String name, Double price){
        this.name = name;
        this.price = price;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Productss productss = (Productss) o;
        return Objects.equals(name, productss.name) && Objects.equals(price, productss.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }
}
