package test.sda3;

import lombok.Getter;

@Getter
public class Triangle {
    private double height;
    private double basis;

    public Triangle(double height, double basis) {
        this.height = height;
        this.basis = basis;
    }

    public double getArea(){
        double area = 0.5 * getHeight() * getBasis();
        return area;
    }
}
