package test.collection;

import test.Exercise6_1;

public class Exe1 {

    public static int[] tenElementsArrays() {
        int[] newArray = new int[10];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = i + 1;
        }
        return newArray;
    }

    public static void arrayMultiplication(int[] array) {
        for (int index : array) {
            System.out.print("[" + 2 * index + "] ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        Exercise6_1.tablePrinter(tenElementsArrays());
        System.out.println(tenElementsArrays().length);
        arrayMultiplication(tenElementsArrays());
    }
}
