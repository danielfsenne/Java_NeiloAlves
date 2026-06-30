package application;

import entities.Productss;

import java.util.HashSet;
import java.util.Set;

public class TestDeIgualdadeSet {

    public static void main(String [] args){
        Set<Productss> set = new HashSet<>();

        set.add(new Productss("Tv", 900.0));
        set.add(new Productss("Notebook", 1200.0));
        set.add(new Productss("Tablet", 400.0));

        Productss prod = new Productss("Notebook", 1200.0);

        System.out.println(set.contains(prod));
    }
}
