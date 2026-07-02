package model.services;

import application.Predicate;
import entities.Product;

import java.util.List;

public class ProductService {

    public double filteredSum(List<Product> list, Predicate criteria){
        double sum = 0.0;
        for (Product p : list){
            if (criteria.test(p)) {
                sum += p.getPrice();
            }
        }
        return sum;
    }
}
