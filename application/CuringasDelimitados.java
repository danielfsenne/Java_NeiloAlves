package application;

import entities.Circles;
import entities.Rectangles;
import entities.Shapes;

import java.util.ArrayList;
import java.util.List;

public class CuringasDelimitados {
    public static void main(String [] args){
        List<Shapes> myShapes = new ArrayList<>();
        myShapes.add((Shapes) new Rectangles(3.0, 2.0));
        myShapes.add((Shapes) new Circles(2.0));

        List<Circles> myCircles = new ArrayList<>();
        myCircles.add(new Circles(2.0));
        myCircles.add(new Circles(3.0));

        System.out.println("Total area: " + totalArea(myShapes));
    }

    public static double totalArea(List<? extends Shapes> list){
        double sum = 0.0;
        for (Shapes s : list){
            sum += s.area();
        }
        return sum;
    }

}
