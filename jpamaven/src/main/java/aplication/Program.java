package aplication;

import dominio.People;

public class Program {

    public static void main(String [] args){

        People p1 = new People(1, "Carlos da Silva", "carlos@gmail.com");
        People p2 = new People(2, "Maria Benedita", "maria@gamil.com");
        People p3 = new People(3, "Roger Pimpao", "roger@gmail.com");

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

    }

}
