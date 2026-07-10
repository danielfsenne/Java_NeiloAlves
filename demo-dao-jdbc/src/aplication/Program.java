package aplication;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;

public class Program {

    public static void main(String [] args){

        Department obj = new Department(1, "Books");

        SellerDao sellerDao = (SellerDao) DaoFactory.createSellerDao();

        Seller seller = sellerDao.findById(3);

        /*
        Seller seller = new Seller(3000.0,
                obj,
                new Date(),
                21,
                "bob@gmail.com",
                "Bob");

        Object sellerDao = DaoFactory.createSellerDao();
       */
        System.out.println(seller);
    }
}
