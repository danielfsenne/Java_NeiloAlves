package entities;

import entities.enums.Enumeracao;

import java.util.Date;

public class Pedidos {
    private Integer id;
    private Date moment;
    private Enumeracao status;

    public Pedidos(){

    }
    public Pedidos(Integer id, Date moment, Enumeracao status){
        this.id = id;
        this.moment = moment;
        this.status = status;
    }
    public Integer getId(){
        return id;
    }
    public void setId(Integer id){
        this.id = id;
    }
    public Date getMoment(){
        return moment;
    }
    public void setMoment(Date moment){
        this.moment = moment;
    }
    public Enumeracao getStatus(){
        return status;
    }
    public void setStatus(Enumeracao status){
        this.status = status;
    }

    public String toString(){
        return "Order [id=" + id + ", moment = " +  moment + ", status =" + status + "]";
    }
}
