package test;

import java.util.Arrays;

public class Exercise5_1 {

    public  static void getMinAndMAxValueFromArray(int[] numbers){
        int min = Arrays.stream(numbers).min().getAsInt();
        int max = Arrays.stream(numbers).max().getAsInt();
        System.out.println(min);
        System.out.println(max);

    }

    public static void main(String[] args) {
        int [] numbers = {99, 1, 8, -2};
        getMinAndMAxValueFromArray(numbers);
    }
}
