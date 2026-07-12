package aplication;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;
import java.util.List;

public class Program {

    public static void main(String [] args){


        SellerDao sellerDao = (SellerDao) DaoFactory.createSellerDao();

        System.out.println("=== TEST 1: seller findById ===");

        Seller seller = sellerDao.findById(3);

        System.out.println("\n=== TEST 2: seller findByDepartment ===");
        Department department = new Department(2, null);
        List<Seller> list = sellerDao.findByDepartment(department);
        for (Seller obj : list){
            System.out.println(obj);
        }

        System.out.println("\n=== TEST 3: seller findAll ===");
        list = sellerDao.findAll();
        for (Seller obj : list){
            System.out.println(obj);
        }

        System.out.println("\n=== TEST 4: seller insert ===");
        Seller newSeller = new Seller(4000.0, department, new Date(), null, "greg@gmail.com", "Greg");
        sellerDao.insert(newSeller);
        System.out.println("Insrerted! New id = " + newSeller.getId());


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
