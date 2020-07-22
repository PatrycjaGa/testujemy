package test.sda3;

public class Circle {

    private double radius;
    public final static double NUMBER_PI = Math.PI;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        double area = radius * radius * NUMBER_PI;
        return area;
    }
}
