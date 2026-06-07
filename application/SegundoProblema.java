package application;

import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class SegundoProblema {
    public static void main(String[]args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter product data:");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Price: ");
        double price = sc.nextDouble();
        int quantity = sc.nextInt();

        Product product = new Product(name, price);

        System.out.println();
        System.out.println("Product data:" + product);

        System.out.println();
        System.out.print("Enter the number of products to be added in stock: ");
        int qunatity = sc.nextInt();
        product.addProducts(qunatity);

        System.out.println();
        System.out.println("Updated data:" + product);

        System.out.println();
        System.out.print("Enter the number of products to be removed from stock: ");
        qunatity = sc.nextInt();
        product.removeProducts(qunatity);

        sc.close();
    }

}
