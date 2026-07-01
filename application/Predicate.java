package application;

import entities.Product;
import util.PriceUpdate;
import util.ProductPredicate;
import util.UpperCaseName;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Predicate {

    public static void main(String [] args){
        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.00));
        list.add(new Product("HD Case", 80.00));


        List<String> names = list.stream().map(new UpperCaseName()).collect(Collectors.toList());

        names.forEach(System.out::println);

        /*
        list.forEach(new PriceUpdate());

        list.forEach(System.out::println);

        /*
        list.removeIf(new ProductPredicate());

        for (Product p : list){
            System.out.println(p);
        }

         */
    }
}
