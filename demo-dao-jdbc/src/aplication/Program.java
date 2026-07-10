package aplication;

import model.entities.Department;
import model.entities.Seller;

import java.util.Date;

public class Program {

    public static void main(String [] args){

        Department obj = new Department(1, "Books");

        Seller seller = new Seller(3000.0,
                obj,
                new Date(),
                21,
                "bob@gmail.com",
                "Bob");

        System.out.println(seller);
    }
}
