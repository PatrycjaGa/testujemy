package test;

public class Exercise1 {

    public static void multiplicationTable(int number1, int range) {
        int result = 0;
        for (int i = 1; i <= range; i++) {
            result = number1 * i;
            System.out.println(""+ i + " * " + number1+ " = " + result);

        }

    }

    public static void main(String[] args) {
        multiplicationTable(5,6);
    }

}
