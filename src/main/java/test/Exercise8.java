package test;

public class Exercise8 {
    public static boolean isArithmetic(int[] arrayArithmetic){
        if (arrayArithmetic.length < 2) {
            return false;
        }
        boolean isCorrect = true;
        int gap = arrayArithmetic[1] - arrayArithmetic[0];
        for (int i= 2; i < arrayArithmetic.length; i++){
            int actualGap = arrayArithmetic[i] - arrayArithmetic[i-1];
            if (actualGap != gap){
                isCorrect = false;
                break;
            }
        }

      return isCorrect;
    }

    public static void main(String[] args) {
        int[] arrayIsNotCorect = {4, 52, 4, 7};
        int[] arrayIsCorect = {1, 5, 9, 13};
        Exercise6_1.tablePrinter(arrayIsCorect);
        boolean result = isArithmetic(arrayIsCorect);
        System.out.println(result);
    }

}
