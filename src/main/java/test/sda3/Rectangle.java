package test.sda3;

import lombok.Getter;

@Getter
public class Rectangle {

    private double height;
    private double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public  double getArea(){
        double area = getHeight() * getWidth();
        return area;
    }
}
