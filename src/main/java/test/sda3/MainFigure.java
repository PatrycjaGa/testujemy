package test.sda3;

import test.sda3.Circle;
import test.sda3.Rectangle;
import test.sda3.Triangle;

public class MainFigure {
    public static void main(String[] args) {
        System.out.println(resultOfRectangle());;
        System.out.println(resultOfCircle());
        System.out.println(resultOfTriangle());
        System.out.println("Suma figur " + sum());
        System.out.println("Figury zostaną pokryte farbą: " + canPaint(5000.55));
            }

    public static double resultOfRectangle(){
        Rectangle rectangle1 = new Rectangle(45.5, 52.5);
        double resultRectangle = rectangle1.getArea();
        return resultRectangle;
    }

    public static double resultOfCircle(){
        Circle circle1 = new Circle(5.2);
        double resultCircle = circle1.getArea();
        return resultCircle;
    }

    public static double resultOfTriangle(){
        Triangle triangle1 = new Triangle(15.0, 5.0);
        double resultTriangle = triangle1.getArea();
        return resultTriangle;
    }

    public static double sum(){
        double sumOfFigure = resultOfRectangle() + resultOfCircle() + resultOfTriangle();
        return sumOfFigure;
    }

    public static boolean canPaint(double surface){
        boolean result;
        if (sum() <= surface){
            result = true;
        }else {
            result = false;
        }
            return result;

    }
}
