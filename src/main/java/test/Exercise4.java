package test;

public class Exercise4 {
    public static void main(String[] args) {
        int[] firstNumbers = {12, 7, 19};
        int[] exchangeNumbers = new int[3];
        for (int i = 0; i < exchangeNumbers.length; i++) {
            exchangeNumbers[i] = firstNumbers[(exchangeNumbers.length - i - 1)];
            System.out.println(exchangeNumbers[i]);
        }
    }
}
