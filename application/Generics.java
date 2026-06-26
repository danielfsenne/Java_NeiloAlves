package application;

import model.services.PrintService;

import java.util.Scanner;

public class Generics {

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        PrintService <Integer> ps = new PrintService<>();

        System.out.println("How many values?");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++){
            int value = sc.nextInt();
            ps.addValue(value);
        }

        ps.print();
        System.out.print("First: " + ps.first());

        sc.close();
    }
}
