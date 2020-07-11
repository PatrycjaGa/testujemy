package test;

public class Exercise6 {
    public static void main(String[] args) {
        int[] numbers = {5, -5, 6, -8, -7, 1, -1};
        int[] minusNumbers = new int[7];
        int j = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {

                minusNumbers[j] = numbers[i];
                System.out.println(minusNumbers[j]);
                j++;
            }

        }
    }
}

