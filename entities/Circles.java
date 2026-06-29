package entities;

public class Circles implements Shapes {
    private double radius;

    public Circles(double radius){
        super();
        this.radius = radius;
    }
    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
        public double area(){
            return Math.PI * radius * radius;
    }
}
