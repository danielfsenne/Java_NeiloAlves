package application;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Colors;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class MetodosAbstratos {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        List<Shape> list = new ArrayList<>();

        System.out.print("Enter the number of shapes: ");
        int n = sc.nextInt();

        for (int i=1; i<=n; i++){
            System.out.println("Shape #" + i + "data: ");
            System.out.print("Rectangle or Circle(r/c): ");
            char ch = sc.next().charAt(0);
            System.out.print("Color (BLACK/BLUR/RED): ");
            Colors colors = Colors.valueOf(sc.next());
            if (ch == 'r'){
                System.out.print("Width:");
                double width = sc.nextDouble();
                System.out.print("Height: ");
                double height = sc.nextDouble();
                list.add(new Rectangle(colors, height, width));
            }else {
                System.out.print("Radius: ");
                double radius = sc.nextDouble();
                list.add(new Circle(colors, radius));
            }
        }

        System.out.println();
        System.out.println("Shape Areas: ");
        for (Shape shape : list){
            System.out.println(shape.area());
        }

        sc.close();
    }
}
