package test;

public class ModuloTest {

    public static void moduloTesting(int parametr1, int paramter2) {
        int remainder = 0;
        int modulo = parametr1 % paramter2;
        System.out.println("Wynik funkcji wbudowanej modulo: " + modulo);
        if (parametr1 != 0 && paramter2 != 0) {
            remainder = parametr1 - paramter2 * (parametr1 / paramter2);
            System.out.println("Wynik funkcji napisanej modulo: " + remainder);
        }
        if (modulo == remainder){
            System.out.println("Funkcje zwracją tą samą wartość reszty");

        }else
        System.out.println("Funkcje nie zwraca tej samej reszty");


    }

    public static void main(String[] args) {
        moduloTesting(10,5);

    }
}
