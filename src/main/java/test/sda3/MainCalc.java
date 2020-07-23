package test.sda3;

public class MainCalc {
    public static void main(String[] args) {
        MyNumber myNumberFirst = new MyNumber(20,5);
        Complex complex = new Complex(5,4,"i");
        Calculator.add(complex.getIm(),complex.getRe(),complex.getI());
        System.out.println(Calculator.add(complex.getIm(),complex.getRe(),complex.getI()));
    }
}
