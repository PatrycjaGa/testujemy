package test;

import org.w3c.dom.ls.LSOutput;

public class Exercise9 {
    public static void modulo(int parametr1, int paramter2){
        int remainder =0;
        if (parametr1 !=0 && paramter2 !=0){
            remainder = parametr1 - paramter2*(parametr1/paramter2);
    }
        System.out.println("Reszta z dzielenia liczb " + parametr1 + " i " + paramter2 + " wynosi " + remainder);
    }

    public static void main(String[] args) {
        modulo(10,4);

    }
}
