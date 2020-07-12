package test;

public class Exercise7_1 {
    public static int[] arraySeries(int lenght, int firstNumbers, int gap){
        int[] array = new int[lenght];
        array[0] =firstNumbers;
        for (int i =1; i < lenght; i++){
            array[i] = array[i-1] + gap;
        }
        return array;
    }

    public static void main(String[] args) {
        int[] result = arraySeries(4,1,2);
        Exercise6_1.tablePrinter(result);
    }

}
