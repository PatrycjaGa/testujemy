package test;

public class Exercise5 {
    public static void main(String[] args) {
        int [] numbers = {5,9,55,6,4,2,7};
        int min = numbers[0];
        int max = numbers[0];
        for (int i = 0; i <= numbers.length -1; i++){
            if (min > numbers[i]){
                min = numbers[i];
            }
            if (max < numbers[i]){
                max = numbers[i];
            }
        }
        System.out.println("min:" + min + ", max: " +max);
    }
}
