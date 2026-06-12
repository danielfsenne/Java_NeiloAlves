package application;

import entities.Pedidos;
import entities.enums.Enumeracao;

import java.util.Date;

public class Order {
    public static void main(String[]args){
        Pedidos pedidos = new Pedidos(1080, new Date(), Enumeracao.PEDING_PAYMENT);

        System.out.println(pedidos);

        Enumeracao os1 = Enumeracao.DEVILERED;

        Enumeracao os2 = Enumeracao.valueOf("DEVILERED");
    }
}
