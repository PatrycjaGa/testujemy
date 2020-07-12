package test;

public class Exercise6_1 {
    public static int getNegative(int[] numbers) {
        int counter = 0;
        for (int number : numbers) {
            if (number < 0) counter++;
        }
        return counter;
    }

    public static int[] storeNegative(int[] numbers) {
        int size = getNegative(numbers);
        int[] negativesArray = new int[size];
        int iterator = 0;
        for (int number : numbers) {
            if (number < 0) {
                negativesArray[iterator] = number;
                iterator++;
            }
        }
        return negativesArray;
    }

    public static void tablePrinter(int[] array) {
        for (int index : array) {
            System.out.print("[" + index + "] ");
        }

        System.out.println("");
    }

    public static void main(String[] args) {
        int[] numbers = {-5, 1, 8, -2};
        tablePrinter(numbers);
        int[] negativeNumbers = storeNegative(numbers);
        tablePrinter(negativeNumbers);
    }

}
