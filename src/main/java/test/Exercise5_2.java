package test;

public class Exercise5_2 {

    public static void getMinAndMAxValueFromArray(int[] numbers) {
        if (numbers.length > 0) {
            int min = numbers[0];
            int max = numbers[0];
            for (int number : numbers){
                if (number > max){
                    max = number;
                }
                if (number < min) min = number;
            }
            System.out.println("Min: " + min + " Max: " + max);
        }
    }

    public static void main(String[] args) {
        int [] numbers = {99, 1, 8, -2};
        getMinAndMAxValueFromArray(numbers);

    }
}
