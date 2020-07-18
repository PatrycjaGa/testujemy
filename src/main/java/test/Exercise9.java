package test;

import org.w3c.dom.ls.LSOutput;

public class Exercise9 {
    public static void modulo(int divident, int divisor){
        int remainder =0;
        if (divident !=0 && divisor !=0){
            remainder = divident - divisor*(divident/divisor);
    }
        System.out.println("Reszta z dzielenia liczb " + divident + " i " + divisor + " wynosi " + remainder);
    }

    public static void main(String[] args) {
        modulo(10,4);

    }
}
